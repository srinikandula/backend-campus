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
@Table(name = "udin",
        indexes = {
                @Index(name = "client_index", columnList = "client"),
                @Index(name = "assignment_index", columnList = "assignment")

        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Udin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "udin_id")
    private Long udinId;

    @Size(max = 11)
    @Column(name = "client")
    private Integer client;

    @Size(max = 11)
    @Column(name = "assignment")
    private Integer assignment;

    @Column(name = "description")
    private String description;

    @Size(max = 30)
    @Column(name = "udin_no")
    private String udinNo;

    @Size(max = 11)
    @Column(name = "issued_by")
    private Integer issuedBy;

    @Size(max = 250)
    @Column(name = "attachment")
    private String attachment;

    @Column(name = "status")
    @Comment("1=approved,2=notapproved")
    private Integer status;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;

    @Column(name = "date_udin")
    private Date dateUdin;

    @Column(name = "date_certificate")
    private Date dateCertificate;

    @Column(name = "issued_date")
    private Date issuedDate;

    @Size(max = 11)
    @Column(name = "generated_by")
    private Integer generatedBy;

    @Size(max = 11)
    @Column(name = "tobe_approved")
    private Integer tobeApproved;
}
