package TankWar;
/**
 * 用于读取配置文件；
 * 尝试使用Java语言中的配置文件；
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
    private static Properties properties = new Properties();

    static {
        try {
            //properties.load(Property.class.getClassLoader().getResourceAsStream("E:\\Java\\src\\TankWar\\tankwar.properties"));
            properties.load(new FileInputStream("E:\\Java\\src\\TankWar\\tankwar.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyValue(String key) {
        return properties.getProperty(key);
    }
}
