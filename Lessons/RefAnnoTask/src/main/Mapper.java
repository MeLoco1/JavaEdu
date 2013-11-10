package main;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/10/13
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mapper {
    public void save(Object o) {
        String temp1 = "INSERT INTO cars (name) VALUES ('mers');";
        String temp2 = "INSERT INTO";
        String temp3 = "VALUES (";

        String tableName = null;

        Field[] fields = o.getClass().getDeclaredFields();
        //  get data from field

        String[] columns = null;

        String[] values = null;
    }
}
