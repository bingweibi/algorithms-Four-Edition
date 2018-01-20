package excerise;

/**
 * 堆排序
 * @author bibingwei
 */
public class HeapSort {

    private static void heapSort(int[] array,int len) {
        //第一阶段: 构造堆
        for(int i = len-1;i>1;i--){
            if (array[i/2] < array[i]){
                swap(array,i/2,i);
            }
        }
    }

    /**
     * 调整堆
     * */
    private static void temp(int[] array){
        for (int i = array.length-1;i>1;i--){
            swap(array,1,i);
            heapSort(array,i);
        }
    }

    private static void swap(int[] array, int a, int b){
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

    public static void main(String[] args) {
        int[] array = {0,20,50,20,40,70,10,80,30,60};
        int len = array.length;
        System.out.println("堆排序之前: ");
        for (int i : array){
            System.out.print(i + ",");
        }
        heapSort(array,len);
        temp(array);
        System.out.println();
        System.out.println("堆排序之后: ");
        for (int i : array){
            System.out.print(i + ",");
        }

    }

}
