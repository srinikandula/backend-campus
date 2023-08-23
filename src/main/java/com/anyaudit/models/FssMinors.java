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
@Table(name = "fss_minors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class FssMinors extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "minor_name")
    private String minorName;

    @ColumnDefault("1")
    @Column(name = "polarity")
    private Integer polarity;

    @ColumnDefault("0")
    @Column(name = "permanent_id")
    private Integer permanentId;

    @Column(name = "bs_pl")
    @Comment("1=bs,2=pl")
    private Integer bsPl;

    @Size(max = 11)
    @Column(name = "major")
    private Integer major;

    @ColumnDefault("0")
    @Column(name = "status")
    private Integer status;

}


