package com.practice.todo.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommonUtils {

    static Logger log = LoggerFactory.getLogger(CommonUtils.class);

    public static boolean tableExists(Connection connection, String tableName) throws SQLException {
        ResultSet resultSet = null;
        try {
            DatabaseMetaData meta = connection.getMetaData();
            resultSet = meta.getTables(null, null, tableName, new String[]{"TABLE"});
        } catch (SQLException exception) {
            log.error("exception occures {}", exception.getMessage());
        }
        return resultSet.next();
    }
}
