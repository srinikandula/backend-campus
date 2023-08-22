package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "process_node",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "assignment_id"),
                @UniqueConstraint(columnNames = "process_id"),
                @UniqueConstraint(columnNames = "node_name")
        } )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProcessNode extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 150)
    @Column(name = "node_name")
    private String nodeName;

    @Column(name = "description")
    private String description;

    @Column(name = "type_of_node", columnDefinition = "varchar(10) COMMENT 'Decision,Activity'")
    private String typeOfNode;

    @Column(name = "trigger_type", columnDefinition = "char(15) COMMENT 'And, Or, AUTO, SINGLE'")
    private String triggerType;

    @Size(max = 15)
    @Column(name = "bk_trigger_type")
    private String bkTriggerType;


    @Size(max = 11)
    @Column(name = "process_id")
    private String processId;

    @Column(name = "risk_score", precision = 10, scale = 2)
    private Double riskScore;

    @Column(name = "control_score", precision = 10, scale = 2)
    private Double controlScore;

    @Column(name = "total_score", precision = 10, scale = 2)
    private Double totalScore;

    @Column(name = "open_risk_score", precision = 10, scale = 2)
    private Double openRiskScore;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 11)
    @Column(name = "link_id")
    private Integer linkId;



}
