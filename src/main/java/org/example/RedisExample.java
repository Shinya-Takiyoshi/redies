package org.example;

import redis.clients.jedis.Jedis;

public class RedisExample {
    public static void main(String[] args) {
        // Redisに接続
        try (Jedis jedis = new Jedis("localhost", 6379)) {
            // Redisにキーと値を設定
            String key = "myKey";
            String value = "Hello, Redis!";
            jedis.set(key, value);

            // 値を取得して出力
            String retrievedValue = jedis.get(key);
            System.out.println("Stored value in Redis: " + retrievedValue);

            // 値を更新
            String newValue = "Updated Value";
            jedis.set(key, newValue);

            // 更新された値を取得して出力
            String updatedValue = jedis.get(key);
            System.out.println("Updated value in Redis: " + updatedValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
