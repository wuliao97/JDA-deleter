package org.delete.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class GetGuildInfo {
    public void getChannels(MessageReceivedEvent event) {
        var channels = event.getGuild().getChannels();

        for (final var channel : channels) {
            if (channel.getType().toString() == "CATEGORY") {
                System.out.println(channel.getName());
            } else {
                System.out.println("-".concat(channel.getName()));
            }
        }
    }
}
