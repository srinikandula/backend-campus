package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sms_groups")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SmsGroups extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 50)
    @Column(name = "group_name")
    private String groupName;

    @Comment("contact,client")
    @Column(name = "grouptype")
    private String groupType;
}
