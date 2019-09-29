package com.ykmimi.jdk13test;

import java.util.ArrayList;

public class JDK13Test {
    public static void main(String[] args) {
        //text block
        String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
        System.out.println(html);
        //text block
        String query = """
                    SELECT `EMP_ID`
                    FROM `EMPLOYEE`
                    WHERE `CITY` = `xiaweiyi`
                       """;

        String test2 = """
                    hello,
                        world !
                       """;

        System.out.println(query);

        System.out.println(test2);

        /*
        之下是对变量声明关键字var的测试, 可以声明的类型多样化:
        包括但不限于:
        字符串, 数值, 二进制数, 字符串 + 数值, 浮点数
        对象, 集合.
        */
        var welcome = "hello world ~";
        var balance = 1000;
        var binary = 0x11;
        var breakfast = "西兰花" + 100 + "kg";
        var bug_percent = 0.001d;
        var jdk13Test = new JDK13Test();
        var list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println();
        System.out.println(welcome);
        System.out.println(balance);
        System.out.println(binary);
        System.out.println(breakfast);
        System.out.println(bug_percent);
        System.out.println(jdk13Test);
        System.out.println(list.toString());

    }
}
