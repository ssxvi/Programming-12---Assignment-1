//Title
/*
Mathamagic - Programming 12
@Trevor Liu - Block 3
@November 26 2020
*/

//Program summary
/*
This program uses basic arithmetic sequences to turn any input number into the number 3. Also maybe fails if 0 is input but that's just the magic part.
*/

//Key Elements Used
/*
Arithmetic Operators (+, -, *, /)
Scanner object Used
Try/Catch statement
Exception E
Methods
*/
//Import the Scanner library
import java.util.Scanner;


//Main Class
public class Magic{

  //Calculate function
  /*
  Calculates usernumber using our operators 

  Parameter
  myNumber {Double} - The user input

  Returns
  stepSix {Double} - Input after the changes

  */
  public double calculate(double myNumber){

    double stepOne = myNumber*myNumber; //multiplies inputs twice
    double stepTwo = stepOne + myNumber; //adds input to previous result
    double stepThree = stepTwo / myNumber; //divides previous result by input
    double stepFour = stepThree + 17; //adds 18 to previous result
    double stepFive = stepFour - myNumber; //subtracts input from previous result
    double stepSix = stepFive / 6; //divides previous result by 6
    
    return stepSix; //returns the result
    
  } //End of calculate function




  //getUserNumber function
  /*
  Uses Scanner to get the user number and check to see if there is an error

  Returns
  rand {Double} - random double
  userNumber {Double} - the number the user submitted

  */
  public double getUserNumber(){

    Scanner testObj = new Scanner(System.in); //Creates new scanner object
    
    try { //Will try to run code below

      double userNumber = testObj.nextDouble(); //tries to assign the input as a double
      testObj.close(); //closes the scanner

      //User Message
      System.out.println();
      System.out.println("The number you put in was " + userNumber);

      return userNumber; //returns number

    } catch (Exception e){ //if there is any error, this code runs instead

      double rand = Math.floor(Math.random()*100); //creates a random number between 0 and 100;

      //User message

      System.out.println();
      System.err.println("Error! You have input an invalid variable!");
      System.out.println();
      System.out.println("We have randomly bestowed you with the number " + rand);

      return rand; //returns random number

    } //end of catch/try
  }//end of userNumber function




  //frontUI function
  /*
  Prints UI for the beginning the program
  */
  public void frontUI(){

    System.out.println("Welcome to our Java magic show!");
    System.out.println();
    System.out.println("For this trick, we shall convert any number, into one we shall predict!");
    System.out.println();
    System.out.println("Input your number down below!");
    System.out.println();
  
  } //end of frontUI function




  //endUI function
  /*
  Prints UI for end of program

  Parameters
  output {double} - the end result calculated
  input {double} - the user input
  */
  public void endUI(double output, double input){

    //Prints UI
    System.out.println();
    System.out.println("Using our magic powers, we changed your input to " + output);
    System.out.println();
    System.out.println("Thank you for using our program!");
    System.out.println();

  } //end of endUI function




  //Main
  public static void main(String[] args){
    //Main Variables
    double userNumber;
    double finalValue;

    var calculation = new Magic(); //creates new instance

    calculation.frontUI(); //runs the front UI
    
    userNumber = calculation.getUserNumber(); //Runs getUserNumber and assigns the result to a double

    finalValue = calculation.calculate(userNumber); //Runs calcuate function with usernumber as parameter, sets result to final value

    calculation.endUI(finalValue, userNumber); //creates endUI using the input and output

  }//end of Main

}//end of Magic Class
