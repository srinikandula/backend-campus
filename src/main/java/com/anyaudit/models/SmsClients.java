package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
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
    private int clientId;

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

    @Size(max = 20)
    @Column(name = "owner_num", nullable = false)
    private Long ownerNum;

    @Size(max = 100)
    @Column(name = "accountant_name", nullable = false)
    private String accountantName;

    @Size(max = 20)
    @Column(name = "accountant_num", nullable = false)
    private Long accountantNum;

    @Size(max = 250)
    @Column(name = "address", nullable = false)
    private String address;

    @Size(max = 11)
    @Column(name = "asgclient_id", nullable = false)
    private int asgClientId;

    @Size(max = 10)
    @Column(name = "status", nullable = false)
    private String status;


    @Column(name = "client_creationdt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date clientCreationDt;

    @Size(max = 11)
    @Column(name = "domain_id", nullable = false)
    private int domainId;

    @Size(max = 11)
    @Column(name = "coa_head_id", nullable = false)
    private int coaHeadId;

    @Size(max = 11)
    @Column(name = "cos_head_id", nullable = false)
    private int cosHeadId;

    @Size(max = 11)
    @Column(name = "fss_head_id", nullable = false)
    private int fssHeadId;

    @Size(max = 11)
    @Column(name = "branch_id", nullable = false)
    private int branchId;

    @Size(max = 4)
    @Column(name = "main_or_sub")
    private Boolean mainOrSub;

    @Size(max = 11)
    @Column(name = "assignment_id", columnDefinition = "int default null")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "company_id", columnDefinition = "int default null")
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

    @Lob
    @Column(name = "accounting_package", nullable = false)
    private String accountingPackage;

    @Lob
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

    @Size(max = 4)
    @Column(name = "is_fss_updated", nullable = false)
    private Boolean isFssUpdated;

    @Size(max = 10)
    @Column(name = "is_repeated", nullable = false)
    private Integer isRepeated;

    @Size(max = 1)
    @Column(name = "is_cloned", columnDefinition = "tinyint default 0")
    private Boolean isCloned;


}
