package com.anyaudit.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "assignment_java")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AssignmentJava extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id")
    private Long id;

    @NotBlank
    @Column(name = "assignment_name")
    private String assignmentName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeofAssignment_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private TypeofAssignmentJava typeofAssignment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "year_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private YearJava year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terms_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private TermsJava terms;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userEP_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User engagementPartner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Client client;

    @NotBlank
    @Column(name = "framework_name")
    private String framework;
}


