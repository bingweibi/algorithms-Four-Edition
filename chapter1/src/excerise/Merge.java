package excerise;

/**
 * 归并排序
 * @author bibingwei
 */
public class Merge {

    public static void main(String[] args) {

        String temp = "M,E,R,G,E,S,O,R,T,E,X,A,M,P,L,E";
        String[] unsort = temp.split(",");
        String[] sort = temp.split(",");
        int low = 0,mid = unsort.length/2,high = unsort.length,k = 0;
        for (;low<mid;low++){
            for (int j = low + 1;j<mid;j++){
                if (unsort[low].compareTo(unsort[j])>0){
                    String s = unsort[j];
                    unsort[j] = unsort[low];
                    unsort[low] = s;
                }
            }
        }
        for (;mid<high;mid++){
            for (int j = mid + 1;j<high;j++){
                if (unsort[mid].compareTo(unsort[j])>0){
                    String s = unsort[j];
                    unsort[j] = unsort[mid];
                    unsort[mid] = s;
                }
            }
        }

        int i = 0,j = unsort.length/2;
        for (int z = 0;z < unsort.length;z++){
            if (i >= unsort.length/2 || j >=unsort.length){
                break;
            }
            if (unsort[i].compareTo(unsort[j]) > 0){
                sort[k] = unsort[j];
                j++;
                k++;
            }else {
                sort[k] = unsort[i];
                i++;
                k++;
            }
        }
        if (i >= unsort.length/2){
            for (;j<high;j++){
                sort[k] = unsort[j];
                k++;
            }
        }
        if (j >=unsort.length){
            for (;i<unsort.length/2;i++){
                sort[k] = unsort[i];
                k++;
            }
        }

        for (int m=0;m<sort.length;m++){
            System.out.print(sort[m]);
        }
    }
}
