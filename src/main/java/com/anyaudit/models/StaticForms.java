package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "static_forms",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "name"),
                @UniqueConstraint(columnNames = "structure_name")
        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StaticForms extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "moduleid")
    private Long moduleId;

    @Size(max = 50)
    @Column(name = "name")
    private String name;

    @Size(max = 50)
    @Column(name = "structure_name")
    private String structureName;

    @Size(max = 50)
    @Column(name = "func_name")
    private String funcName;

    @Column(name = "status", columnDefinition = "int default 1")
    private Integer status;
}
