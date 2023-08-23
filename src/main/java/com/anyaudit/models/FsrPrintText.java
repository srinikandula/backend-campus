package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_print_text",indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
        @Index(name = "client_id_index", columnList = "client_id")


})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrPrintText extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "fss_text")
    private Integer fssText;

    @ColumnDefault("1")
    @Column(name = "status")
    private Integer status;
}
