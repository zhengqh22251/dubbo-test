package com.zqh.study;

import java.util.ServiceLoader;

/**
 * @Author：zhengqh
 * @date 2020/3/19 20:41
 **/
public class Test {
    public static void main(String[] args) {
        ServiceLoader<DatabaseDriver> serviceLoader = ServiceLoader.load(DatabaseDriver.class);
        for (DatabaseDriver databaseDriver: serviceLoader) {
            System.out.println(databaseDriver.buildeConnect("666666"));
        }
    }
}
