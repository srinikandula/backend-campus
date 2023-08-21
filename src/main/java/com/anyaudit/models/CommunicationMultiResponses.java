package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "communication_multi_responses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CommunicationMultiResponses extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "comm_id")
    private Integer commId;

    @Column(name = "response")
    private String response;

    @Size(max = 11)
    @Column(name = "responded_by")
    private Integer respondedBy;

    @Size(max = 255)
    @Column(name = "approved_status")
    private String approvedStatus;

    @Column(name = "notes")
    private String notes;

    @Size(max = 11)
    @Column(name = "attach_id")
    private Integer attachId;
}
