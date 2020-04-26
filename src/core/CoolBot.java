package core;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class CoolBot {

    private static JDA jda;
    private static JsonParser properties;

    public static void main(String[] args){
        CoolBot coolbot = new CoolBot();
        coolbot.run();
    }

    private void run(){
        properties = new JsonParser();
        System.out.println(properties.getToken());
        jda = null;
        try {
            jda = new JDABuilder("").build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }
}
