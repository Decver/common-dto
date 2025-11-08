package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationEvent {
    private String eventId;
    private NotificationType eventType;
    private UUID senderId;
    private UUID receiverId;
    private String message;
    private Instant createdAt;
    private Map<String, Object> data;
}
