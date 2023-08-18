package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "annexure_node")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AnnexureNode extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "annexure_node_id")
    private Long id;

    @Size(max = 11)
    @Column(name = "annexure_id")
    private Integer annexureId;

    @Size(max = 250)
    @Column(name = "fieldname")
    private String fieldName;

    @Size(max = 250)
    @Column(name = "fieldtype")
    private String fieldType;

    @Size(max = 15)
    @Column(name = "fieldtype_columnname")
    private String fieldtypeColumnname;

    @Size(max = 11)
    @Column(name = "required_optional")
    private Integer requiredOptional;

    @Size(max = 11)
    @Column(name = "unique_notunique")
    private Integer uniqueNotunique;

    @Size(max = 25)
    @Column(name = "mapped_column")
    private String mappedColumn;


    @Size(max = 25)
    @Column(name = "mapped_column_order")
    private String mappedColumnOrder;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @Size(max = 11)
    @Column(name = "master_parent_id")
    private Integer masterParentId;
}
