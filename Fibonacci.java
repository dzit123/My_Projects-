public class Fibonacci {

    static void printFibonacci(int upTo) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " "); // Print the first two Fibonacci numbers

        while (true) {
            int third = first + second;
            if (third > upTo) {
                break; // Exit the loop if the third Fibonacci number exceeds the limit
            }
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }


    public static void main(String[] args) {

              printFibonacci(100);

    }
}
