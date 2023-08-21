package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
@Entity
@Table(name = "da_collection")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DaCollection extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "title")
    private String title;

    @Size(max = 11)
    @Column(name = "counts")
    private Integer counts;

    @Size(max = 255)
    @Column(name = "tablename")
    private String tableName;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "location_id")
    private Integer locationId;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private EStatusRole status;

    @Size(max = 255)
    @Column(name = "s3Object")
    private String s3Object;

    @Size(max = 255)
    @Column(name = "mapcol")
    private String mapCol;

    @Size(max = 11)
    @Column(name = "element_id")
    private Integer elementId;

    @Size(max = 255)
    @Column(name = "element_name")
    private String elementName;

    @Enumerated(EnumType.STRING)
    @Column(name="is_deleted")
    private EIsDeletedRole isDeleted;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

}
