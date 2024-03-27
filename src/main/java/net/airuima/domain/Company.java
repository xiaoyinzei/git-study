package net.airuima.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Table;
import net.airuima.domain.base.CustomBaseEntity;
import org.hibernate.annotations.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.Cache;

import java.io.Serializable;
import java.time.*;
import java.util.Objects;

/**
 * Copyright (C), 2017-2023, 武汉睿码智能科技有限公司
 * 公司信息Domain
 *
 * @author ruima
 * @date 2024-03-19
 */
@Schema(description = "公司信息")
@Entity
@Table(name = "company")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@DynamicInsert
@DynamicUpdate
public class Company extends CustomBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公司名称
     */
    @Schema(description = "公司名称")
    @Column(name = "name")
    private String name;

    /**
     * 公司地址
     */
    @Schema(description = "公司地址")
    @Column(name = "address")
    private String address;


    public String getName() {
        return name;
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Company setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Company company = (Company) o;
        if (company.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), company.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

}
