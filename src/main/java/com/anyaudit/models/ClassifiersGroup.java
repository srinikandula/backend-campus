package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "classifiersgroup")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClassifiersGroup extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "groupName")
    private String groupName;

    @NotBlank
    @Size(max = 50)
    @Column(name = "list")
    private String list;

    @NotBlank
    @Size(max = 50)
    @Column(name = "type")
    private String type;
}
