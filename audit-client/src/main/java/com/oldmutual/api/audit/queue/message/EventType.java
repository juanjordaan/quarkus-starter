package com.oldmutual.api.audit.queue.message;

import java.util.Arrays;
import java.util.Optional;

enum EventType {
    SWITCH_SALARY,
    SWITCH_DEBIT_ORDER,
    UNKNOWN
    ;

    public String getName() {
        return this.name();
    }

    public static EventType getType(String type) {
        return resolveEvent(type, values()).orElse(UNKNOWN);
    }

    private static Optional<EventType> resolveEvent(String type, EventType[] eventTypes) {
        return Arrays.stream(eventTypes)
                .filter(event -> event.getName().equals(type))
                .findFirst();
    }
}
