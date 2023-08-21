package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "loc_master",
        uniqueConstraints = {
                @UniqueConstraint(name = "loc_name", columnNames = {"loc_name", "client_id"}),
                @UniqueConstraint(name = "loc_name_2", columnNames = {"loc_name", "client_id"})


        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LocMaster extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lid")
    private Long lId;

    @Size(max = 250)
    @Column(name = "loc_name")
    private String locName;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;
}
