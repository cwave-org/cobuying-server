package com.cwave.cobuyingserver.service.user;

import com.cwave.cobuyingserver.config.ResponseConfig;
import com.cwave.cobuyingserver.controller.v1.user.request.UserRequest;
import com.cwave.cobuyingserver.domain.user.UserEntity;
import com.cwave.cobuyingserver.domain.user.UserRepository;
import com.cwave.cobuyingserver.service.user.request.CreateUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;

    //회원 등록
    public ResponseEntity<?> createUser(UserRequest userRequest) {

        //신규회원 검사
        UserEntity userEntity = userRepository.findByEmail(userRequest.email());

        if(userEntity != null) {
           return ResponseEntity.status(200)
                   .body(ResponseConfig.builder()
                           .code(200)
                           .message("이미 가입된 회원입니다.")
                           .data(userEntity.getUserId())
                           .build());
        }

        userEntity = createUserEntity(userRequest);
        UserEntity savedUserEntity = userRepository.save(userEntity);

        return ResponseEntity.status(200)
                .body(ResponseConfig.builder()
                        .code(200)
                        .message("새로 가입한 회원입니다.")
                        .data(userEntity.getUserId())
                        .build());
    }


    private UserEntity createUserEntity(UserRequest userRequest) {
        return UserEntity.builder()
                .fcmToken(userRequest.fcmToken())
                .email(userRequest.email())
                .nickname(userRequest.nickname())
                .profileImg(userRequest.profileImg())
                .build();
    }
}
