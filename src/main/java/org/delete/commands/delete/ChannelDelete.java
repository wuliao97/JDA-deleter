package org.delete.commands.delete;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.Channel;
import net.dv8tion.jda.api.entities.channel.middleman.GuildChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.requests.Route;

import java.util.List;

public class ChannelDelete {
    public ChannelDelete(MessageReceivedEvent event) {
        List<GuildChannel> channels = event.getGuild().getChannels();

        for (final GuildChannel channel : channels) {
            try {
                channel.delete().queue();
            } catch (Exception e) {
                System.out.printf("[ FAILRE ] Can't deleted Channel %s ( %s )", channel.getName(), channel.getId());
            }

        }

    }
}
