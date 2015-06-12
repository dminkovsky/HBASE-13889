package com.mycompany.app;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.TableName;

public class App {
    public static void main(String[] args) throws java.io.IOException {
        Configuration config = HBaseConfiguration.create();
        Connection connection = ConnectionFactory.createConnection(config);
        Table table = connection.getTable(TableName.valueOf("users"));
        Put put = new Put(Bytes.toBytes("hello"));
        put.addColumn(
            Bytes.toBytes("d"),
            Bytes.toBytes("name"),
            Bytes.toBytes("user")
        );
    }
}
