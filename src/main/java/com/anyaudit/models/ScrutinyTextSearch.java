package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "scrutiny_text_search" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ScrutinyTextSearch extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "rule_name")
    private String  ruleName;

    @Enumerated(EnumType.STRING)
    @Column(name = "dr_cr")
    private EDrCr drCr;

    @Column(name = "rule")
    private String  rule;

    @Size(max = 11)
    @Column(name = "c_id")
    private Integer  cId;
}
