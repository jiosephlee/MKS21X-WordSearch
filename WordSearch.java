import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class WordSearch{
    private char[][]data;

    //the random seed used to produce this WordSearch
    private int seed;

    //a random Object to unify your random calls
    private Random randgen;

    //all words from a text file get added to wordsToAdd, indicating that they have not yet been added
    private ArrayList<String>wordsToAdd;

    //all words that were successfully added get moved into wordsAdded.
    private ArrayList<String>wordsAdded;


    public WordSearch( int rows, int cols, String fileName){
      Random rng = new Random();
      seed = rng.nextInt() % 1000;
      randgen = new Random(seed);
      data = new char[rows][cols];
      clear();
      extractText(fileName);
      addAllWords();
    }

    public void extractText(String filename){
      try{
        File f = new File(filename);
        Scanner words = new Scanner(f);
        while(words.hasNext()){
          wordsToAdd.add(words.next().toUpperCase());
        }
      }catch(FileNotFoundException e){
        System.out.println("File not found: " + filename);
        System.exit(1);
      }
    }

    public WordSearch( int rows, int cols, String fileName, int randSeed){
      seed = randSeed;
      randgen = new Random(seed);
      data = new char[rows][cols];
      clear();
      try{
        File f = new File(fileName);
        Scanner words = new Scanner(f);
        while(words.hasNext()){
          wordsToAdd.add(words.next().toUpperCase());
        }
      }catch(FileNotFoundException e){
        System.out.println("File not found: " + fileName);
        System.exit(1);
      }
      addAllWords();
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int x =0; x < data.length ; x++ ) {
        for (int y= 0; y < data[x].length ; y++ ) {
          data[x][y] = ' ';
        }
      }
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added in the direction rowIncrement,colIncrement
     *Words must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@param rowIncrement is -1,0, or 1 and represents the displacement of each letter in the row direction
     *@param colIncrement is -1,0, or 1 and represents the displacement of each letter in the col direction
     *@return true when: the word is added successfully.
     *        false when: the word doesn't fit, OR  rowchange and colchange are both 0,
     *        OR there are overlapping letters that do not match
     */
    public boolean addWord(String word,int row, int col, int rowIncrement, int colIncrement){
      if(row < 0 || col < 0 || row > data.length - word.length()|| col > data[0].length - word.length() || (rowIncrement == 0 && colIncrement == 0)){
        return false;
      }
      for (int x = 0; x < word.length() ; x++ ) {
        if (data[row + (x * rowIncrement)][col + (x * colIncrement)] == '_'){
          data[row + (x * rowIncrement)][col + (x * colIncrement)] = word.charAt(x);
        } else if(data[row + (x * rowIncrement)][col + (x * colIncrement)] != word.charAt(x)){
          return false;
        }
      }
      return true;
    }

    /*[rowIncrement,colIncrement] examples:
     *[-1,1] would add up and the right because (row -1 each time, col + 1 each time)
     *[ 1,0] would add downwards because (row+1), with no col change
     *[ 0,-1] would add towards the left because (col - 1), with no row change
     */
     public void addAllWords(){
       boolean added = false;
       int amount = wordsToAdd.size();
       ArrayList<int[]> directions = new ArrayList<int[]>();
       for (int x = -1 , y = 1; x < 2; x++ , y--){
         if (x != y){
           int[] dir = {x,y};
           directions.add(dir);
         }
       }
       int prevcol = 0;
       int prevrow = 0;

       for (int x = 0; x < amount; x++){
         int[] previous = {prevcol,prevrow};
         directions.remove(previous);
         String Toadd = wordsToAdd.get(randgen.nextInt() % wordsToAdd.size());
         int randcoldir = directions.get(randgen.nextInt(directions.size()))[1];
         prevcol = randcoldir;
         int randrowdir = directions.get(randgen.nextInt(directions.size()))[0];
         prevrow = randrowdir;
         added = false;
         for (int i = 0; i < 100 && !added; i++){
           int randcol = randgen.nextInt(data[0].length);
           int randrow = randgen.nextInt(data.length);
           added = addWord(Toadd,randrow,randcol,randrowdir,randcoldir);
         }
         if (added){
           wordsAdded.add(Toadd);
           wordsToAdd.remove(Toadd);
         }
         directions.add(previous);
       }
     }

     public String toString(){
       String output = "";
       for (int x = 0; x < data.length; x++) {
         output += "|";
         for (int i = 0; i < data[x].length ;i++) {
           output += data[x][i] + " ";
         }
         output = output.substring(0,output.length() - 1) + "|\n";
       }
       output += "Words: ";
       for (int i = 0; i < wordsAdded.size(); i++) {
         output += wordsAdded.get(i) + ", ";
       }
       output = output.substring(0,output.length()-2);
       return output;
     }
}
