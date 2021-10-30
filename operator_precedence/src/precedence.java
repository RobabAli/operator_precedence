public class precedence {
    public static void main(String[] args){

        // '/' operator gets precedence over '+'
        int a = 2/2 + 1;
        System.out.println("a: " + a);

        int b = 2-1+2;
        System.out.println("b: " + b);
    }

}
