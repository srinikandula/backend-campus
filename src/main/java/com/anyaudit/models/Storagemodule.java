package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "storagemodule")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Storagemodule extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "moduleid")
    private Long moduleId;


    @Size(max = 50)
    @Column(name = "modulename")
    private String moduleName;

    @Size(max = 11)
    @Column(name = "placeid")
    private Integer placeId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;
}
