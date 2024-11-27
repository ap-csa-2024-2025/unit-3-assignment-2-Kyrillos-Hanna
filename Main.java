import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a double: ");
    double num1 = sc.nextDouble();
    isEqual12345(num1);

    System.out.println("Please enter an Integer: ");
    int num2 = sc.nextInt();
    isEqual48(num2);

    System.out.println("Please enter two Integers: ");
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    isEqualDouble(num3, num4);

    System.out.println("Please enter an integer: ");
    int num5 = sc.nextInt();
    divisibleBy2or3(num5);

    System.out.println("Please enter an integer: ");
    int num6 = sc.nextInt();
    evenOrOdd(num6);

    System.out.println("Please enter a letter grade: ");
    sc.nextLine();
    String letter = sc.nextLine();
    gradeRange(letter);

    int num7 = (int) (Math.random() * 51);
    int num8 = (int) (Math.random() * 50 + 51);
    System.out.println(num7 + " + " + num8 + " = ?");
    int answer = sc.nextInt();
    addition(answer, num7, num8);

    System.out.println("What is the temperature?");
    int temperature = sc.nextInt();
    temperatureSensor(temperature);

    sc.close();

  }

  public static void isEqual12345(double num) {
    if (num == 12.345) {
      System.out.println("YES");
    }
  }

  public static void isEqual48(int num) {
    if (num == 48) {
      System.out.println("YES");     
    }
  }

  public static void isEqualDouble(int num1, int num2) {
    if (num2 == (num1 * 2)) {
      System.out.println("YES");
    }
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
      System.out.println("90-100");
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

  public static void addition(int guess, int firstNum, int secondNum) {
    if (firstNum + secondNum == guess) {
      System.out.println("Correct!");
    } else {
      System.out.println("Wrong");
    }
  }

  public static void temperatureSensor(int temp) {
    if (temp >= 97 && temp <= 99) {
      System.out.println("Temperature is OK");
    } else {
      System.out.println("NOT NORMAL");
    }
  }
}
