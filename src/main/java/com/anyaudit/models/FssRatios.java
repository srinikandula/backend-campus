package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fss_ratios" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FssRatios extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Size(max = 255)
    @Column(name = "ratio")
    private String ratio;

    @Size(max = 255)
    @Column(name = "minor_id")
    private String minorId;

    @Column(name = "minor_sum")
    private String minorSum;

    @Column(name = "minor_minus")
    private String minorMinus;

    @Size(max = 100)
    @Column(name = "ratio_group")
    private String ratioGroup;

    @Column(name = "seq_order", columnDefinition = "integer default 0")
    private Integer seqOrder;


    @Column(name = "status")
    private Integer status;
}
