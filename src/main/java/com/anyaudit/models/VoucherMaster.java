package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "voucher_master",uniqueConstraints = {
        @UniqueConstraint(name = "voucher_name", columnNames = {"voucher_name", "client_id"})


})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VoucherMaster extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vid")
    private Long vId;

    @Size(max = 250)
    @Column(name = "voucher_name")
    private String voucherName;

    @Size(max = 11)
    @Column(name = "client_id")
    private String clientId;
}
