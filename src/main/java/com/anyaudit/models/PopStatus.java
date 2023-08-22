package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pop_status", indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
        @Index(name = "as_doer_index", columnList = "as_doer , as_approver"),
        @Index(name = "assignment_id_2", columnList = "assignment_id , as_doer,as_approver,status")
} )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PopStatus extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "work_type_id")
    private Integer workTypeId;

    @Column(name = "work_type_name")
    private String workTypeName;

    @Column(name = "table_name")
    private String tableName;

    @Size(max = 11)
    @Column(name = "record_id")
    private Integer recordId;

    @Size(max = 11)
    @Column(name = "scheduler_id")
    private Integer schedulerId;

    @Column(name = "redirect_url", columnDefinition = "text")
    private String redirectUrl;

    @Size(max = 11)
    @Column(name = "as_doer")
    private Integer asDoer;

    @Size(max = 11)
    @Column(name = "as_approver")
    private Integer asApprover;

    @Enumerated(EnumType.STRING)
    @Column(name = "doer_role")
    private EdoerRole DoerRole;

    @Enumerated(EnumType.STRING)
    @Column(name = "approver_role")
    private EApproverRole ApproverRole;


    @Size(max = 11)
    @Column(name = "status") //COMMENT '0-Not initiated,1-Submitted,2-Resubmitted,3-Rejected,4-Approved'
    private Integer status;


    private enum EdoerRole{
        internal,
        external
    }
    private enum EApproverRole{
        internal,
        external


    }
}
