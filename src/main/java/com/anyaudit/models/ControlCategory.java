package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "controlcategory",
        uniqueConstraints = {
                @UniqueConstraint(name = "category_name", columnNames = {"category_name"})


        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ControlCategory extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "category_name")
    private String categoryName;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @ColumnDefault("1")
    @Column(name = "status")
    private Integer status;
}
