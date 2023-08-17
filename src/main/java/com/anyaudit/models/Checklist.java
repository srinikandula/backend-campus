package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "checklists")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Checklist extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "checklist_id")
    private Long id;

    @Column(name = "checklist_name")
    private String checklistName;
}
