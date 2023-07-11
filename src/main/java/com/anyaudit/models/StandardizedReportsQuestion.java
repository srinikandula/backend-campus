package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "standardizedreportsquestion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StandardizedReportsQuestion extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(max = 30)
    @Column(name = "shortQuestion")
    private String shortQuestion;

    @NotBlank
    @Size(max = 30)
    @Column(name = "longQuestion")
    private String longQuestion;

    @NotBlank
    @Size(max = 30)
    @Column(name = "report")
    private String report;
}
