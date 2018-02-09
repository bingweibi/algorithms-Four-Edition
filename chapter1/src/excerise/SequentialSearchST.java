package excerise;

import javax.swing.*;
import java.util.ArrayList;

/**
 * 顺序查找(基于无序链表)
 * @author bibingwei
 */
public class SequentialSearchST{

    public static void main(String[] args) {
        boolean flag = false;
        String[] key = {"S","E","A","R","C","H","E","X","A","M","P","L","E"};
        int[] value = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        ArrayList<NodeExample> nodeExampleArrayList = new ArrayList<>();
        for (int i=0;i<key.length;i++){
            for (NodeExample aNodeExampleArrayList : nodeExampleArrayList) {
                if (key[i].equals(aNodeExampleArrayList.key)) {
                    aNodeExampleArrayList.value = value[i];
                    flag = true;
                }
            }
            if (!flag){
                nodeExampleArrayList.add(new NodeExample(key[i], value[i]));
            }
            flag = false;
        }

        for (int i=0;i<nodeExampleArrayList.size();i++){
            System.out.print(nodeExampleArrayList.get(i).key+" "+nodeExampleArrayList.get(i).value+"  ");
        }

    }


    private static class NodeExample {
        String key;
        int value;

        public NodeExample(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }


}
