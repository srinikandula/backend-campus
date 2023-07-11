package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(name = "annexurefield")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AnnexureField extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "fieldName")
    private String fieldName;

    @NotBlank
    @Size(max = 30)
    @Column(name = "fieldType")
    private String fieldType;

    @NotBlank
    @Size(max = 25)
    @Column(name = "required")
    private String required;

    @NotBlank
    @Size(max = 5)
    @Column(name = "uniquename")
    private String uniquename;
}
