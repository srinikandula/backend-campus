package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "communication_responses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommunicationResponses extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 20)
    @Column(name = "comm_id")
    private Integer commId;

    @Size(max = 11)
    @Column(name = "responded_by")
    private Integer respondedBy;

    @Column(name = "response")
    private String response;

    @Size(max = 255)
    @Column(name = "multi_response_ids")
    private String multiResponseIds;

    @Size(max = 11)
    @Column(name = "attachment_id")
    private Integer attachmentId;

    @Column(name = "response_dt")
    private String responseDt;

    @Column(name = "reject_note")
    private String rejectNote;

    @Column(name = "user_type")
    @Comment("1=externaluser,0=user")
    private Integer userType;

}
