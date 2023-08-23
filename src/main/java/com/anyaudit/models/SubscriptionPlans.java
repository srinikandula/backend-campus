package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "subscription_plans")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubscriptionPlans extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "splan_id")
    private Long splanId;

    @Size(max = 255)
    @Column(name = "splan_name")
    private String splanName;

    @Size(max = 11)
    @Column(name = "splan_active_users")
    private Integer splanActiveUsers;

    @Size(max = 11)
    @Column(name = "splan_shadow_users")
    private Integer splanShadowUsers;

    @Size(max = 11)
    @Column(name = "splan_clients")
    private Integer splanClients;

    @Size(max = 11)
    @Column(name = "duration_months")
    private Integer durationMonths;

    @Size(max = 11)
    @Column(name = "splan_file_size")
    private Integer splanFileSize;

    @ColumnDefault("1")
    @Column(name = "splan_status")
    private Integer splanStatus;
}
