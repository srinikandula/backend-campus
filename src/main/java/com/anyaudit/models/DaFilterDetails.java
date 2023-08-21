package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;
@Entity
@Table(name = "da_filter_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DaFilterDetails extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "da_filters_id")
    private Integer daFiltersId;

    @Size(max = 11)
    @Column(name = "da_collection_id")
    private Integer daCollectionId;

    @Size(max = 11)
    @Column(name = "field_id")
    private Integer fieldId;

    @Size(max = 100)
    @Column(name = "operator")
    private String operator;

    @Size(max = 255)
    @Column(name = "value1")
    private String value1;

    @Size(max = 255)
    @Column(name = "value2")
    private String value2;
}
