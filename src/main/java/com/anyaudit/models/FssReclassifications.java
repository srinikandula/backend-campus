package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "fss_reclassifications", indexes = {
        @Index(name = "client_id_index", columnList = "client_id"),
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
        @Index(name = "location_id_index", columnList = "location_id")
}  )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FssReclassifications extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "client_id")   //FK:sms_clients
    private Integer clientId;

    @Column(name = "assignment_id")   //FK:sms_works
    private Integer assignmentId;


    @Column(name = "location_id")   //FK:loc_master
    private Integer locationId;


    @Column(name = "transaction_id")
    private Long transactionId;

    @Size(max = 11)
    @Column(name = "gl_id")
    private Integer glId;

    @Enumerated(EnumType.STRING)
    @Column(name = "classification_type")
    private EClassificationType classificationType;


    @Column(name = "fss_assignment_level_id")   //FK:fss_assignment_level
    private Integer fssAssignmentLevelId;


    @Column(name = "fss_client_level_id")   //FK:fss_client_level
    private Integer fssClientLevelId;

    @Column(name = "amount", columnDefinition = "decimal(15,2)")
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "mode")
    private EMode mode;


    @Size(max = 4)
    @Column(name = "is_system_generated")
    private Integer isSystemGenerated;

}


