import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config c) throws SQLException {
        this.connection = DriverManager.getConnection(
                c.getUrl(),
                c.getUser(),
                c.getPassword()
        );
    }

    public List<Ad> all() throws SQLException{
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM ads");
        while(rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("title");
            System.out.println(rs.getString("description"));
        }
    }

    public Long insert (Ad ad){

    }

}
