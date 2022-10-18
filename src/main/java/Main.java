import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    while(true) {
      System.out.println("Enter either add, subtract, multiply, divide, Fibonacci or binary and enough numbers or exit to leave");
      Scanner scanner = new Scanner(System.in);
      String n = scanner.nextLine();
      n.toLowerCase();
      String[] commands = n.split(" ");
      if (commands[0].equals("exit")){
        break;
      }
      switch (commands[0]){
        case "add":
          System.out.println(calculator.add(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
          continue;
        case "subtract":
          System.out.println(calculator.subtract(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
          continue;
        case "multiply":
          System.out.println(calculator.multiply(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
          continue;
        case "divide":
          System.out.println(calculator.divide(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
          continue;
        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(commands[1])));
          continue;
        case "binary":
          System.out.println(calculator.intToBinaryNumber(Integer.parseInt(commands[1])));
          continue;
      }
    }
  }
}
