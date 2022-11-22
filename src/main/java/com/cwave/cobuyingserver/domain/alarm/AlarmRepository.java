package com.cwave.cobuyingserver.domain.alarm;

import com.cwave.cobuyingserver.domain.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlarmRepository extends JpaRepository<UserEntity, Long> {
    List<AlarmEntity> findByUserId(Long userId);
}
