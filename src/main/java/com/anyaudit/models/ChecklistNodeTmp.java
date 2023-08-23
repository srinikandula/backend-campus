package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "checklist_node_tmp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChecklistNodeTmp extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "checklist_node_id")
    private Long checklistNodeId;

    @Size(max = 11)
    @Column(name = "checklist_id")
    private Integer checklistId;

    @Column(name = "short_checklist")
    private String shortChecklist;

    @Column(name = "full_checklist")
    private String fullChecklist;

    @Column(name = "desired_result", columnDefinition = "TINYINT(1)")
    private Integer desiredResult;

    @Column(name = "na_as", columnDefinition = "TINYINT(1)")
    private Integer naAs;

    @Size(max = 11)
    @Column(name = "sr_no")
    private Integer srNo;

    @Size(max = 11)
    @Column(name = "order_no")
    private Integer orderNo;

    @Size(max = 11)
    @Column(name = "falling_under")
    private Integer fallingUnder;

    @Size(max = 255)
    @Column(name = "tmp_code")
    private String tmpCode;

    @Size(max = 11)
    @Column(name = "nodelevel")
    private Integer nodeLevel;
}
