package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "assignment_scheduler")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Milestone extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "activity_name")
    private String milestoneName;

    @Column(name = "activity_type")
    private String activityType;

}
