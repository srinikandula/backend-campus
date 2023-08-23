package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contactgroups")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contactgroups extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gid")
    private Long gId;

    @Size(max = 70)
    @Column(name = "groupname")
    private String groupName;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;
}
