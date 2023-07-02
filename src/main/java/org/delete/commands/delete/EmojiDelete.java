package org.delete.commands.delete;

import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.entities.emoji.RichCustomEmoji;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.List;

public class EmojiDelete {
    public EmojiDelete(MessageReceivedEvent event) {
        List<RichCustomEmoji> emojis = event.getGuild().getEmojis();

        for (final var emoji : emojis) {
            try {
                emoji.delete().queue();

             } catch (Exception e) {
                System.out.printf("[ FAILRE ] Can't deleted Emoji %s ( %s )", emoji.getName(), emoji.getId());
            }
        }
    }
}
