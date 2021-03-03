package com.lock.gmall.realtime.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Author: Felix
 * Date: 2021/2/24
 * Desc:地区统计宽表实体类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProvinceStats {

    private String stt;
    private String edt;
    private Long province_id;
    private String province_name;
    private String area_code;
    private String iso_code;
    private String iso_3166_2;
    private BigDecimal order_amount;
    private Long  order_count;
    private Long ts;

    public ProvinceStats(OrderWide orderWide){
        province_id = orderWide.getProvince_id();
        order_amount = orderWide.getSplit_total_amount();
        province_name=orderWide.getProvince_name();
        area_code=orderWide.getProvince_area_code();
        iso_3166_2=orderWide.getProvince_iso_code();
        iso_code=orderWide.getProvince_iso_code();

        order_count = 1L;
        ts=new Date().getTime();
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getEdt() {
        return edt;
    }

    public void setEdt(String edt) {
        this.edt = edt;
    }

    public Long getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Long province_id) {
        this.province_id = province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getIso_code() {
        return iso_code;
    }

    public void setIso_code(String iso_code) {
        this.iso_code = iso_code;
    }

    public String getIso_3166_2() {
        return iso_3166_2;
    }

    public void setIso_3166_2(String iso_3166_2) {
        this.iso_3166_2 = iso_3166_2;
    }

    public BigDecimal getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(BigDecimal order_amount) {
        this.order_amount = order_amount;
    }

    public Long getOrder_count() {
        return order_count;
    }

    public void setOrder_count(Long order_count) {
        this.order_count = order_count;
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }
}

