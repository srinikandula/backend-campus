package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "temp_compilancecalendar_config")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TempCompilanceCalendarConfig extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "template_id")
    private Integer templateId;

    @Size(max = 11)
    @Column(name = "compilancecalendar")
    private Integer compilanceCalendar;

    @Size(max = 11)
    @Column(name = "compilancecalendar_category")
    private Integer compilancecalendarCategory;

}
