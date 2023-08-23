package com.anyaudit.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "contactgroupsdata")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContactGroupsData extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gdataid")
    private Long gdataId;

    @Size(max = 11)
    @Column(name = "gid")
    private Integer gId;

    @Size(max = 11)
    @Column(name = "contactid")
    private Integer contactId;

    @Column(name = "entereddt")
    private Date enteredDt;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;
}
