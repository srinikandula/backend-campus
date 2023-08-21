package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "template_timeline_config" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TemplateTimelineConfig extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "temp_timeline_id")
    private Long tempTimelineId;

    @Size(max = 11)
    @Column(name = "template_id")
    private Long templateId;

    @Size(max = 11)
    @Column(name = "timeline")
    private Long timeline;
}
