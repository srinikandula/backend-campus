package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "observation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Observation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "obs_id")
    private Long obsId;

    @Size(max = 255)
    @Column(name = "obs_name")
    private String obsName;

    @Size(max = 255)
    @Column(name = "obs_status")
    private String obsStatus;
}
