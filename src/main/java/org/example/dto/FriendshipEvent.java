package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FriendshipEvent {
    private UUID senderId;
    private String nameSender;
    private String urlPhotoSender;
    private UUID receiverId;
    private String status;
}
