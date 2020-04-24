import java.util.Scanner;
/*
* This class was created for an assignment for Java Bootcamp
* It demonstrates various scenarios useful for loops
* Kim Levin
* 04/23/2020
*/
public class MoreLoops {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int input;

      //Prompt user for a number, display cube of all numbers
      //   up to the inputted number
      System.out.print("Enter an integer value to be cubed ");
      input = keyboard.nextInt();
      printCubes(input);

      //Prompt user for a number, display the multiplication
      //   for that number up to 10
      System.out.print("Enter an integer value for multiplication ");
      System.out.print("table ");
      input = keyboard.nextInt();
      multiplicationTable(input);

      //Prompt user for a integer, display the odd
      //   numbers up to that integer
      System.out.print("Enter an integer value for totaling ");
      System.out.print("the odd values ");
      input = keyboard.nextInt();
      totalTheOddValues(input);

      //Prompt user for a integer, display the even
      //   numbers up to that integer
      System.out.print("Enter an integer value for totaling ");
      System.out.print("the even values ");
      input = keyboard.nextInt();
      totalTheEvenValues(input);

      //Prompt user for a integer, display the numbers up to that integer
      //   pattern of display is multiple lines in ascending order 
      //   & appending current number on previously visited numbers
      System.out.print("Enter an integer value for upper limit ");
      input = keyboard.nextInt();
      leftJustAppend(input);

      //Prompt user for a integer, display the numbers up to that integer
      //   pattern of display is multiple lines in ascending order 
      //   with a string of duplicate characters on each line
      System.out.print("Enter an integer value for upper limit ");
      input = keyboard.nextInt();
      leftJustAscend(input);

      //Prompt user for a integer, display the numbers up to that integer
      //   pattern of display is multiple lines in ascending order 
      //   with each numeric value in string 1 greater than the previous
      System.out.print("Enter an integer value for upper limit ");
      input = keyboard.nextInt();
      leftJustIncrement(input);

      //Prompt user for a integer, display rows of strings
      //   that contain alternating 0's and 1's
      //   the inputted integer value determines the number of rows
      System.out.print("Enter an integer value for the number of rows ");
      input = keyboard.nextInt();
      justZerosAndOnes(input);

      //Prompt user for a integer and determine if it's a palindrome
      System.out.print("Enter an integer value for palindrome check ");
      input = keyboard.nextInt();
      palindromeCheck(input);

      //Sum all integers between 100 and 200 that are divisible by 9
      System.out.print("Summing all integers between 100 and 200 ");
      System.out.println("that are divisible by 9");
      sumFrom100To200();
   }

   //Print cubes of values from the beginning
   //   up to passed parameter
   static void printCubes(int val) {
      int cubeVal = 0;
      for ( int i = 1; i <=  val; i++){
         cubeVal = i*i*i;
         System.out.printf("%s\t\t%s\n",i,cubeVal);
      }
      System.out.println();
   }

   //Print a multiplication table from 1 to 10
   //   using number passed in as parameter
   static void multiplicationTable(int val) {
      int product = 0;
      for ( int i = 1; i <= 10 ; i++){
         product = i*val;
         System.out.printf("%s\t\t%s\n",i,product);
      }
      System.out.println();
   }

   //Print a odd numbers from 1 to the number passed in as parameter
   //   and calculate the sum of these odd numbers
   static void totalTheOddValues(int val) {
      int sum = 0;
      for ( int i = 1; i <= val ; i++){
         if (i%2 > 0) {
            System.out.printf("%s\n",i);
            sum += i;
         }
      }
      System.out.printf("The sum of these odd numbers is %d\n",sum);
      System.out.println();
   }

   //Print a even numbers from 1 to the number passed in as parameter
   //   and calculate the sum of these even numbers
   static void totalTheEvenValues(int val) {
      int sum = 0;
      for ( int i = 1; i <= val ; i++){
         if (i%2 == 0) {
            System.out.printf("%s\n",i);
            sum += i;
         }
      }
      System.out.printf("The sum of these even numbers is %d",sum);
      System.out.println();
   }

   //Print numbers from 1 to the number passed in as parameter
   //   Format will be on multiple lines in assending order
   //   The current number will be appended to previously visited numbers
   static void leftJustAppend(int val) {
      String valueStr = "";
      for ( int i = 1; i <= val ; i++){
         valueStr = valueStr.concat(Integer.toString(i));
         valueStr = valueStr.concat(" ");
         System.out.println(valueStr);
      }
   }

   //Print numbers from 1 to the number passed in as parameter
   //   Format will be on multiple lines in ascending order
   //   Each line will be a string of the duplicate characters
   //   These characters are the current value (i.e - Line 2 = "22")
   //   (i.e cont'd - Line 3 = "333")
   static void leftJustAscend(int val) {
      String printString = "";
      for ( int i = 1; i <= val ; i++){
         printString = "";
         for ( int j = 1; j <= i; j++) {
            printString = printString.concat(Integer.toString(i));
            printString = printString.concat(" ");
         }
         System.out.println(printString);
      }
   }

   //Print numbers from 1 to the number passed in as parameter
   //   Format will be on multiple lines in ascending order
   //   Each line will be a string of the numeric values
   //   whose value is 1 greater than the previous (i.e - Line 2 = "23")
   //   (i.e cont'd - Line 3 = "456")
   static void leftJustIncrement(int val) {
      String printString = "";
      int counter = 1;
      for ( int i = 1; i <= val ; i++){
         printString = "";
         for ( int j = 1; j <= i; j++) {
            printString = printString.concat(Integer.toString(counter));
            printString = printString.concat(" ");
            counter++;
         }
         System.out.println(printString);
      }
   }

   //Print strings of alternating 0's and 1's in rows
   //The number and length of the rows is equal to the passed parameter
   //Ex. - Line 1 = "1", Line 2 = "01", Line 3 = "010"...
   static void justZerosAndOnes(int val) {
      String printString = "";
      String tempString = "";
      int print_num;
      for ( int i = 1; i <= val ; i++){
         if (printString == "") {
            print_num = 1;
         } else if (printString.charAt(0) == '1') {
            print_num = 0;
         } else {
            print_num = 1;
         }
         tempString = "";
         for ( int j = 1; j <= i; j++) {
            printString = Integer.toString(print_num).concat(printString);
            printString = printString.concat(" ");
            print_num = (print_num == 0)? 1: 0;
         }
         System.out.println(printString);
         printString = "";
      }
   }

   //Determing if integer passed as a parameter is a palindrome
   static void palindromeCheck(int val) {
      int tempIntValue;
      int intLength = Integer.toString(val).length();
      String tempString = "";
      for ( int i = intLength - 1; i >= 0 ; i--){
         tempString += Integer.toString(val).charAt(i);
      }
      tempIntValue = Integer.parseInt(tempString);
      if (val == tempIntValue) {
         System.out.println(val + " is a palindrome");
      } else {
         System.out.println(val + " is NOT a palindrome");
      }
   }

   //Summing all integers between 100 and 200 that are divisible by 9
   static void sumFrom100To200() {
      int sum = 0;
      for (int i = 100; i <= 200; i++ ) {
         if (i%9 == 0) {
            sum += 9;
            System.out.println(i + " is divisible by 9");
         }
      }
      System.out.print("The sum of all numbers between 100 & 200 ");
      System.out.println("that are divisible by 9 is " + sum);
   }
}
