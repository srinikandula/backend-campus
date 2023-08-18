package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "subdecisions_conditions " ,indexes = {
        @Index(name = "subdec_id_index", columnList = "subdec_id")

})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubdecisionsConditions  extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subdec_cond_id")
    private Integer subDecCondId;

    @Size(max = 11)
    @Column(name = "subdec_id")
    private Integer subDecId;

    @Size(max = 11)
    @Column(name = "cond_id")
    private String condId;

    @Size(max = 11)
    @Column(name = "master_id")
    private String masterId;

}
