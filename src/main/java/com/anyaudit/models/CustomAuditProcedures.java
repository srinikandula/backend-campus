package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customauditprocedures")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CustomAuditProcedures extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(max = 30)
    @Column(name = "name")
    private String name;

    @NotBlank
    @Size(max = 10 )
    @Column(name = "chapter")
    private String chapter;
}
