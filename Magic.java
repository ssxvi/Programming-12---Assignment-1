import java.util.Scanner;


public class Magic{


    public int calculate(int myNumber){

        int stepOne = myNumber*myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        return stepSix;
    
    }


    public int getUserNumber(){

        Scanner testObj = new Scanner(System.in);
        System.out.println("Input Number!");
        int userNumber = testObj.nextInt();
        testObj.close();
        System.out.print(userNumber);
        return userNumber;
        
    }


    public void EndUI(int output){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("daniel is gay");
        System.out.println(output);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args){
        

    
        var calculation = new Magic();
        var userNumber = calculation.getUserNumber();
        var finalValue = calculation.calculate(userNumber);

        calculation.EndUI(finalValue);
    
    }
}