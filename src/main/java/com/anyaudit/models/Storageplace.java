package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "storageplace")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Storageplace extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "placeid")
    private Integer placeId;

    @Size(max = 50)
    @Column(name = "placename")
    private String placeName;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;
}
