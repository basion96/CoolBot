package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;

public class PingPongCommand extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event){
        if(event.getMessage().getContentDisplay().equals("!ping")){
            event.getChannel().sendMessage("Pong!").queue();
        }
        else if(event.getMessage().getContentDisplay().equals("!fuckyou")){
            event.getChannel().sendMessage("NO, FUCK YOU").queue();
            event.getChannel().sendFile(new File("resources/images/middle-finger.jpg")).queue();
        }
    }
}
