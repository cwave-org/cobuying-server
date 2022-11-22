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

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    @Builder
    public UserEntity(String fcmToken, String email, String nickname, String profileImg) {
        this.fcmToken = fcmToken;
        this.email = email;
        this.nickname = nickname;
        this.profileImg = profileImg;
    }
    //그룹 List
    //등록한 상품(1:N)
    //작성한 게시글(1:N)
    //작성한 폼(1:N)
}
