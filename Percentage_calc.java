import java.util.Scanner;

public class Percentage_calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("To find 'x' percentage of a number ---press 1");
        System.out.println("To find what percentage is 'x' in a number -- press 2 ");
          int userOpt = scan.nextInt();

          if(userOpt == 1){
              System.out.println("Enter number here ?");
              double num = scan.nextDouble();
              System.out.println("Enter Percentage ?");
              double howMuchPercentage =  scan.nextDouble();
              double result = (howMuchPercentage)/(100) * (num);
              System.out.println("The " + howMuchPercentage + " % " +  " of  " + num + " = " + result);
          }
          if(userOpt == 2){
              System.out.println("Enter number here and let assume that x  ");
              double num = scan.nextDouble();
              System.out.println("Enter the number to find what percentage of the number  in x ");
              double whatPercentage =scan.nextDouble();
              double result =(whatPercentage/num ) *100;
              System.out.println( whatPercentage + " is " + result +  " %" + " of " + num );
          }










    }
}
