package core;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
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
        JDABuilder bot = new JDABuilder(AccountType.BOT);
        bot.setToken(properties.getToken());
        bot.setAutoReconnect(true);

        try{
            jda = bot.buildBlocking();
        }catch(LoginException | InterruptedException e){
            e.printStackTrace();
        }

        bot.addEventListener(

        );

    }
}
