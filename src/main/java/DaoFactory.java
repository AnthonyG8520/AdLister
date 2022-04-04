public class DaoFactory {
    private static Products productsDao; // field for the DAO we created

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }//make new DAO if one not found [null]
        return productsDao;// return the one you found or the one you created on line 6
    }



}
