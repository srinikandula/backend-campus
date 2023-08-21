package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "company_department",uniqueConstraints = {
        @UniqueConstraint(columnNames = "cid"),
        @UniqueConstraint(columnNames = "deptId")
}, indexes = {
        @Index(name = "cid_index", columnList = "cid"),
        @Index(name = "deptid_index", columnList = "deptid")
}  )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompanyDepartment extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdid")
    private Long cdId;

    @Size(max = 11)
    @Column(name = "cid")
    private Integer cId;


    @Size(max = 11)
    @Column(name = "deptid")
    private Integer deptId;


}
