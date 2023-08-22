package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "remittance_foreign")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RemittanceForeign extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "reminder_id")
    private Integer reminderId;

    @Size(max = 50)
    @Column(name = "no_equity")
    private String noEquity;

    @Size(max = 50)
    @Column(name = "amount_foreign")
    private String amountForeign;

    @Size(max = 11)
    @Column(name = "year")
    private Integer year;

    @Size(max = 11)
    @Column(name = "client")
    private Integer client;

    @Size(max = 11)
    @Column(name = "assignment")
    private Integer assignment;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;


    @Size(max = 4)
    @Column(name = "save_status")
    private Integer saveStatus;
}
