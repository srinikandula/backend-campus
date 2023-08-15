package com.anyaudit.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Entity
@Table(name = "terms_java")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TermsJava {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;


    @NotBlank
    @Size(max = 50)
    @Column(name = "terms")
    private String Terms;
}
