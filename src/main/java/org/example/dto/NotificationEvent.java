package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Map;
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
    private String nameSender;
    private String message;
    private String urlPhotoSender;
    private Instant createdAt;
    private NotificationType status;
    private Map<String, Object> data;
}
