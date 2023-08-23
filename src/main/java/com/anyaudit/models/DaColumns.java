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
@Table(name = "da_columns")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DaColumns extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "csv_col")
    private String csvCol;

    @Size(max = 11)
    @Column(name = "da_collection_id")
    private Integer daCollectionId;

    @Size(max = 255)
    @Column(name = "db_col")
    private String dbCol;

    @Enumerated(EnumType.STRING)
    @Column(name="col_created_by")
    private EColCreatedByRole colCreatedBy;

    @Size(max = 4)
    @Column(name = "is_mapped")
    private Integer isMapped;

    @Column(name = "data_type")
    @Comment("string, int,float etc.")
    private String dataType;

    @Column(name = "col_type")
    @Comment("formulae,data etc.")
    private String colType;

}
