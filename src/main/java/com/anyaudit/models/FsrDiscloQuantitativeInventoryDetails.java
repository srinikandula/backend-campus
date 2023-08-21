package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_disclo_quantitative_inventory_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDiscloQuantitativeInventoryDetails extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;


    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "particulars")
    private String particulars;

    @Size(max = 11)
    @Column(name = "particulars_id")
    private Integer particularsId;

    @Column(name = "current_year_kgs", columnDefinition = "FLOAT(11,2)")
    private Float currentYearKgs;


    @Column(name = "amount_in_current_year", columnDefinition = "FLOAT(11,2)")
    private Float amountInCurrentYear;

    @Column(name = "previous_year_kgs", columnDefinition = "FLOAT(11,2)")
    private Float previousYearKgs;

    @Column(name = "amount_in_previous_year", columnDefinition = "FLOAT(11,2)")
    private Float amountInPreviousYear;

    @Column(name = "status" ,columnDefinition = "tinyint(1)")
    private Integer status;
}
