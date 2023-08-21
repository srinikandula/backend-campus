package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "control_owner")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ControlOwner extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coid")
    private Long coId;

    @Size(max = 250)
    @Column(name = "owner_name")
    private String ownerName;

    @Size(max = 11)
    @Column(name = "client_id")
    private String clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private String assignmentId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private String domainId;
}
