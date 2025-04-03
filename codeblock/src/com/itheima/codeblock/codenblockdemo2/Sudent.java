package com.itheima.codeblock.codenblockdemo2;

public class Sudent {
    private String name;
    private int age;
    //执行时机
    //随着类加载而加载
    static  {
        System.out.println("静态代码块执行");
    }

    public Sudent() {
        System.out.println("空参构造");
    }

    public Sudent(String name, int age) {
        System.out.println("全参构造");
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Sudent{name = " + name + ", age = " + age + "}";
    }
}
