package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "workingpaper")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WorkingPaper extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(max = 30)
    @Column(name = "categoryName")
    private String categoryName;


    @NotBlank
    @Size(max = 10 )
    @Column(name = "status")
    private String status;
}
