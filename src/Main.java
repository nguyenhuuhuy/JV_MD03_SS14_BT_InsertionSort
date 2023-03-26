import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }
    public static void selectionSort(int[] array)
    {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int  i = 0; i < array.length - 1; i++){
            min = i;
            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void insertionSortList(List<Product> productList){


        for(int i = 1; i < productList.size(); i++){ //đoạn array[0] đã sắp xếp
         Product   x = productList.get(i);
           int pos = i;
            while((pos > 0) && x.getPrice() < productList.get(pos-1).getPrice()){
                productList.set(pos,productList.get(pos-1)); // đổi chỗ
                pos--;
            }
            productList.set(pos,x);
        }
    }
    public static void selectionSortList(List<Product> list)
    {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int  i = 0; i < list.size() - 1; i++){
            min = i;
            for(int j = i + 1; j < list.size(); j++)
                if (list.get(j).getPrice() < list.get(min).getPrice())
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i){
                Product temp = list.get(min);
               list.set(min,list.get(i));
                list.set(i,temp);
            }
        }
    }
    public static void bubbleSortList(List<Product> productList) {
        for (int i = 0; i < productList.size() - 1; i++) {
            for (int j = productList.size() - 1; j > i; j--)
                if (productList.get(j).getPrice() < productList.get(j-1).getPrice()) {
                    Product temp = productList.get(j);
                    productList.set(j,productList.get(j-1));
                    productList.set(j-1,temp);
                }
        }
    }
    public static void main(String[] args) {
        int[] list = {109,3,54,68,30};
//        bubbleSort(list);
//        System.out.println(Arrays.toString(list));
//        selectionSort(list);
        insertionSort(list);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"long",2000));
        productList.add(new Product(2,"hung",4000));
        productList.add(new Product(3,"hong",10000));
        productList.add(new Product(4,"tuan",1000));
//        insertionSortList(productList);
//        System.out.println(productList);
//        selectionSortList(productList);
//        System.out.println(productList);
        bubbleSortList(productList);
        System.out.println(productList);
    }
}
