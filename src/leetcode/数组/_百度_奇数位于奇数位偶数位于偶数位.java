package leetcode.数组;

import java.util.Arrays;

/**
 * @ClassName _百度_奇数位于奇数位偶数位于偶数位
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/6 20:43
 */
public class _百度_奇数位于奇数位偶数位于偶数位 {
    //设置两个双指针,指针ou指向偶数，如果是偶数就+2，不过不是，就等待交换
    //  指针ji指向奇数，如果是奇数就+2，如果不是，就等待交换，然后继续等待交换

    //偶数的指针初始化为1，奇数的指针初始化为0 ，这点特别的注意下即可
    public static void reorder(int[] arr) {
        if (arr == null) {
            System.out.println("the array is null");
            return;
        }

        int len = arr.length;
        int ou = 1;
        int ji = 0;
        while (ou < len && ji < len) {
            //偶数找偶数 ,
            if (arr[ou] % 2 == 0) {
                ou = ou + 2;
            }
            if (arr[ji] % 2 == 1) {
                ji = ji + 2;
            }
            if (ou < len && ji < len) {//该条件的目的是先判断数组下标是否出界，如果不加该条件判断，程序可能会有数组下标越界错误
                if (arr[ou] % 2 == 1 && arr[ji] % 2 == 0) {
                    int temp = arr[ou];
                    arr[ou] = arr[ji];
                    arr[ji] = temp;
                }
            }
        }
    }

    public static void reorder1(int[] arr) {
        if (arr == null) return;
        int ou = 1;
        int ji = 0;
        while (arr.length > ou && arr.length > ji) {
            while (arr[ou] % 2 == 0) ou += 2;
            while (arr[ji] % 2 == 1) ji += 2;
            if (arr.length > ou && arr.length > ji) {
                //     if (arr[ou] % 2 == 1 && arr[ji] % 2 == 0) {
                int temp = arr[ou];
                arr[ou] = arr[ji];
                arr[ji] = temp;
            }else {
                return;
            }
            //   }
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 4, 4, 5, 7};
        reorder1(arr);
        System.out.println(Arrays.toString(arr));

    }
}