package store;

import dao.BookStoreDao;
import dao.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        BookStoreDao bookstoreDao = new BookStoreDao();
        try {
            bookstoreDao.connect();
            ResultSet set = bookstoreDao.executeSelect("SELECT * FROM documents");
            List<Document> docs = bookstoreDao.getDocs(set);

            if (docs != null) {
                System.out.println(docs);
            } else System.out.println("There are no books in the database");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
