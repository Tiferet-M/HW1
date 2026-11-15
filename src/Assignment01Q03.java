public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0;
        int prev = 0;
        int curr = 1;
        for (int i = 0; i < x; i++) {
            if (i == 0) {
                System.out.print(1);
                numOdd += 1;
            }
            else {
                System.out.print(prev + curr);
                if ((prev + curr) % 2 == 1) {
                    numOdd += 1;
                }
                int t = curr;
                curr = prev + curr;
                prev = t;
            }
            if (i < x - 1) 
                System.out.print(" ");
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
