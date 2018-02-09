package excerise;

/**
 *
 * 二分查找(基于有序数组)
 * @author bibingwei
 */
public class BinarySearchST {

    private static String input = "s,e,a,r,c,h,e,x,a,m,p,l,e";
    static Node node = new Node(null,0,null);
    public static void main(String[] args) {

        String[] temp = input.split(",");
        for (int i=0;i<temp.length;i++){
            for (Node x = node;x != null;x = x.next){
                if (temp[i].equals(x.key)){
                    //找到就更新value
                    x = null;
                }
            }
            //未找到情况下
            node = new Node(temp[i],i,node);
        }
        //System.out.println("key: " + node.key +"value: " + node.value);
    }

     static class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
