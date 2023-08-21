package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "gl_reclassifications")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GlReclassifications extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 20)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Enumerated(EnumType.STRING)
    @Column(name = "classification_type")
    private EClassificationType classificationType;


    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "fss_id")
    private Integer fssId;

    @Size(max = 11)
    @Column(name = "coa_id")
    private Integer coaId;


    @Size(max = 11)
    @Column(name = "cos_id")
    private Integer cosId;

    @Column(name = "amount", precision = 15, scale = 2)
    private BigDecimal amount;

    @Size(max = 11)
    @Column(name = "gl_id")
    private Integer glId;

    @Enumerated(EnumType.STRING)
    @Column(name = "mode")
    private EMode mode;


    @Size(max = 20)
    @Column(name = "location_id")
    private Long locationId;
}
