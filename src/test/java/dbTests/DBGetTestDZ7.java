package dbTests;

import db.DBHelper;
import org.testng.annotations.Test;

public class DBGetTestDZ7 {

    @Test
    public void startTest() {

        String sql1 = "INSERT INTO REGISTRATION (id,last,first,age) " +
                "VALUES (5, 'username123456', 'password123456', '123456')";

        String sql = "SELECT * FROM REGISTRATION";

        DBHelper.getSqlResult(sql1, sql).forEach(s-> System.out.println(s));
    }
}
