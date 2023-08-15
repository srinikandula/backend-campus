package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private Integer clientId;

    @Size(max = 255)
    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Size(max = 30)
    @Column(name = "fileno")
    private String fileNo;

    @Size(max = 100)
    @Column(name = "client_email", nullable = false)
    private String clientEmail;

    @Size(max = 20)
    @Column(name = "client_pan")
    private String clientPan;

    @Size(max = 255)
    @Column(name = "phone")
    private String phone;

    @Size(max = 100)
    @Column(name = "owner_name", nullable = false)
    private String ownerName;


    @Column(name = "owner_num", nullable = false, length = 20)
    private Long ownerNum;

    @Size(max = 100)
    @Column(name = "accountant_name", nullable = false)
    private String accountantName;

    @NotNull
    @Digits(integer = 20, fraction = 0)
    @Column(name = "accountant_num", nullable = false)
    private Long accountantNum;

    @Size(max = 250)
    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "asgclient_id", nullable = false,length = 11)
    private int asgClientId;


    @Size(max = 10)
    @Column(name = "status", nullable = false)
    private String status;


    @Column(name = "client_creationdt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date clientCreationDt;


    @Column(name = "domain_id", nullable = false,length = 11)
    private int domainId;


    @Column(name = "coa_head_id", nullable = false,length = 11)
    private int coaHeadId;


    @Column(name = "cos_head_id", nullable = false,length = 11)
    private int cosHeadId;

    @Column(name = "fss_head_id", nullable = false,length = 11)
    private int fssHeadId;


    @Column(name = "branch_id", nullable = false,length = 11)
    private int branchId;

    @Column(name = "main_or_sub",length = 4, columnDefinition = "tinyint")
    private Byte mainOrSub;


    @Column(name = "assignment_id",length = 11 ,columnDefinition = "int default null")
    private Integer assignmentId;

    @Column(name = "company_id",length = 11,columnDefinition = "int default null")
    private Integer companyId;

    @Size(max = 30)
    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Size(max = 100)
    @Column(name = "website", nullable = false)
    private String website;

    @Size(max = 50  )
    @Column(name = "contact_person", nullable = false)
    private String contactPerson;


    @Column(name = "accounting_package", nullable = false)
    private String accountingPackage;


    @Column(name = "registered_address", nullable = false)
    private String registeredAddress;

    @Size(max = 80)
    @Column(name = "cin", nullable = false)
    private String cin;

    @Size(max = 30)
    @Column(name = "registration_no", nullable = false)
    private String registrationNo;

    @Size(max = 50)
    @Column(name = "iec", nullable = false)
    private String iec;

    @Size(max = 30)
    @Column(name = "pf_reg_no", nullable = false)
    private String pfRegNo;

    @Size(max = 30)
    @Column(name = "esi_reg_no", nullable = false)
    private String esiRegNo;

    @Size(max = 30)
    @Column(name = "pt_reg_no", nullable = false)
    private String ptRegNo;


    @Column(name = "is_fss_updated", nullable = false)
    private Boolean isFssUpdated;

    @Column(name = "is_repeated",length = 10,nullable = false)
    private Integer isRepeated;


    @Column(name = "is_cloned", columnDefinition = "tinyint default 0")
    private Boolean isCloned;


}
