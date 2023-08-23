package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "automapping_rule")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AutomappingRule extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "order_id")
    private Integer orderId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;


    @Enumerated(EnumType.STRING)
    @Column(name = "rule_type")
    private ERuleType ruleType;


    @Column(name = "maptype", columnDefinition = "TINYINT(4) COMMENT '0-unmapped,1-mapped, 2=both'")
    private Integer mapType;

    @Size(max = 11)
    @Column(name = "group_id")
    private Integer groupId;


    @Column(name = "level_type", columnDefinition = "TINYINT(4) COMMENT '1=>directchildren,2=>recursively all children'")
    private Integer levelType;

    @Size(max = 255 )
    @Column(name = "field")
    private String  field;

    @Size(max = 255 )
    @Column(name = "operator_id")
    private String  operatorId;

    @Size(max = 255 )
    @Column(name = "value")
    private String  value;

    @Size(max = 11)
    @Column(name = "fss_id")
    private Integer fssId;


    @Column(name = "polarity", columnDefinition = "TINYINT(4) COMMENT '0 =>positive,1 =>negative'")
    private Integer polarity;

    @Size(max = 11)
    @Column(name = "result_fss_id")
    private Integer resultFssId;

    @Column(name = "status", columnDefinition = "TINYINT(4) COMMENT '0=>inactive,1=>active'")
    private Integer status;


    private  enum ERuleType {

        RULE_1,
        RULE_2,
        RULE_3;
    }
}
