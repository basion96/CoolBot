package core;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import javax.security.auth.login.LoginException;

public class CoolBot {

    public static JDA jda;

    public static void main(String[] args){
        CoolBot coolbot = new CoolBot();
        coolbot.run();
    }

    private void run(){
        JDABuilder bot = new JDABuilder(AccountType.BOT);
        bot.setToken("NzAzNDg5NTk2MjQ3MjQ0ODcx.XqPXsA.6s7yLL2kEi02jDLVx_tl9s6U4oY");
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
