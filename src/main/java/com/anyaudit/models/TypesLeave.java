package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "types_leave",indexes = {
        @Index(name = "domain_id_index", columnList = "domain_id")

})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TypesLeave extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "leave_name")
    private String leaveName;

    @Size(max = 10)
    @Column(name = "status")
    private String status;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;
}
