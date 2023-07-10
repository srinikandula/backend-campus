package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "disclosuregroups")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DisclosureGroups extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(max = 30)
    @Column(name = "disclosureGroup")
    private String disclosureGroup;



    @NotBlank
    @Size(max = 10 )
    @Column(name = "disclosClassifier")
    private String disclosClassifier;
}
