package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "sms_clients")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SmsClients extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;

    @Size(max = 255)
    @Column(name = "client_name")
    private String clientName;

    @Size(max = 30)
    @Column(name = "fileno")
    private String fileNo;

    @Size(max = 100)
    @Column(name = "client_email")
    private String clientEmail;

    @Size(max = 20)
    @Column(name = "client_pan")
    private String clientPan;

    @Size(max = 255)
    @Column(name = "phone")
    private String phone;

    @Size(max = 100)
    @Column(name = "owner_name")
    private String ownerName;

    @Size(max = 100)
    @Column(name = "owner_num")
    private String ownerNum;

    @Size(max = 100)
    @Column(name = "accountant_name")
    private String accountantName;


    @Digits(integer = 20, fraction = 0)
    @Column(name = "accountant_num")
    private Long accountantNum;

    @Size(max = 250)
    @Column(name = "address")
    private String address;

    @Size(max = 11)
    @Column(name = "asgclient_id")
    private Integer asgClientId;


    @Size(max = 10)
    @Column(name = "status")
    private String status;


    @Column(name = "client_creationdt")
    private Date clientCreationDt;

    @Size(max = 11)
    @Column(name = "domain_id")
    private int domainId;

    @Size(max = 11)
    @Column(name = "coa_head_id")
    private int coaHeadId;

    @Size(max = 11)
    @Column(name = "cos_head_id")
    private int cosHeadId;

    @Size(max = 11)
    @Column(name = "fss_head_id")
    private int fssHeadId;

    @Size(max = 11)
    @Column(name = "branch_id")
    private int branchId;

    @Column(name = "main_or_sub",columnDefinition = "TINYINT(4)")
    private Byte mainOrSub;

    @Comment("its a dummy used for excel upload")
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Comment("its a dummy used for excel upload")
    @Column(name = "company_id")
    private Integer companyId;

    @Size(max = 30)
    @Column(name = "nationality")
    private String nationality;

    @Size(max = 100)
    @Column(name = "website", nullable = false)
    private String website;

    @Size(max = 50)
    @Column(name = "contact_person")
    private String contactPerson;


    @Column(name = "accounting_package")
    private String accountingPackage;


    @Column(name = "registered_address")
    private String registeredAddress;

    @Size(max = 80)
    @Column(name = "cin")
    private String cin;

    @Size(max = 30)
    @Column(name = "registration_no")
    private String registrationNo;

    @Size(max = 50)
    @Column(name = "iec")
    private String iec;

    @Size(max = 30)
    @Column(name = "pf_reg_no")
    private String pfRegNo;

    @Size(max = 30)
    @Column(name = "esi_reg_no")
    private String esiRegNo;

    @Size(max = 30)
    @Column(name = "pt_reg_no")
    private String ptRegNo;

    @Column(name = "is_fss_updated", columnDefinition = "TINYINT(4) default '0'")
    private Integer isFssUpdated;

    @Size(max = 10)
    @Column(name = "is_repeated")
    private Integer isRepeated;

    @Column(name = "is_cloned", columnDefinition = "TINYINT(1) default '0'")
    private Integer isCloned;


}
