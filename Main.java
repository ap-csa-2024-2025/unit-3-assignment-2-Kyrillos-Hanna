import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
  }

  public static boolean isEqual12345(double num) {
    return (num == 12.345);
  }

  public static boolean isEqual48(int num) {
    return (num == 48);
  }

  public static boolean isEqualDouble(int num1, int num2) {
    return (num2 == (num1 * 2));
  }

  public static void divisibleBy2or3(int num1) {
    if(num1 % 2 == 0) {
      System.out.println("Divisible by 2!");
    }

    if(num1 % 3 == 0) {
      System.out.println("Divisible by 3!");
    }
  }

  public static void evenOrOdd(int num1) {
    if (num1 % 2 == 1) {
      System.out.println("Odd");
    } else {
      System.out.println("Even");
    }
  }

  public static void gradeRange(String letter) {
    if (letter.equals("A")) {
      System.out.println(90-100);
    } else if (letter.equals("B")) {
      System.out.println("80-90");  
    } else if (letter.equals("C")) {
      System.out.println("70-80");
    } else if (letter.equals("D")) {
      System.out.println("60-70");
    } else if (letter.equals("F")) {
      System.out.println("0-60");
    } else {
      System.out.println("Invalid Letter Grade");
    }
  }

  public static void addition() {

  }
}
