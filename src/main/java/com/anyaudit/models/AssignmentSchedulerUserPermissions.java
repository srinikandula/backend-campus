package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "assignment_scheduler_user_permissions",indexes = {
        @Index(name = "user_id_index", columnList = "user_id"),
        @Index(name = "scheduler_id_index", columnList = "scheduler_id")


})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AssignmentSchedulerUserPermissions extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "scheduler_id")
    private Integer schedulerId;

    @Size(max = 11)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role")
    @Comment("Approver,Doer")
    private String role;

    @Column(name = "role_type")
    @Comment("Default,Others")
    private String roleType;

    @Column(name = "status")
    @Comment("0-inactive,1-active")
    private String status;

    @Size(max = 5)
    @Column(name = "hrs")
    private String hrs;

}
