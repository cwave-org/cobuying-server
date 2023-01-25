package com.cwave.cobuyingserver.domain.user;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="users")
@Getter
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId;

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

    //내가 등록한 상품(json)

    //내가 참여한 공구(json)

    //내가 찜한 상품(json)

    //그룹 List
    //등록한 상품(1:N)
    //작성한 게시글(1:N)
    //작성한 폼(1:N)

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setAlarm(Boolean alarm) {this.alarm = alarm;}
    @Builder
    public UserEntity(String fcmToken, String email, String nickname, String profileImg, Boolean alarm) {
        this.fcmToken = fcmToken;
        this.email = email;
        this.nickname = nickname;
        this.profileImg = profileImg;
        this.alarm = alarm;
    }

}
