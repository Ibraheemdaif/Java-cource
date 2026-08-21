import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
    ===================================================================
                         Exception Handling
    ===================================================================
*/
public class Main {
  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


//    ===================================================================
//                         Handle ArithmeticException
//    ===================================================================

//    int num1 , num2;
//    System.out.println("Enter two numbers for dividing : ");
//    num1 = scanner.nextInt();
//    num2 = scanner.nextInt();
//    try {
//      System.out.println(divideTwoNumbers(num1, num2));
//    } catch (ArithmeticException e) {
//      System.out.println(e.toString());
//    }

//    ===================================================================
//                         Handle NumberFormatException
//    ===================================================================

//    int num = 0;
//    try {
//        num = Integer.parseInt("ibraheem");
//    } catch (NumberFormatException e) {
//        System.out.println(e.toString());
//    }
//    System.out.println(num);
//    ===================================================================
//                         Handle NullPointerException
//    ===================================================================

//    String name = null;
//    try {
//      System.out.println(name.length());
//
//    } catch (NullPointerException e) {
//      System.out.println(e.getMessage());
//    }

//    ===================================================================
//                         Handle ArrayIndexOutofBoundException
//    ===================================================================

//    int []nums = new int[5];
//    try {
//      nums[5] = 10;
//    } catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println(e.toString());
//    }

//    ====================================================================
//              Handle FileNotFoundException +
//    ====================================================================

//      try {
//            FileReader reader = new FileReader("C:\\Users\\leader\\Documents\\JavaTasks\\level-1\\Exception Handling\\ExceptionHandling\\src\\test.text");
//      } catch (FileNotFoundException fne) {
//          System.out.println(fne.toString());
//      }
//    ===================================================================
//                         Handle Multiple catch Blocks
//    ===================================================================
//      int n = 0;
//      try {
//          n = Integer.parseInt("Pure text");
//          System.out.println(10 / 0);
//      } catch (NumberFormatException npe) {
//          System.out.println(npe.toString());
//      } catch (ArithmeticException ae) {
//          System.out.println(ae.toString());
//          System.out.println("2");
//      }

//    ===================================================================
//                         Handle custom Exception (InvalidAge)
//    ===================================================================

//      System.out.println("Age = " + getAge(5));

//    ===================================================================
//                         Propagate Exception
//    ===================================================================
//      isPositive(-1);
//    ===================================================================
//                               Task 10
//    ===================================================================
//      try {
//          readFile("C:\\Users\\leader\\Documents\\JavaTasks\\level-1\\Exception Handling\\ExceptionHandling\\src\\test.text");
//
//      }catch (IOException ioe) {
//          System.out.println(ioe.toString());
//      }
//    ===================================================================
//                               Task 11
//    ===================================================================
//      finallyTest1();
//      System.out.println(finallyTest2());
//    ===================================================================
//                               Task 12
//    ===================================================================
//      try {
//          System.out.println("Outer try block starts...");
//
//          try {
//              System.out.println("Inner try block starts...");
//              int result = 10 / 0;
//
//          } catch (NullPointerException npe) {
//              System.out.println("Inner catch block: " + npe.toString() );
//          }
//      } catch (ArithmeticException ae) {
//          System.out.println("Outer catch block: " + ae.toString() );
//      }
    scanner.close();
  }

// =========================================================================================================

// task 1
static int divideTwoNumbers(int num1 , int num2) {
        return num1 / num2;
}
// task 7
static void setAge(int age) throws InvalidAgeException {
      if (age < 18)
          throw new InvalidAgeException ("Invalid age : your age must be greater than 18.");

}

// task 9
static boolean validate(int number) throws InvalidNumberException {
      if (number < 0)
          throw new InvalidNumberException("Invalid number.");
      else
          return true;
}

static void isPositive(int number) {
      try {
            if (validate(number))
                System.out.println("The number is positive");


      } catch (InvalidNumberException ine) {
          System.out.println(ine.toString());
      }
}

// task 10
static void readFile(String filePath) throws IOException {
      FileReader reader = new FileReader(filePath);
      int r = 0;
      while ((r = reader.read()) != -1) {
          System.out.print((char) r);
      }

}

// task 11
static void finallyTest1() {
      try {
          int result = 10 / 0;
      } catch (ArithmeticException ae) {
          System.out.println(ae.toString());
      }finally {
          System.out.println("Finally : This always excutes ");
      }
}

static int finallyTest2(){
      try {
          return 1;
      } catch (Exception e) {
          return 2;
      }finally{
          return 3;
      }
}



}