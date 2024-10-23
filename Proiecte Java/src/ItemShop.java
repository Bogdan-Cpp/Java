import java.util.ArrayList;
import java.util.Scanner;

public class ItemShop {

    public static void main(String[] args){
        Scanner times = new Scanner(System.in);
        Scanner produs = new Scanner(System.in);
        ArrayList<Double> items = new ArrayList<>();
        double total = 0;

        System.out.print("Cate produse vrei sa adaugi: ");
        double time = times.nextDouble();

        for(int a = 0; a < time; a++){
            System.out.print("Item " + (a + 1) + ": ");
            double item = produs.nextDouble();
            items.add(item);
        }

        for (Double elements : items) {
            total += elements;
        }

        System.out.println("Total: " + total);
    }
}
