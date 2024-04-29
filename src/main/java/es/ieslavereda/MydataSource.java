package es.ieslavereda;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.Properties;

public class MydataSource {
    public static DataSource getMySQLDataSource() {
        Properties properties= new Properties();
        MysqlDataSource ds = null;

        try(FileInputStream fis= new FileInputStream("db.properties")) {
            properties.load(fis);

            ds = new MysqlDataSource();

            ds.setURL(properties.getProperty("MYSQL_DB_URL"));
            ds.setUser(properties.getProperty("MYSQL_DB_USERNAME"));
            ds.setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));

        }catch (Exception e){
            e.printStackTrace();
        }

        return ds;
    }

    public static Connection conectarMySQL(){
        Connection con = null;

        try {
            DataSource ds = getMySQLDataSource();
            con = ds.getConnection();
            if (con != null) {
                System.out.println("Conectado");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
