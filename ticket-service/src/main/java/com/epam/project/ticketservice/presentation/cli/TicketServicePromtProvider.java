package com.epam.project.ticketservice.presentation.cli;

import org.jline.utils.AttributedString;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;



@Component
public class TicketServicePromtProvider implements PromptProvider {

    @Override
    public AttributedString getPrompt() {
        return new AttributedString("TicketService# ");
    }
}
