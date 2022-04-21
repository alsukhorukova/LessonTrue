
////
////import db.DBHelper;
////import org.testng.annotations.Test;
////
////public class DBGetTestDZ7 {
////
////    @Test
////    public void startTest() {
////        String sql = "SELECT * FROM REGISTRATION";
////        DBHelper.getSqlResult(sql).forEach(s -> System.out.println(s));
////        System.out.println(DBHelper.getValueFirstRow(sql, "first"));
////
////        String sql2 = "INSERT REGISTRATION(id, last, first, age) VALUES (20, 'lastname6', 'name6', 31)";
////        DBHelper.getSqlResult(sql).forEach(s -> System.out.println(s));
////        System.out.println("Добавлено строк: " + DBHelper.getInsertSQL(sql2));
////
////        String sql3 = "INSERT REGISTRATION(id, last, first, age) VALUES (21, 'lastname7', 'name7', 19)";
////        DBHelper.getSqlResult(sql).forEach(s -> System.out.println(s));
////        System.out.println("Добавлено строк: " + DBHelper.getInsertSQL(sql2) + DBHelper.getInsertSQL(sql3));
////
////    }
////}
package dbTests;

import db.DBHelper;
import org.testng.annotations.Test;

import java.util.Scanner;

public class DBGetTestDZ7 {

    @Test
    public static void startTest() {
        String sql = "SELECT id FROM REGISTRATION ORDER BY id DESC LIMIT 1";
        DBHelper.getSqlResult(sql).forEach(s->System.out.println(s));

        String sql2 = "INSERT INTO REGISTRATION(id, last, first, age) SELECT coalesce (MAX(id),0) + 1, 'lastname6', 'name6', 45 FROM REGISTRATION";
        System.out.println("Добавлено строк: " + DBHelper.getInsert(sql2));
        DBHelper.getSqlResult(sql).forEach(s->System.out.println(s));

    }

}