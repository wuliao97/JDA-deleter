package org.delete.commands.delete;

import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.List;

public class RoleDelete {
    public RoleDelete(MessageReceivedEvent event) {
        List<Role> roles = event.getGuild().getRoles();
        for (final Role role : roles) {
            try {
                if (role.getTags().isBot() || role.getTags().hasSubscriptionListing() || role.getTags().isIntegration()){
                    continue;
                }
                role.delete().queue();
            } catch (Exception e) {
                System.out.printf("[ FAILRE ] Can't deleted Role %s ( %s )", role.getName(), role.getId());
            }
        }
    }
}
