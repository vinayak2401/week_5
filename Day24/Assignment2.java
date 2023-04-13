import java.util.Scanner;

 class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = input.nextInt();

        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element in array ar[i]: ", i+1);
            ar[i] = input.nextInt();
        }

        System.out.print("Enter an integer divisor : ");
        int k = input.nextInt();

        
    }
}
