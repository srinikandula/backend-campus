package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fss_master_types_list")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FssMasterTypesList extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "title")
    private String title;

    @Column(name = "polarity")
    @ColumnDefault("1")
    private Integer polarity;

    @Size(max = 11)
    @Column(name = "bp")
    private Integer bp;

    @Size(max = 11)
    @Column(name = "major")
    private Integer major;
}
