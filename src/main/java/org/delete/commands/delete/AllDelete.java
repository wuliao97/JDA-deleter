package org.delete.commands.delete;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class AllDelete extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();
        switch (message) {
            case "alldelete" -> {
                new ChannelDelete(event);
                new RoleDelete(event);
                new EmojiDelete(event);
            }
            case "roledel" -> new RoleDelete(event);
            case "emojidel" -> new EmojiDelete(event);
            case "channeldel" -> new ChannelDelete(event);
        }
    }
}
