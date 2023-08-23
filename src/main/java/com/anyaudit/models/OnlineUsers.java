package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Entity
@Table(name = "online_users" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OnlineUsers extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "user_id")
    private Integer userId;

    @Size(max = 11)
    @Column(name = "session_id")
    private Long sessionId;

    @Column(name = "logged_date")
    private LocalDateTime loggedDate;
}
