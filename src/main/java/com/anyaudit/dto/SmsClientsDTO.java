package com.anyaudit.dto;


import lombok.*;


import javax.persistence.Lob;
import javax.validation.constraints.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class SmsClientsDTO {
    private Integer clientId;

    @NotBlank(message = "Client name cannot be empty")
    @Size(max = 255, message = "Client name cannot exceed {max} characters")
    private String clientName;

    @Size(max = 30, message = "File number cannot exceed {max} characters")
    private String fileNo;

    @NotEmpty(message = "Client email cannot be empty")
    @Email(message = "Invalid email format")
    @Size(max = 100, message = "Client email cannot exceed {max} characters")
    private String clientEmail;

    @Size(max = 20, message = "Client PAN cannot exceed {max} characters")
    private String clientPan;

    @Size(max = 13, message = "Phone number cannot exceed {max} characters")
    private String phone;

    @NotEmpty(message = "Owner name cannot be empty")
    @Size(max = 100, message = "Owner name cannot exceed {max} characters")
    private String ownerName;

    @NotNull(message = "Owner number cannot be null")
    private Long ownerNum;

    @NotEmpty(message = "Accountant name cannot be empty")
    @Size(max = 100, message = "Accountant name cannot exceed {max} characters")
    private String accountantName;

    @NotNull(message = "Accountant number cannot be null")
    @Digits(integer = 20, fraction = 0, message = "Invalid accountant number format")
    private Long accountantNum;

    @NotEmpty(message = "Address cannot be empty")
    @Size(max = 250, message = "Address cannot exceed {max} characters")
    private String address;

    @NotNull(message = "ASG client ID cannot be null")
    @Digits(integer = 11, fraction = 0, message = "ASG client ID must be a numeric value with up to 11 digits")
    private Integer asgClientId;

    @NotEmpty(message = "Status cannot be empty")
    @Size(max = 10, message = "Status cannot exceed {max} characters")
    private String status;

    @NotNull(message = "Client creation date cannot be null")
    private Date clientCreationDt;

    @NotNull(message = "Domain ID cannot be null")
    @Digits(integer = 11, fraction = 0, message = "Domain ID must be a numeric value with up to 11 digits")
    private Integer domainId;

    @NotNull(message = "COA head ID cannot be null")
    @Digits(integer = 11, fraction = 0, message = "COA head ID must be a numeric value with up to 11 digits")
    private Integer coaHeadId;

    @NotNull(message = "COS head ID cannot be null")
    @Digits(integer = 11, fraction = 0, message = "COS head ID must be a numeric value with up to 11 digits")
    private Integer cosHeadId;

    @NotBlank(message = "FSS head ID cannot be blank")
    @Pattern(regexp = "\\d{1,11}", message = "FSS head ID must be a numeric value with up to 11 digits")
    private String fssHeadId;

    @NotNull(message = "Branch ID cannot be null")
    @Digits(integer = 11, fraction = 0, message = "Branch ID must be a numeric value with up to 11 digits")
    private Integer branchId;

    @Digits(integer = 4, fraction = 0, message = "Main or Sub value must be a numeric value with up to 4 digits")
    private Byte mainOrSub;


    @Digits(integer = 11, fraction = 0, message = "Assignment ID must be a numeric value with up to 11 digits")
    private Integer assignmentId;

    @NotNull(message = "Company ID cannot be null")
    @Digits(integer = 11, fraction = 0, message = "Company ID must be a numeric value with up to 11 digits")
    private Integer companyId;

    @NotEmpty(message = "Nationality cannot be empty")
    @Size(max = 30, message = "Nationality cannot exceed {max} characters")
    private String nationality;

    @NotEmpty(message = "Website cannot be empty")
    @Size(max = 100, message = "Website cannot exceed {max} characters")
    private String website;

    @NotEmpty(message = "Contact person cannot be empty")
    @Size(max = 50, message = "Contact person cannot exceed {max} characters")
    private String contactPerson;

    @NotEmpty(message = "Accounting package cannot be empty")
    @Lob
    private String accountingPackage;

    @NotEmpty(message = "Registered address cannot be empty")
    @Lob
    private String registeredAddress;

    @NotEmpty(message = "CIN cannot be empty")
    @Size(max = 80, message = "CIN cannot exceed {max} characters")
    private String cin;

    @NotEmpty(message = "Registration number cannot be empty")
    @Size(max = 30, message = "Registration number cannot exceed {max} characters")
    private String registrationNo;

    @NotEmpty(message = "IEC cannot be empty")
    @Size(max = 50, message = "IEC cannot exceed {max} characters")
    private String iec;

    @NotEmpty(message = "PF registration number cannot be empty")
    @Size(max = 30, message = "PF registration number cannot exceed {max} characters")
    private String pfRegNo;

    @NotEmpty(message = "ESI registration number cannot be empty")
    @Size(max = 30, message = "ESI registration number cannot exceed {max} characters")
    private String esiRegNo;

    @NotEmpty(message = "PT registration number cannot be empty")
    @Size(max = 30, message = "PT registration number cannot exceed {max} characters")
    private String ptRegNo;

    @NotNull(message = "FSS updated flag cannot be null")
    private Boolean isFssUpdated;

    @NotNull(message = "Repeated flag cannot be null")
    @Digits(integer = 10, fraction = 0, message = "Repeated flag must be a numeric value with up to 10 digits")
    private Integer isRepeated;

    private Boolean isCloned;

}
