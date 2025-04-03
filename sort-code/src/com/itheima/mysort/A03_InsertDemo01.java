package com.itheima.mysort;

public class A03_InsertDemo01 {
    public static void main(String[] args) {
        //插入排序
        //将0索引中的 元素到N索引的元素看成是有序的,把N+1索引中的元素到最后一个当成是无序.
        //遍历无序的数据,将遍历到的数据插入有序序列中适当的位置

        int[] arr = {2, 3 ,1};
        //1. 找到无序是从哪一数组从哪一个索引开始的
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }
        //2. 遍历从startIndex开始到最后一个元素, 依次得到无序的按一组数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            //问题: 如何将遍历的数据,插入到前面有序的那一组当中
            //记录当前要插入的索引

            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]){
                //交换位置
                int temp = arr[i];
                arr[i] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        printAll(arr);
    }

    public static void printAll(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
