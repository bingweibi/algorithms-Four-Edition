package excerise;

/**
 * 快速排序
 * @author bibingwei
 */
public class Quick {

    public static void main(String[] args) {
        String temp = "M,E,R,G,E,S,O,R,T,E,X,A,M,P,L,E";
        String[] unsort = temp.split(",");
        String flag = unsort[0];
        int num = 0;
        for (int i=1;i < unsort.length;i++){
            if (unsort[0].compareTo(unsort[i])>0){
                String s = unsort[i];
                unsort[i] = unsort[0];
                unsort[0] = s;
            }
        }
        for (int i=0;i<unsort.length;i++){
            if (flag == unsort[i]){
                num = i;
            }
        }
        for (int i =0;i<num;i++){
            if (unsort[num].compareTo(unsort[i])>0){
                String s = unsort[i];
                unsort[i] = unsort[num];
                unsort[num] = s;
            }
        }
        for (int i=num;i<unsort.length;i++){
            if (unsort[num].compareTo(unsort[i])>0){
                String s = unsort[i];
                unsort[i] = unsort[num];
                unsort[num] = s;
            }
        }

        for (int i=0;i<unsort.length;i++){
            System.out.print("sort: "+ unsort[i]);
        }
    }
}
