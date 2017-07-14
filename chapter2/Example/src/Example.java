/**
 * Created by bbw on 2017/7/14.
 * 实现排序算法通用的函数
 * 比较：less,交换：exchange,展示:show,是否排序：isSorted
 */
public class Example {

    //判断v是否比w小
    public static boolean less(Comparable v,Comparable w){
            return v.compareTo(w)<0;
    }

    //交换v,w
    public static void exchange(Comparable[] a,int v,int w){
        Comparable t = a[v];
        a[v] = a[w];
        a[w] = t;
    }

    //打印数组
    public static void show(Comparable[] a){
        for (int i= 0;i<a.length;i++){
            System.out.print(a[i] + " ");
            System.out.println();
        }
    }

    //测试是否有序
    public static boolean isSorted(Comparable[] a){
        for (int i=0;i<a.length;i++){
            if (less(a[i],a[i-1])) return false;//非有序
        }
        return true;
    }

}
