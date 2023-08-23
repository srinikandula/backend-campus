package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "elements_config_test")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ElementsConfigTest extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private Long cId;

    @Size(max = 11)
    @Column(name = "element_id")
    private Integer elementId;

    @Size(max = 50)
    @Column(name = "column_name")
    private String columName;

    @Size(max = 250)
    @Column(name = "display_name")
    private String displayName;

    @Size(max = 50)
    @Column(name = "column_type")
    private String columnType;

    @Size(max = 11)
    @Column(name = "analytical_report_show")
    private Integer analyticalReportShow;

    @Column(name = "data_type")
    @Comment("1=categorical,2=numeric,3=continous,4=ordered,5=data")
    private Integer dataType;

    @Column(name = "is_unique")
    @Comment("0,1")
    private Integer isUnique;

    @Column(name = "is_required")
    @Comment("0,1")
    private Integer isRequired;

    @Size(max = 255)
    @Column(name = "attribute_table_name")
    private String attributeTableName;

    @Size(max = 255)
    @Column(name = "attribute_table_col")
    private String attributeTableCol;

    @Column(name = "is_display", columnDefinition = "TINYINT(4) default '1'")
    private Integer isDisplay;

    @Column(name = "default_display")
    @Comment("1,0")
    private Integer defaultDisplay;

    @ColumnDefault("0")
    @Column(name = "display_order")
    private Integer displayOrder;
}
