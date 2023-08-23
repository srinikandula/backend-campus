package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "control_assertions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ControlAssertions extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "activity_control_id")
    private Integer activityControlId;

    @Size(max = 11)
    @Column(name = "assertion_id")
    private Integer assertionId;

    @Column(name = "creation_dt")
    private Date creationDt;
}
