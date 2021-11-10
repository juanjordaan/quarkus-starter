package com.oldmutual.api.audit.queue.message;

import java.util.Arrays;
import java.util.Optional;

public enum EventName {
    CREATE,
    FETCH,
    UPDATE,
    DELETE,
    UNKNOWN;

    public String getName() {
        return this.name();
    }

    public static EventName getEvent(String name) {
        return resolveEvent(name, values()).orElse(UNKNOWN);
    }

    private static Optional<EventName> resolveEvent(String name, EventName[] eventNames) {
        return Arrays.stream(eventNames)
                .filter(event -> event.getName().equals(name))
                .findFirst();
    }
}
