package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "product_master",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "product_name"),
                @UniqueConstraint(columnNames = "client_id")
        } )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductMaster extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    private Long pid;

    @Size(max = 250)
    @Column(name = "product_name")
    private String productName;

    @Size(max = 255)
    @Column(name = "product_code")
    private String productCode;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 255)
    @Column(name = "hsn_sac_code")
    private String hsnSacCode;

    @Column(name = "rate_tax_under_gst", precision = 12, scale = 2)
    private BigDecimal rateTaxUnderGst;

    @Size(max = 255)
    @Column(name = "tariff_reference")
    private String tariffReference;

    @Size(max = 11)
    @Column(name = "measures_id") //FK: measures
    private Integer measuresId;

    @Size(max = 100)
    @Column(name = "uom")
    private String uom;

    @Size(max = 100)
    @Column(name = "goods_service")
    private String goodsService;
}
