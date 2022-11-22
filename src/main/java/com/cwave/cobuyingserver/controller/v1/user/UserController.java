package com.cwave.cobuyingserver.controller.v1.user;

import com.cwave.cobuyingserver.config.ResponseConfig;
import com.cwave.cobuyingserver.controller.v1.user.request.UserRequest;
import com.cwave.cobuyingserver.controller.v1.user.response.UserResponse;
import com.cwave.cobuyingserver.service.user.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping("")
    @ApiOperation(value = "회원을 등록한다.", response = UserResponse.class)
    public ResponseEntity<?> createProduct(@RequestBody UserRequest userRequest) {
        return userServiceImpl.createUser(userRequest);
    }

    @GetMapping("")
    @ApiOperation(value = "회원을 조회한다.", response = UserResponse.class)
    public ResponseEntity<?> getUser(@RequestParam String email) {
        return userServiceImpl.getUser(email);
    }


}
