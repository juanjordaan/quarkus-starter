package com.oldmutual.api.audit.queue.message;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ToString
public class QueueableAuditEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private String targetResource;
    private String sessionId;
    private String eventType;
    private String eventName;
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

    public QueueableAuditEvent(AuditEvent auditEvent) {
        this.targetResource = auditEvent.getTargetResource();
        this.sessionId = auditEvent.getSessionId();
        this.eventType = (auditEvent.getEventType() != null)? auditEvent.getEventType().getName() : null;
        this.eventName = (auditEvent.getEventName() != null)? auditEvent.getEventName().getName() : null;
        this.ipAddress = auditEvent.getIpAddress();
        this.deviceId = auditEvent.getDeviceId();
        this.deviceManufacturer = auditEvent.getDeviceManufacturer();
        this.deviceModel = auditEvent.getDeviceModel();
        this.devicePlatform = auditEvent.getDevicePlatform();
        this.customerId = auditEvent.getCustomerId();
        this.userId = auditEvent.getUserId();
        this.apiVersion = auditEvent.getApiVersion();
        this.clientAppVersion = auditEvent.getClientAppVersion();
        this.details = auditEvent.getDetails();
        this.rawMessage = auditEvent.getRawMessage();
        this.createdDate = auditEvent.getCreatedDate();
        this.moduleCode = auditEvent.getModuleCode();
    }
}
