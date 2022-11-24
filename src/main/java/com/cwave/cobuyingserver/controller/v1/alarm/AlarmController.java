package com.cwave.cobuyingserver.controller.v1.alarm;

import com.cwave.cobuyingserver.controller.v1.alarm.request.AlarmRequest;
import com.cwave.cobuyingserver.controller.v1.user.request.UserRequest;
import com.cwave.cobuyingserver.controller.v1.user.response.UserResponse;
import com.cwave.cobuyingserver.service.alarm.AlarmServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/alarms")
@RequiredArgsConstructor
public class AlarmController {

    private final AlarmServiceImpl alarmServiceImpl;

    @PostMapping("")
    @ApiOperation(value = "알람을 보낸다.", response = UserResponse.class)
    public ResponseEntity<?> createProduct(@RequestBody AlarmRequest alarmRequest) {
        return alarmServiceImpl.makeAlarm(alarmRequest);
    }
}
