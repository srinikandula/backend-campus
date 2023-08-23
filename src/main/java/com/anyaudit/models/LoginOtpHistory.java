package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "login_otp_history")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginOtpHistory extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id", length = 255)
    private String userId;

    @Column(name = "ip",length = 40)
    private String ip;

    @Column(name = "session_id", length = 200)
    private String sessionId;

    @Column(name = "otp")
    private Integer otp;


}
