package com.cwave.cobuyingserver.domain.alarm;


import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="alarm")
@Getter
@NoArgsConstructor
public class AlarmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="alarm_id")
    private Long AlarmId;

    @NotNull
    @Column(name="user_id")
    private Long userId;

    @NotNull
    @Column(name="content")
    private String content;

    @NotNull
    @Column(name="type")
    private String type;

    @Builder
    public AlarmEntity(Long userId, String content, String type) {
        this.userId = userId;
        this.content = content;
        this.type = type;
    }
}