import java.util.Scanner;

/**
 *二分法的实现
 * @author bibingwei
 **/
public class Main {

    public static void main(String[] args) {
        //假设排序10个以内的数组
        int[] array = new int[10];
        int input,key;
        for (int i=0;i<10;i++){
            array[i] = Integer.parseInt(new Scanner(System.in).nextLine());
        }
        System.out.println("输入一个需要查找的是数字");
        key = new Scanner(System.in).nextInt();

        System.out.println("位置： " + BinarySearch(key,array));

    }

    private static int BinarySearch(int key,int[] array) {
        int low= 0 ;
        int high = array.length-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (key < array[mid]){
                high = mid - 1;
            }else if(key > array[mid]){
                low = mid + 1;
            }else {
                return mid+1;
            }
        }
        return -1;

    }
}
