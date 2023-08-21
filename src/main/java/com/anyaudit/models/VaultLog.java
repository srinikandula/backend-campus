package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vault_log",indexes = {
        @Index(name = "vault_id_index", columnList = "vault_id")


})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VaultLog extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 50)
    @Column(name = "vault_id")
    private Integer vaultId;

    @ColumnDefault("0")
    @Column(name = "status")
    private Integer status;
}
