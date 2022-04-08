package com.codeup.adlister.dao;

public class DaoFactory {
    private static Users usersDao;

    public static Users getUsersDao() {
        Config config = new Config();
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }
}
