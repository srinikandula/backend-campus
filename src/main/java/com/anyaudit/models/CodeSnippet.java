package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "code_snippet")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CodeSnippet extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "parent_id")
    private Integer assignmentId;

    @Enumerated(EnumType.STRING)
    @Column(name="code_type")
    private ECodeTypeRoles codeType;

    @Size(max = 11)
    @Column(name = "method_id")
    private Integer methodId;

    @Column(name = "description")
    private String description;

    @Size(max = 11)
    @Column(name = "sequence_id")
    private Integer sequenceId;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private EStatusRole status;

    @Column(name = "created_on")
    private Integer createdOn;

    @Size(max = 11)
    @Column(name = "nodelevel")
    private Integer nodeLevel;

    @Size(max = 255)
    @Column(name = "nodecode")
    private String nodeCode;
}
