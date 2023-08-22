package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "eventattachments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Eventattachments extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Size(max = 11)
    @Column(name = "event_id")
    private Integer eventId;


    @Column(name = "att_type", columnDefinition = "varchar(50) COMMENT 'open,closing'")
    private String attType;

    @Size(max = 250)
    @Column(name = "attachmentpath")
    private String attachmentpath;

    @Size(max = 11)
    @Column(name = "attachment_id")
    private Integer attachmentId;
}
