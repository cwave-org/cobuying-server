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
    private Long user_id;

    @NotNull
    @Column(name="content")
    private String content;

    @NotNull
    @Column(name="type")
    private String type;

    @Builder
    public AlarmEntity(Long user_id, String content, String type) {
        this.user_id = user_id;
        this.content = content;
        this.type = type;
    }
}