import java.util.Scanner;


public class Magic{


    public double calculate(double myNumber){

        double stepOne = myNumber*myNumber;
        double stepTwo = stepOne + myNumber;
        double stepThree = stepTwo / myNumber;
        double stepFour = stepThree + 17;
        double stepFive = stepFour - myNumber;
        double stepSix = stepFive / 6;
        
        return stepSix;
      
    
    }


    public double getUserNumber(){

        Scanner testObj = new Scanner(System.in);

          double userNumber = testObj.nextDouble();
          testObj.close(); 
          return userNumber;
        } 

    }



    public void endUI(double output, double input){

        System.out.println();
        System.out.println("The number you put in was " + input);
        System.out.println();
        System.out.println("Using our magic powers, we changed your input to " + output);
        System.out.println();
        System.out.println();
    }

      public void frontUI(){

      System.out.println("Welcome to our Java magic show!");
      System.out.println();
      System.out.println("For this trick, we shall convert any number, into one we shall predict!");
      System.out.println();
      System.out.println("Input your number down below!");
      System.out.println();
  }

    public static void main(String[] args){
    

    
        var calculation = new Magic();

        calculation.frontUI();
        
        double userNumber = calculation.getUserNumber();

        double finalValue = calculation.calculate(userNumber);

        calculation.endUI(finalValue, userNumber);
    
    }


}