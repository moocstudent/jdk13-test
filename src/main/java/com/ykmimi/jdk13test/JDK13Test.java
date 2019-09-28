package com.ykmimi.jdk13test;

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
    }
}
