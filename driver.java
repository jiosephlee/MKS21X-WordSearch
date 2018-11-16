import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class driver{
  public static void main(String[] args) {
    try{
      WordSearch output = new WordSearch(10,10,"words.txt",100,"key");
      System.out.println(output);
    } catch (FileNotFoundException e){
      System.out.println("Yo");
    }
  }
}
