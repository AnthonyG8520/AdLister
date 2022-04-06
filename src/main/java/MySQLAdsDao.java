import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads{

    public List<Ad> all() throws SQLException {
        Config config = new Config();
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM ads");
        while(rs.next()){

        }
    }

    public Long insert (Ad ad){

    }

}
