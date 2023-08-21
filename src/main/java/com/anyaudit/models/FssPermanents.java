package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fss_permanents" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FssPermanents extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "permanent_name")
    private String permanentName;

    @Size(max = 4)
    @Column(name = "polarity", columnDefinition = "tinyint DEFAULT 1")
    private Integer polarity;

    @Column(name = "bs_pl", columnDefinition = "int(11) DEFAULT NULL COMMENT '1=bs,2=pl'")
    private Integer bsPl;

    @Size(max = 11)
    @Column(name = "major")
    private Integer major;

    @Column(name = "minor")
    private Integer minor;
}
