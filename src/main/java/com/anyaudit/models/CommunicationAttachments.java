package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "communication_attachments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommunicationAttachments extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "attach_from")
    @Comment("1-Question(communication_info),2-Response(communication_responses)")
    private Integer attachFrom;

    @Size(max = 20)
    @Column(name = "attach_from_id")
    private Long attachFromId;

    @Column(name = "attachment", length = 255)
    private String attachment;

    @Size(max = 5)
    @Column(name = "comm_id")
    private Integer commId;

    @Size(max = 5)
    @Column(name = "assignment_id")
    private Integer assignmentId;




}
