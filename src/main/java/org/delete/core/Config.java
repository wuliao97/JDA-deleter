package org.delete.core;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv dotenv = Dotenv.configure().directory("./config").load();

    public static String get(final String key) {
        return dotenv.get(key);
    }

    public static String getToken() {
        return Config.get("token");
    }
}
