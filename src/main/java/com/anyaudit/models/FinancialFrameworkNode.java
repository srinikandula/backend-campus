package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "financialframeworknode")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FinancialFrameworkNode extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(max = 50)
    @Column(name = "thisLevelonFace")
    private String thisLevelonFace;

    @NotBlank
    @Size(max = 50)
    @Column(name = "nextLevelonFace")
    private String nextLevelonFace;


    @NotBlank
    @Size(max = 50)
    @Column(name = "description")
    private String description;

    @NotBlank
    @Size(max = 10)
    @Column(name = "nodeCode")
    private String nodeCode ;

    @NotBlank
    @Size(max = 15)
    @Column(name = "minor")
    private String minor ;
}
