import java.util.Scanner;

public  class ArmStrongNumber {
    static String FindArmStrongNumber(int GivenNumber) {
        int temp = GivenNumber;
        int arm = 0;
        while (GivenNumber != 0) {   //Logic to find Armstrong number
            int remainder = GivenNumber % 10;

            arm = arm + (remainder * remainder * remainder);
            GivenNumber = GivenNumber / 10;
        }
        if (arm == temp)
            return "This is an armStrongNumber";
        else
            return "This is Not an armstrongNumber";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userOption = 1;
        while (userOption != 0) {
            System.out.println("Enter the number to find is that ArmStrong Number or not");
            int UserNumber = scanner.nextInt();
            System.out.println(FindArmStrongNumber(UserNumber));
            System.out.println("Enter anyNumber to continue and 0 to exit");
            if (scanner.nextInt() != 0) {
                continue;
            } else {
                break;
            }

        }
    }
}


