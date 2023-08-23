package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;
@Entity
@Table(name = "fsr_print_tables")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrPrintTables extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 100)
    @Column(name = "table_category")
    private String tableCategory;

    @Size(max = 255)
    @Column(name = "table_name")
    private String tableName;

    @Size(max = 255)
    @Column(name = "view_name")
    private String viewName;

    @Column(name = "controller_path")
    private String controllerPath;

    @ColumnDefault("1")
    @Column(name = "status")
    private Integer status;
}
