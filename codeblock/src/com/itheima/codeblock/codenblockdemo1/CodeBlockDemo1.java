package com.itheima.codeblock.codenblockdemo1;

public class CodeBlockDemo1 {
    public static void main(String[] args) {
        //局部代码块,用完自动回收
        /*{
            int a = 10;
        }*/

        //创建对象
        Sudent s = new Sudent();

        Sudent s2 = new Sudent("btmy", 23);

        Sudent s3 = new Sudent("sam");
    }
}
