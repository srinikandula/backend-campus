package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "tbl_rating")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TblRating extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Long modelId;

    @Size(max = 11)
    @Column(name = "asignment_id")
    private Integer asignmentId;

    @Size(max = 250)
    @Column(name = "model_name")
    private String modelName;

    @Size(max = 50)
    @Column(name = "chapter_id")
    private Integer chapterId;

    @Column(name = "status", columnDefinition = "TINYINT(4) default '1'")
    private Integer status;

    @Column(name = "createdDtm")
    private Date createdDtm;
}
