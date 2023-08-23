package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "domain_modules")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DomainModules extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dmid")
    private Long dmId;

    @Size(max = 11)
    @Column(name = "mid")
    private Integer mId;

    @Size(max = 11)
    @Column(name = "did")
    private Integer dId;

    @Size(max = 250)
    @Column(name = "license_key")
    private String licenseKey;

    @Column(name = "status")
    @Comment("1=active,0=inactive")
    private Integer status;
}
