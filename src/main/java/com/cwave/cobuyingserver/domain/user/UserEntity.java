package com.cwave.cobuyingserver.domain.user;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="user")
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @NotNull
    @Column(name="email")
    private String email;

    @NotNull
    @Column(name="nickname")
    private String nickname;

    @NotNull
    @Column(name="fcm_token")
    private String fcmToken;

    @Column(name="profile_img")
    private String profileImg;

    @NotNull
    @Column(name="created_at")
    private LocalTime createdAt;

    @NotNull
    @Column(name="updated_at")
    private LocalTime updatedAt;

    @Column(name="alarm")
    private Boolean alarm;

    //그룹 List
    //등록한 상품(1:N)
    //작성한 게시글(1:N)
    //작성한 폼(1:N)
}
