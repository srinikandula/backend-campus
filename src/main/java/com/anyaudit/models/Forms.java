package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "forms")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Forms extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 50)
    @Column(name = "name")
    private String name;

    @Size(max = 50)
    @Column(name = "structure_name")
    private String structureName;

    @Size(max = 50)
    @Column(name = "func_name")
    private String funcName;

    @Size(max = 150)
    @Column(name = "dsname")
    private String dsName;

    @Column(name = "status")
    @ColumnDefault("1")
    private Integer status;
}
