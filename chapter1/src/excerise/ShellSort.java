package excerise;

import java.util.Scanner;

/**
 * @author bibingwei
 */
public class ShellSort {

    public static void main(String[] args) {

        int[] numList = new int[14];
        System.out.println("请随意输入一串数字.");
        for (int i=0;i<numList.length;i++){
            numList[i] = new Scanner(System.in).nextInt();
        }

        int gap = 1, i, j, len = numList.length;
        int temp;
        while (gap < len / 3) {
            gap = gap * 3 + 1;
        }

        for (; gap > 0; gap /= 3) {
            for (i = gap; i < len; i++) {
                temp = numList[i];
                for (j = i - gap; j >= 0 && numList[j] > temp; j -= gap) {
                    numList[j + gap] = numList[j];
                }
                numList[j + gap] = temp;
            }
        }

        for (int m=0;m<numList.length;m++){
            System.out.print(numList[m] + "  ");
        }
    }
}
