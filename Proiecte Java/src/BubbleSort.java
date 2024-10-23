import java.util.ArrayList;

public class BubbleSort {
    public static int[] sort(int[] array){
        int temp = 0;

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args){
        ArrayList<Integer> sortedArray = new ArrayList<>();
        int[] array = {3, 5, 9, 1, 4, 10, 2, 8, 6, 7};

        int[] sorted = sort(array);

        for(int elem : sorted){
            sortedArray.add(elem);
        }

        for(Integer elem : sortedArray){
            System.out.print(elem + ",");
        }
    }
}
