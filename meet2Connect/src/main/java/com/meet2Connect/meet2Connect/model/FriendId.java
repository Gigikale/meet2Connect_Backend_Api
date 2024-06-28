package com.meet2Connect.meet2Connect.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FriendId implements Serializable {
    private Long user;
    private Long friend;
}
