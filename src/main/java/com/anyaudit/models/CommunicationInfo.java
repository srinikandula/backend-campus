package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "communication_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommunicationInfo extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comm_id")
    private Long comm_id;

    @Size(max = 11)
    @Column(name = "ass_seq_id")
    private Integer assSeqId;

    @Size(max = 15)
    @Column(name = "ass_seq_txt")
    private String assSeqTxt;

    @Column(name = "comm_type")
    @Comment("1-RFI,2-RFQ,3-RFC,4-GR by EU,5-GR by Au,Observation")
    private String commType;

    @Size(max = 11)
    @Column(name = "proposal_id")
    private Integer proposalId;

    @Size(max = 11)
    @Column(name = "element_id")
    private Integer elementId;

    @Size(max = 11)
    @Column(name = "subject_id")
    private Integer subjectId;

    @Size(max = 255)
    @Column(name = "element_name")
    private String elementName;

    @Size(max = 255)
    @Column(name = "subject_name")
    private String subjectName;

    @Size(max = 80)
    @Column(name = "process_type")
    private String processType;

    @Size(max = 11)
    @Column(name = "process_type_id")
    private Integer processTypeId;

    @Size(max = 11)
    @Column(name = "node_id")
    private Integer nodeId;

    @Size(max = 11)
    @Column(name = "originator")
    private Integer originator;


    @Column(name = "question")
    private String question;

    @Size(max = 11)
    @Column(name = "answer")
    private String answer;

    @Column(name = "question_dt")
    private Date questionDt;

    @Column(name = "status")
    @Comment("4-rejected,3-Initiated,2-Responded,1-Resolved")
    private Integer status;

    @Size(max = 20)
    @Column(name = "precedence_id")
    private Integer precedenceId;

    @Column(name = "reject_note")
    private String rejectNote;

    @Size(max = 11)
    @Column(name = "attachment_id")
    private Integer attachmentId;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;

    @Size(max = 11)
    @Column(name = "scheduler_id")
    private Integer schedulerId;

    @Column(name = "user_type")
    @Comment("1=externaluser,0=user")
    private Integer userType;

    @Size(max = 11)
    @Column(name = "to_be_responded")
    private Integer toBeResponded;

    @Size(max = 55)
    @Column(name = "commu_from")
    private String commuFrom;
}