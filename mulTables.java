import java.util.Scanner;

public class mulTables {
    static void generateTable(int num,int upTo){
        for (int i = 1; i <=upTo ; i++) {
            System.out.println(i + " * " + num + " = " + i * num);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to generate multiplication table");
        int num = scanner.nextInt();
        System.out.println("Enter the multiplication range for the table to be generate");
        int upTo = scanner.nextInt();
        System.out.println("--------------- " + num + " table " + "------------------");
        scanner.close();
        generateTable(num,upTo);
    }

}
