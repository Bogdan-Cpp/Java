import java.util.Scanner;

public class temperatureConvertor {
    public static int temp(){
        Scanner scaner = new Scanner(System.in);
        int Temperatura = 0;

        System.out.print("t in grade celsius: ");
        int temperatura = scaner.nextInt();
        System.out.println("T = " + temperatura + " + " + 273);

        Temperatura = temperatura + 273;

        return Temperatura;
    }
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        System.out.println("1.t -> T");
        System.out.println("2.T -> t");
        System.out.println("3.C -> F");
        System.out.println("4.F -> C");

        System.out.print("Choice: ");
        int alegere = scaner.nextInt();

        switch(alegere){
            case 1:
                int rez = temp();
                System.out.println("T = " + rez + "K");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Error404");

        }
    }
}
