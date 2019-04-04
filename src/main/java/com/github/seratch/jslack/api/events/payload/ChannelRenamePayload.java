package com.github.seratch.jslack.api.events.payload;

import com.github.seratch.jslack.api.model.event.ChannelRenameEvent;
import lombok.Data;

import java.util.List;

@Data
public class ChannelRenamePayload implements EventsApiPayload<ChannelRenameEvent> {

    private String token;
    private String teamId;
    private String apiAppId;
    private ChannelRenameEvent event;
    private String type;
    private List<String> authedUsers;
    private String eventId;
    private Integer eventTime;

}
