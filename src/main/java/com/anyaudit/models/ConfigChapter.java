package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "config_chapters")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConfigChapter extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "chapter_name",nullable = false)
    private String chapterName;

    @NotBlank
    @Column(name = "root_number",nullable = false)
    private Integer rootNumber;

    @Column(name = "active")
    private boolean isActive;

    @Column(name = "seq_order",nullable = false)
    private Integer seqOrder;
}
