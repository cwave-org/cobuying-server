package com.cwave.cobuyingserver.controller.v1.user;

import com.cwave.cobuyingserver.config.ResponseConfig;
import com.cwave.cobuyingserver.controller.v1.user.request.UserRequest;
import com.cwave.cobuyingserver.controller.v1.user.response.UserResponse;
import com.cwave.cobuyingserver.service.user.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping("")
    @ApiOperation(value = "회원을 등록한다.", response = UserResponse.class)
    public ResponseEntity<?> createProduct(@RequestBody UserRequest userRequest) {
        return ResponseEntity.status(200)
                .body(ResponseConfig.builder()
                        .code(200)
                        .message("success")
                        .data(UserResponse.builder().id("1").build())
                        .build());
    }

}
