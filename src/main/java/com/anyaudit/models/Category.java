package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 200)
    @Column(name = "category_name")
    private String categoryName;

    @Comment("active,inactive")
    @Column(name = "status")
    private String status;

    @Size(max = 11)
    @Column(name = "attached_by")
    private Integer attachedBy;

    @Column(name = "created_date")
    private Date createdDate;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;
}
