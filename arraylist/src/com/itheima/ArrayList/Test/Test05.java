package com.itheima.ArrayList.Test;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        //返回低于三十块钱的手机
        ArrayList<Phone> phoneList = new ArrayList<>();

        Phone phone1 = new Phone ("xiaomi", 1999);
        Phone phone2 = new Phone ("hummer", 2999);
        Phone phone3 = new Phone ("iPhone", 7999);

        phoneList.add(phone1);
        phoneList.add(phone2);
        phoneList.add(phone3);

        ArrayList<Phone> listInfo = getPhone(phoneList);

        for (int i = 0; i < listInfo.size(); i++) {
            Phone p = (Phone) listInfo.get(i);
            System.out.println(listInfo.get(i).getName() + ", " +listInfo.get(i).getPrice());
        }


    }

    public static ArrayList<Phone> getPhone(ArrayList<Phone> phoneList) {
        //定义一个集合用于判断低于3000元的手机对象
        ArrayList<Phone> list = new ArrayList<>();
        //for循环遍历手机
        for (int i = 0; i < phoneList.size(); i++) {
            Phone p = phoneList.get(i);
            int price = p.getPrice();
            //判断价格是否低于3000
            if(price < 3000){
                //存储到集合当中
                list.add(p);
            }
        }
        return list;
    }
}
