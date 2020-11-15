package leetcode.字符串;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName SaiMa_数组中是否村长这个元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/21 15:26
 */
public class SaiMa_数组中是否村长这个元素 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int len = scanner.nextInt();
            int[] array = new int[len];
            int[] copy = new int[len];
            for (int i = 0;i<len;i++){
                array[i] = scanner.nextInt();
                copy[i] = array[i];
            }
            Arrays.sort(copy);
            int left = 0,right = len-1;
            while(left<len && copy[left]==array[left]) left++;
            while(right>=0 && copy[right]==array[right]) right--;


            int i;
            for(i=0;i<=right-left;i++)
            {
                if(copy[left+i]!=array[right-i])
                    break;
            }
            if(i>right-left)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }

}