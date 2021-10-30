import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println((n%2==0)? "n is even" : "n is odd");
    }
}
