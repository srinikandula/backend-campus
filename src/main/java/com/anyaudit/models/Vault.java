package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vault")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vault extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vault_id")
    private Long vaultId;

    @Size(max = 250)
    @Column(name = "vault_name")
    private String vaultName;

    @Column(name = "description")
    private String description;

    @Size(max = 100)
    @Column(name = "client")
    private String client;

    @Size(max = 100)
    @Column(name = "userid")
    private String userId;

    @Size(max = 100)
    @Column(name = "user_password")
    private String userPassword;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;

    @Size(max = 10)
    @Column(name = "otp")
    private String otp;

    @Size(max = 250)
    @Column(name = "q1")
    private String q1;

    @Size(max = 250)
    @Column(name = "q2")
    private String q2;

    @Size(max = 250)
    @Column(name = "q3")
    private String q3;

    @Size(max = 250)
    @Column(name = "a1")
    private String a1;

    @Size(max = 250)
    @Column(name = "a2")
    private String a2;

    @Size(max = 250)
    @Column(name = "a3")
    private String a3;

    @Column(name = "radio_status")
    @Comment("1=public,2=private")
    private Integer radioStatus;
}
