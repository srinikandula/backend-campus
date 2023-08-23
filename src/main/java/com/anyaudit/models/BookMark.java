package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "bookmark")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookMark extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bookmark")
    private String bookMark;

    @Size(max = 5)
    @Column(name = "note_id")
    private Integer noteId;

    @Size(max = 250)
    @Column(name = "note_url")
    private String noteUrl;

    @Size(max = 5)
    @Column(name = "cat_id")
    private Integer catId;

    @Size(max = 5)
    @Column(name = "subcat_id")
    private Integer subCatId;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Size(max = 250)
    @Column(name = "table_name")
    private String tableName;
}
