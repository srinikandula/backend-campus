package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Entity
@Table(name = "cos_list_custom")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CosListCustom extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cos_node_id")
    private Integer cosNodeId;

    @Column(name = "cos_id")
    private Integer cosId;

    @Column(name = "parent_nodeid")
    private Integer parentNodeId;

    @Column(name = "short_cos", length = 250)
    private String shortCos;

    @Column(name = "full_cos" ,columnDefinition = "text")
    private String fullCos;


    @Column(name = "base")
    private Integer base;

    @Column(name = "type_value", length = 250)
    @Comment("Income,Expenditure,Asset,Liability")
    private String typeValue;


    @Column(name = "nodelevel")
    private Integer nodeLevel;

    @Column(name = "nodecode", length = 80)
    private String nodeCode;


    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "master_link_id")
    private Integer masterLinkId;

    @Column(name = "prev_link_id")
    private Integer prevLinkId;

    @Column(name = "level1")
    private Integer level1;

    @Column(name = "level2")
    private Integer level2;

    @Column(name = "level3")
    private Integer level3;

    @Column(name = "level4")
    private Integer level4;

    @Column(name = "level5")
    private Integer level5;

    @Column(name = "gl_list_total")
    private Float glListTotal;

    @Column(name = "gl_rectify_total")
    private Float glRectifyTotal;

    @Column(name = "gl_reclassify_total")
    private Float glReclassifyTotal;

    @Column(name = "grand_total")
    private Float grandTotal;

    @Column(name = "specific_materiality", precision = 15, scale = 2)
    private Double specificMateriality;

    @Column(name = "effective_materiality", precision = 15, scale = 2)
    private Double effectiveMateriality;

    @Column(name = "risk_score",precision = 15, scale = 2)
    private Double riskScore;

    @Column(name = "open_risk_score", precision = 15, scale = 2)
    private Double openRiskScore;

    @Column(name = "control_score", precision = 15, scale = 2)
    private Double controlScore;
}
