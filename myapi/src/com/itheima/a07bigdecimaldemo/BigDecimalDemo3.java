package com.itheima.a07bigdecimaldemo;

public class BigDecimalDemo3 {
    /*public BigDecimal add(BigDecimal val)
    加法
    public BigDecimal subtract(BigDecimal val)
    减法
    public BigDecimal multiply(BigDecimal val)
    乘法
    public BigDecimal divide(BigDecimal val)
    除法
    public BigDecimaldivide(BigDecimalval，精确几位，舍入模式)
    除法*/
    public static void main(String[] args) {

        java.math.BigDecimal bd1 = new java.math.BigDecimal("123456789.123456789");
        java.math.BigDecimal bd2 = new java.math.BigDecimal("123456789.123456789");
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2));
        System.out.println(bd1.divide(bd2, 10, java.math.BigDecimal.ROUND_HALF_UP));
        System.out.println(bd1.divide(bd2, 10, java.math.BigDecimal.ROUND_HALF_DOWN));
        System.out.println(bd1.divide(bd2, 10, java.math.BigDecimal.ROUND_HALF_EVEN));
        System.out.println(bd1.divide(bd2, 10, java.math.BigDecimal.ROUND_CEILING));
    }
}
