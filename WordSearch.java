import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static void main(String[] args){
      //handle main arguments
      if (args.length < 3){

      }
      String[] newArgs = new String[5];
      for (int x = 0;  x < args.length; x++){
        newArgs[x]=args[x];
      }
      if (args.length < 5){
        newArgs[4] = "nokey";
        if (args.length < 4){
          Random rng = new Random();
          newArgs[3] = Integer.toString(rng.nextInt(10001));
        }
      }
      try{
        WordSearch output = new WordSearch(Integer.parseInt(newArgs[0]),Integer.parseInt(newArgs[1]),newArgs[2],Integer.parseInt(newArgs[3]),newArgs[4]);
        System.out.println(output);
      } catch (FileNotFoundException e) {
        printError();
      }
    }

    public WordSearch( int rows, int cols, String fileName, int randSeed, String ans) throws FileNotFoundException{

      seed = randSeed;
      wordsToAdd = new ArrayList<String>();
      wordsAdded = new ArrayList<String>();
      randgen = new Random(seed);
      data = new char[rows][cols];
      clear();
      extractText(fileName);
      addAllWords();
    }
    public WordSearch( int rows, int cols){

      data = new char[rows][cols];
      clear();

    }
    public void extractText(String filename) throws FileNotFoundException{
        File f = new File(filename);
        Scanner words = new Scanner(f);
        while(words.hasNext()){
          String line = words.nextLine().toUpperCase();
          wordsToAdd.add(line);
      }
    }

    public static void printError(){
      System.out.println("An error has occured. \\n 1. Please make sure at least 3 command line arguments are specified when running the program. \\n 2. The file that is called exists within the same directory of the program file. \\n 3. All numerical arguments are properly formatted and in range. row and col should be positive and the ranged of the seed should be between 0 and 10,000 (inclusive).");
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
      if(row + (rowIncrement * word.length()) < 0 || col + (colIncrement * word.length()) < 0 || row + (rowIncrement * word.length()) > data.length || col + (colIncrement * word.length()) > data[0].length || (rowIncrement == 0 && colIncrement == 0)){
        return false;
      }
      for (int x = 0; x < word.length() ; x++ ) {
        if (data[row + (x * rowIncrement)][col + (x * colIncrement)] == ' '){
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
       for (int x = -1; x < 2; x++){
         for(int y = -1; y < 2; y++){
           if (!(x == 0 && y == 0)){
             int[] dir = {x,y};
             directions.add(dir);
           }
         }
       }
       int prevcol = 1;
       int prevrow = 0;
       int[] previous = new int[2];
       for (int x = 0; x < amount; x++){
         previous[0] = prevrow;
         previous[1] = prevcol;
         System.out.println(directions.remove(previous));
         for (int i = 0; i < directions.size(); i++){
           System.out.print(Arrays.toString(directions.get(i)));
         }
         String Toadd = wordsToAdd.get(Math.abs(randgen.nextInt()) % wordsToAdd.size());
         int randcoldir = directions.get(randgen.nextInt(directions.size()))[1];
         prevcol = randcoldir;
         int randrowdir = directions.get(randgen.nextInt(directions.size()))[0];
         prevrow = randrowdir;
         added = false;
         for (int i = 0; i < 100 && !added; i++){
           int randcol = randgen.nextInt(data[0].length);
           int randrow = randgen.nextInt(data.length);
           added = addWord(Toadd,randrow,randcol,randrowdir,randcoldir);
           //System.out.println(Toadd + i);
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
