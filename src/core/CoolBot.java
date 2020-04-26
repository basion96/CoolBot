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
        jda = null;
        try {
            jda = JDABuilder.createDefault("").build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }
}
