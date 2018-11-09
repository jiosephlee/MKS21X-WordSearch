import java.util.random;
import java.util.scanner;
import java.util.arraylist;
import java.io.file;
import java.io.filenotfoundexception;

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

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param row is the starting height of the WordSearch
     *@param col is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      if (rows < 0 || cols < 0){
        throw new IllegalArgumentException();
      }
      data = new char[rows][cols];
      clear();
    }
    public WordSearch( int rows, int cols, String fileName){}
    public WordSearch( int rows, int cols, String fileName, int randSeed){}

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int x =0; x < data.length ; x++ ) {
        for (int y= 0; y < data[x].length ; y++ ) {
          data[x][y] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String output = "";
      for (int x =0; x < data.length ; x++ ) {
        for (int y= 0; y < data[x].length ; y++ ) {
          output += data[x][y] + ' ';
        }
        output += "\\n";
      }
      return output;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
      if(row > data.length -1 || row < 0 || col < 0 || col > data[row].length - word.length()){
        return false;
      }
      boolean canAdd = true;
      for (int x = 0;x < word.length() ; x++ ) {
        if(!(data[row][col + x] == '_' || data[row][col + x] == word.charAt(x))){
            canAdd = false;
            return false;
        }
      }
      for (int x = 0;x<word.length() ;x++ ) {
          data[row][col + x] = word.charAt(x);
      }
      return true;
    }

   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word,int row, int col){
      if(row > data.length - word.length()|| row < 0 || col < 0 || col > data[0].length - 1){
        return false;
      }
      boolean canAdd = true;
      for (int x = 0;x<word.length() ;x++ ) {
        if(!(data[row + x][col] == '_' || data[row + x][col] == word.charAt(x))){
            canAdd = false;
            return false;
        }
      }
      for (int x = 0;x<word.length() ;x++ ) {
        data[row + x][col] = word.charAt(x);
      }
      return true;
    }
    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left to bottom right, must fit on the WordGrid,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      if(row > data.length - word.length()|| row < 0 || col < 0 || col > data[0].length - word.length()){
        return false;
      }
      for (int x = 0; x < word.length() ; x++ ) {
        if(!(data[row + x][col + x] == '_' || data[row + x][col + x] == word.charAt(x))){
            return false;
        }
      }
      for (int x = 0; x < word.length() ; x++ ) {
        data[row + x][col + x] = word.charAt(x);
      }
      return true;
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
    }

    /*[rowIncrement,colIncrement] examples:
     *[-1,1] would add up and the right because (row -1 each time, col + 1 each time)
     *[ 1,0] would add downwards because (row+1), with no col change
     *[ 0,-1] would add towards the left because (col - 1), with no row change
     */

}
