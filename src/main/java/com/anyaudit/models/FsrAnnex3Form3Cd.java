package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_annex3_form_3cd",indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
        @Index(name = "client_id_index", columnList = "client_id")


})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrAnnex3Form3Cd extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lid")
    private Long lId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 100)
    @Column(name = "pertaining_to")
    private String pertainingTo;

    @Column(name = "amount_of_payment", columnDefinition = "float(11,2)")
    private Float amount_of_payment;

    @Column(name = "nature_of_payment")
    private String natureOfPayment;

    @Column(name = "name_and_address_payee")
    private String nameAndAddressPayee;

    @Column(name = "status", columnDefinition = "TINYINT(1)")
    private Integer status;

    @Size(max = 11)
    @Column(name = "created_on")
    private Integer createdOn;
}
