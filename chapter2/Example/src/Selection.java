/**
 * Created by bbw on 2017/7/14.
 * 选择排序
 */
public class Selection {

    public static  void sort(Comparable[] a){
        int length = a.length;

        for (int i=0;i<length;i++){
            int min = i;
            for (int j=i+1;j<length;j++){
                if (Example.less(a[j],a[min])) min =j;
                Example.exchange(a,i,j);
            }
        }
    }
}
