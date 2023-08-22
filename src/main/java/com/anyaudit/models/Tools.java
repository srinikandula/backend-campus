package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tools")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tool_name",length = 150, unique = true)
    private String toolName;

    @Column(name = "tool_head_ds_name", length = 150)
    private String toolHeadDsName;

    @Column(name = "tool_head_name_col", length = 100)
    private String toolHeadNameCol;

    @Column(name = "tool_head_id_col", length = 100)
    private String toolHeadIdCol;

    @Column(name = "tool_node_ds_name", length = 150)
    private String toolNodeDsName;

    @Column(name = "tool_values_ds_name", length = 50)
    private String toolValuesDsName;

    @Column(name = "displayInResponse")
    private Integer displayInResponse;
}
