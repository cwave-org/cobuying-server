package com.cwave.cobuyingserver.service.alarm;

import com.cwave.cobuyingserver.config.ResponseConfig;
import com.cwave.cobuyingserver.controller.v1.alarm.request.AlarmRequest;
import com.cwave.cobuyingserver.domain.alarm.AlarmEntity;
import com.cwave.cobuyingserver.domain.alarm.AlarmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlarmServiceImpl {
    private final AlarmRepository alarmRepository;

    //알람등록
    public ResponseEntity<?> makeAlarm (AlarmRequest alarmRequest) {

        AlarmEntity alarmEntity = createAlarmEntity(alarmRequest);
        AlarmEntity savedAlarmEntity = alarmRepository.save(alarmEntity);

        return ResponseEntity.status(200)
                .body(ResponseConfig.builder()
                        .code(200)
                        .message("새로 만든 알람입니다.")
                        .data(alarmEntity.getAlarmId())
                        .build());
    }

    private AlarmEntity createAlarmEntity(AlarmRequest alarmRequest) {
        return AlarmEntity.builder()
                .type(alarmRequest.type())
                .content(alarmRequest.content())
                .userId(alarmRequest.userId())
                .build();
    }

}
