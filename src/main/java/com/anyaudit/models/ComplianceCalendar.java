package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "compliancecalendar")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComplianceCalendar extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(max = 30)
    @Column(name = "nameCompliance")
    private String nameCompliance;

    @NotBlank
    @Size(max = 30)
    @Column(name = "applicationStatuory")
    private String applicationStatuory;

    @NotBlank
    @Size(max = 15)
    @Column(name = "groupCompliance")
    private String groupCompliance;



}
