package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "firm")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Firm extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fid")
    private Long fId;

    @Size(max = 250)
    @Column(name = "firm_name")
    private String firmName;

    @Size(max = 50)
    @Column(name = "reg_no")
    private String regNo;

    @Column(name = "date_consultation")
    private Date dateConsultation;

    @Size(max = 250)
    @Column(name = "c_ag")
    private String cAg;

    @Size(max = 50)
    @Column(name = "rbi_mbf")
    private String rbiMbf;

    @Size(max = 50)
    @Column(name = "cag_category")
    private String cagCategory;
}
