package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "attachment_field2", uniqueConstraints = {
        @UniqueConstraint(name = "field2_name", columnNames = {"field2_name"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AttachmentField2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "field2_id")
    private Long field2Id;

    @Column(name = "field1_id", nullable = false)
    private Integer field1Id;

    @Column(name = "field2_name", nullable = false, length = 150)
    private String field2Name;

    @Column(name = "domain", nullable = false)
    private Integer domain;
}
