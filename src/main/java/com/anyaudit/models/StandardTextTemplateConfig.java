package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "standard_text_template_config",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "standard_text_template_id"),
                @UniqueConstraint(columnNames = "standard_text_id"),
                @UniqueConstraint(columnNames = "is_deleted")//how
        } )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StandardTextTemplateConfig extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "standard_text_template_id")
    private Integer standardTextTemplateId;

    @Size(max = 11)
    @Column(name = "standard_text_id")
    private Integer standardTextId;

    @Enumerated(EnumType.STRING)
    @Column(name = "is_deleted")
    private EIsDeleted isDeleted;


    private enum EIsDeleted {
        N
    }


}
