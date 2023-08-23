package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_csr_particulars")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrCsrParticulars extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "particulars_name")
    private String particularsName;

    @ColumnDefault("1")
    @Column(name = "particulars_type")
    @Comment("1-decimal,2-varchar,3-date")
    private Integer particularsType;
}
