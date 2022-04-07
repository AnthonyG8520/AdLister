import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        Config c = new Config();
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(c);
        }
        return adsDao;
    }
}
