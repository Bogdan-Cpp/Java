import java.util.Scanner;

public class DeltaCalculation {

    public static double Delta(int a, int b, int c){
        double delta;
        return delta = Math.pow(b, 2) - 4 * a * c;
    }

    public static void main(String[] args){

        Scanner num = new Scanner(System.in);

        System.out.println("Forma: ax^2 + bx + c");

        System.out.print("a: ");
        int a = num.nextInt();

        System.out.print("b: ");
        int b = num.nextInt();

        System.out.print("c: ");
        int c = num.nextInt();

        double rez = Delta(a, b, c);
        System.out.println("Delta = " + rez);

    }
}
