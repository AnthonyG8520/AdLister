import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;
//    private List<Ad> ads;

    public MySQLAdsDao(Config c) {
//        List<Ad> ads = new ArrayList<>();
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    c.getUrl(),
                    c.getUser(),
                    c.getPassword()
            );
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Ad> all() {
        try {
            List<Ad> ads = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                ads.add(new Ad(
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
            return ads;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        List<Ad> ads = null;
        return ads;
    }


    public Long insert (Ad ad){
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO ads (user_id, title, description) VALUES ("+ ad.getUserId() +", '"+ ad.getTitle() +"', '"+ ad.getDescription() +"')");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ad.getId();
    }

}
