package excerise;

import java.util.ArrayList;

/**
 * 双栈算术表达式求值算法
 * e.g:(1+（（2+3）*（4*5）））
 * @author bibingwei
 */
public class Dijkstra {

    private static int temp;

    public static void main(String[] args) {

        String testString = "(1+((2+3)*（4*5)))";
        ArrayList<String> numList = new ArrayList<>();
        ArrayList<String> opraList = new ArrayList<>();
        System.out.println("计算(1+（(2+3)*（4*5))）");

        for (int i = 0; i < testString.length(); i++) {
            if ('('== (testString.charAt(i))) {

            } else if ('0'<= testString.charAt(i) && testString.charAt(i) <= '9') {
                numList.add(String.valueOf(testString.charAt(i)));
            } else if ('+' == (testString.charAt(i)) || '-' == (testString.charAt(i))
                    || '*' == (testString.charAt(i)) || '/' == (testString.charAt(i))) {
                opraList.add(String.valueOf(testString.charAt(i)));
            }
            if (')' == (testString.charAt(i))){
                int num1 = Integer.parseInt(numList.get(numList.size()-1));
                int num2 = Integer.parseInt(numList.get(numList.size()-2));
                String opear = opraList.get(opraList.size()-1);
                if ("+" .equals (opear)){
                    temp = num1 + num2;
                }else if ("-" .equals (opear)){
                    temp = num1-num2;
                }else if ("*" .equals (opear)){
                    temp = num1 * num2;
                }else {
                    temp = num1 / num2;
                }
                numList.remove(numList.size()-1);
                opraList.remove(opraList.size()-1);
                numList.set(numList.size()-1, Integer.toString(temp));
            }
        }

        System.out.println("最后结果为: " + temp);
    }
}
