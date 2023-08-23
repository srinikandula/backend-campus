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
@Table(name = "master_variable_template",uniqueConstraints = {
        @UniqueConstraint(name = "name", columnNames = {"name"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MasterVariableTemplate extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "name")
    private String  name;

    @Size(max = 10)
    @Column(name = "status")
    private String  status;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Column(name = "description")
    private String  description;

    @Column(name = "variable_type")
    @Comment("1-Int,2-Decimal,3-Date,4-Varchar")
    private Integer variableType;

}
