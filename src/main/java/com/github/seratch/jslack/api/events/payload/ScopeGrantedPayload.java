package com.github.seratch.jslack.api.events.payload;

import com.github.seratch.jslack.api.model.event.ScopeGrantedEvent;
import lombok.Data;

import java.util.List;

@Data
public class ScopeGrantedPayload implements EventsApiPayload<ScopeGrantedEvent> {

    private String token;
    private String teamId;
    private String apiAppId;
    private ScopeGrantedEvent event;
    private String type;
    private List<String> authedUsers;
    private String eventId;
    private Integer eventTime;

}
