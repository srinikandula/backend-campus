package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "bookmark_category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookMarkCategory extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "name")
    private String name;

    @Size(max = 11)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "created_on")
    private Date createdOn;
}
