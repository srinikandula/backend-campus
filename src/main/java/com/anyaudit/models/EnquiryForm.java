package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "enquiry_form")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnquiryForm extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 250)
    private String name;

    @Column(name = "phone", length = 250)
    private String phone;

    @Column(name = "referred_by", length = 250)
    private String referredBy;

    @Column(name = "email",length = 250)
    private String email;

    @Column(name = "name_of_office", length = 250)
    private String nameOfOffice;

    @Column(name = "address", columnDefinition = "text")
    private String address;
}
