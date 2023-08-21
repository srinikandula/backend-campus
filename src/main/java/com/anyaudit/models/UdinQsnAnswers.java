package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "udin_qsn_answers",indexes = {
        @Index(name = "udin_id_index", columnList = "udin_id"),
        @Index(name = "created_by_index", columnList = "created_by")
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UdinQsnAnswers extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "udin_id")
    private Integer udinId;

    @ColumnDefault("0")
    @Column(name = "domain")
    private Integer domain;

    @Column(name = "qsn")
    private String qsn;

    @Column(name = "ans")
    private String ans;

    @Size(max = 1)
    @Column(name = "status")
    private Integer status;
}
