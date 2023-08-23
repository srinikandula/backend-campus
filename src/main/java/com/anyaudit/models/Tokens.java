package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tokens")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tokens extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "token")
    private String token;

    @Size(max = 20)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "device_id")
    private String deviceId;

    @Size(max = 20)
    @Column(name = "current_latitude")
    private String currentLatitude;

    @Size(max = 255)
    @Column(name = "current_longitude")
    private String currentLongitude;

}
