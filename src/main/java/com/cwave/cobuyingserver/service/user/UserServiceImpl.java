package com.cwave.cobuyingserver.service.user;

import com.cwave.cobuyingserver.controller.v1.user.request.UserRequest;
import com.cwave.cobuyingserver.domain.user.UserEntity;
import com.cwave.cobuyingserver.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;

    //회원 DB에 저장
//    public UserDto saveUser(UserRequest userRequest) {
//        UserEntity userEntity = userRepository.save(userDto.toEntity());
//        return userEntity.toDto();
//    }
    //기존에 있는 회원인지 확인

    //없다면 저장하고

    //있다면 ID값 반환
}
