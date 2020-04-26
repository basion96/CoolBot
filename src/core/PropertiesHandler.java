package core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesHandler {
    private Properties config;
    private OutputStream out;

    public PropertiesHandler(){
        config = new Properties();
        String path = "resources/botData.properties";
        try {
            config.load(new FileInputStream(path));
        }catch (IOException e){
            System.out.println("could not find "+path.substring(path.lastIndexOf("/")+1)+"\n" + e);
        }

        System.out.println(path.substring(path.lastIndexOf("/")+1) + " loaded");
    }

    public String getToken(){
        return config.getProperty("Token");
    }

    public String getPrefix(){
        return config.getProperty("Prefix");
    }
}
