package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "dc_chartofaccounts", indexes = {
        @Index(name = "company_id_index", columnList = "company_id"),
        @Index(name = "fss_line_id_index", columnList = "fss_line_id")
}, uniqueConstraints = {
        @UniqueConstraint(name = "unique_gl_code", columnNames = {"gl_name", "company_id", "gl_code"})
} )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DcChartofaccounts extends BaseModel{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "gl_name", length = 100)
    private String glName;

    @Column(name = "gl_code", length = 100)
    private String glCode;

    @Column(name = "fss_line_id")
    private Integer fssLineId;


    @Enumerated(EnumType.STRING)
    @Column(name = "py_fss_line_id")
    private PyFssLineIdEnum pyFssLineId;

    @Column(name = "fss_name", length = 255)
    private String fssName;

    @Column(name = "parking_id")
    private Integer parkingId;

    @Column(name = "remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "batch_id")
    private Integer batchId;

    @Column(name = "approved_by")
    private Integer approvedBy;

    @Column(name = "status")
    private Integer status;

    @Column(name = "is_party")
    private Boolean isParty;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "assignment_id", columnDefinition = "int default 0")
    private Integer assignmentId;

    @Column(name = "master_it_tds", length = 255)
    private String masterItTds;

    @Column(name = "master_gst", length = 255)
    private String masterGst;

    @Column(name = "consd_as_party", length = 255)
    private String consdAsParty;

    @Column(name = "spl_cat", length = 255)
    private String splCat;

    @Column(name = "falling_under_gl_id", columnDefinition = "int default 0")
    private Integer fallingUnderGlId;

    @Column(name = "falling_under_gl_name", length = 255)
    private String fallingUnderGlName;

    private enum PyFssLineIdEnum{

        YES,
        No
    }

}
