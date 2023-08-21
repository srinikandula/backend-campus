package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sub_ledger" ,
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "name")
        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubLedger  extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 150)
    @Column(name = "name")
    private String name;

    @Size(max = 150)
    @Column(name = "structure_name")
    private String structureName;

    @Size(max = 50)
    @Column(name = "func_name")
    private String funcName;
}
