package configManager;

import java.util.Map;
import java.util.HashMap;


class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> config;

    private ConfigurationManager() {
        config = new HashMap<>();
        config.put("maxPlayers", "100");
        config.put("defaultLanguage", "en");
        config.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public void printAllConfigs() {
        config.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
