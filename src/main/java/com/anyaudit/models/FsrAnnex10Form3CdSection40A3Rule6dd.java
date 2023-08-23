package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "fsr_annex10_form_3cd_section_40a_3_rule_6dd",indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
        @Index(name = "client_id_index", columnList = "client_id")

})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrAnnex10Form3CdSection40A3Rule6dd extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "date_payment")
    private Date datePayment;

    @Column(name = "nature_of_payment")
    private String natureOfPayment;

    @Column(name = "amount", columnDefinition = "float(11,2)")
    private Float amount;

    @Column(name = "name_pan")
    private String namePan;

    @Column(name = "status", columnDefinition = "TINYINT(1)")
    private Integer status;

    @Column(name = "created_on")
    private Date createdOn;

}
