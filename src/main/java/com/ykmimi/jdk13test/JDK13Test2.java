package com.ykmimi.jdk13test;

public class JDK13Test2 {

    public static void main(String[] args) {
               howMany(1);
    }
    //switch
    private static void howMany(int k) {
        System.out.println(
                switch (k) {
                    case 1 -> "one";
                    case 2 -> "two";
                    default -> "many";
                }
        );
    }

//    var 变量类型声明不可用于switch判定
//    private static void howType(var param)   {
//
//    }

}
