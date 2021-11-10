package com.oldmutual.api.audit.queue.message;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class AuditEvent implements Comparable<AuditEvent> {

    private String targetResource;
    private String sessionId;
    private EventType eventType;
    private EventName eventName;
    private String ipAddress;
    private String deviceId;
    private String deviceManufacturer;
    private String deviceModel;
    private String devicePlatform;
    private Long customerId;
    private Long userId;
    private String apiVersion;
    private String clientAppVersion;
    private String details;
    private String rawMessage;
    private LocalDateTime createdDate;
    private String moduleCode;

    @Override
    public int compareTo(AuditEvent o) {
        return this.getCreatedDate().compareTo(o.getCreatedDate());
    }
}
