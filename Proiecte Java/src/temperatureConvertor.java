import java.util.Scanner;

public class temperatureConvertor {
    public static void Far(){
        Scanner scaner = new Scanner(System.in);
        int farenheid = 0;
    }

    public static int Temp(){
        Scanner scaner = new Scanner(System.in);
        int temperatura = 0;

        System.out.println("T in grade kelvin: ");
        int Temperatura = scaner.nextInt();

        System.out.println("t = " + Temperatura + - 273);
        temperatura = Temperatura - 273;
        return temperatura;
    }

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
        int alegere;

        do{
            System.out.println("1.t -> T");
            System.out.println("2.T -> t");
            System.out.println("3.C -> F");
            System.out.println("4.F -> C");

            System.out.print("Choice: ");
             alegere = scaner.nextInt();

            switch(alegere){
                case 1:
                    int rez = temp();
                    System.out.println("T = " + rez + "K");
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.exit(0);
                    }
                    break;
                case 2:
                    int rez2 = Temp();
                    System.out.println("t = " + rez2 + "C");
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.exit(0);
                    }
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 00:
                    System.exit(0);
                default:
                    System.out.println("Error404");
            }
        }while(alegere != 00);

    }
}
