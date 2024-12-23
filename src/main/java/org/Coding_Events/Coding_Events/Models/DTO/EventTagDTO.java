package org.Coding_Events.Coding_Events.Models.DTO;

import jakarta.validation.constraints.NotNull;
import org.Coding_Events.Coding_Events.Models.Event;
import org.Coding_Events.Coding_Events.Models.Tag;

public class EventTagDTO {
    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO() {}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
