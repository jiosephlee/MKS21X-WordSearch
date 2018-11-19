import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class driver{
  public static void main(String[] args) {
      WordSearch output = new WordSearch(10,10);
      System.out.println(output);
      output.addWord("yolo",5,5,1,1);
      System.out.println(output);
      output.addWord("yolo",6,6,-1,0);
      System.out.println(output);
      output.addWord("yosd",8,9,0,1);
      System.out.println(output);

  }
}
