package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "common_dc_nosql_main_mapping")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommonDcNosqlMainMapping extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "common_dc_files_id")
    private Integer commonDcFilesId;

    @Column(name = "csv_col", length = 255)
    private String csvCol;

    @Column(name = "db_col", length = 255)
    private String dbCol;
}
