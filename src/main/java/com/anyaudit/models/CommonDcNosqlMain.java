package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "common_dc_nosql_main")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommonDcNosqlMain extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "tablename", length = 255)
    private String tablename;

    @Size(max = 11)
    @Column(name = "location_id")
    private Integer locationId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private EStatus status;

    @Column(name = "s3Object", length = 255)
    private String s3Object;

    @Column(name = "mapcol", length = 255)
    private String mapcol;

    @Size(max = 11)
    @Column(name = "element_excel")
    private Integer elementExcel;


    @Column(name = "element_name", length = 255)
    private String elementName;

    @Enumerated(EnumType.STRING)
    @Column(name = "is_deleted")
    private EisDeleted isDeleted;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    private enum EStatus {
        Pending,
        Completed,
        Errors
    }

    private enum EisDeleted {
        Y,
        N

    }

}
