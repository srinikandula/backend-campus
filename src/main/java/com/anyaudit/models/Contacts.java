package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "contacts",uniqueConstraints = {
        @UniqueConstraint(name = "domain", columnNames = {"domain", "contactno"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contacts extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contactid")
    private Long contactId;

    @Size(max = 150)
    @Column(name = "contactname")
    private String contactName;

    @Size(max = 20)
    @Column(name = "contactno")
    private Integer contactNo;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;

    @Column(name = "creationdt")
    private Date creationDt;

    @Size(max = 250)
    @Column(name = "contactemail")
    private String contactEmail;
}
