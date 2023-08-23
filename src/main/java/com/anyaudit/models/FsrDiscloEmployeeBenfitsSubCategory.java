package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_disclo_employee_benfits_subcategory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDiscloEmployeeBenfitsSubCategory extends BaseModel{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "category_id")
    private Integer categoryId;

    @Size(max = 250)
    @Column(name = "subcat_name")
    private String subcatName;
}
