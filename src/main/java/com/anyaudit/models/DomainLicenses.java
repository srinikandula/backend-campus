package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "domain_licenses",uniqueConstraints = {
        @UniqueConstraint(name = "license_key", columnNames = {"license_key"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DomainLicenses extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dmid")
    private Long dmId;

    @Size(max = 250)
    @Column(name = "license_key")
    private String licenseKey;

    @Size(max = 10)
    @Column(name = "did")
    private Integer dId;

    @Column(name = "status")
    @Comment("1=active,0=inactive")
    private Integer status;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "start_dt")
    private Date startDt;

    @Column(name = "end_dt")
    private Date endDt;
}
