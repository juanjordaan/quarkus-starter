package com.oldmutual.api.audit.queue.message;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@ToString
public class AuditEventMessage implements Serializable {
    private Long id;
    private QueueableAuditEvent parentAuditEvent;
    private List<QueueableAuditEvent> childAuditEvents;
    private Map<QueueableAuditEvent, QueueableAuditEvent> externalAuditEvents;
    private String moduleCode;
    //Flag to indicate whether the audit occurs outside of a http session or not e.g. async process continues after http request responded to
    private boolean isOutOfSession;
}
