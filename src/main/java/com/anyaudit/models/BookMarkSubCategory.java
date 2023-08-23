package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "bookmark_subcategory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookMarkSubCategory extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "name")
    private String name;

    @Size(max = 5)
    @Column(name = "cat_id")
    private Integer catId;

    @Size(max = 5)
    @Column(name = "userId")
    private Integer userId;

    @Column(name = "created_on")
    private Date createdOn;
}
