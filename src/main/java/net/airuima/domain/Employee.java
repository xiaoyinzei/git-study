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
 * 职工信息Domain
 *
 * @author ruima
 * @date 2024-03-19
 */
@Schema(description = "职工信息")
@Entity
@Table(name = "employee")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@DynamicInsert
@DynamicUpdate
public class Employee extends CustomBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工号
     */
    @Schema(description = "工号")
    @Column(name = "work_no")
    private String workNo;

    /**
     * 姓名
     */
    @Schema(description = "姓名")
    @Column(name = "name")
    private String name;

    /**
     * 角色(0-开发人员；1-管理员；2-普通用户)
     */
    @Schema(description = "角色(0-开发人员；1-管理员；2-普通用户)")
    @Column(name = "role")
    private int role;

    /**
     * 年龄
     */
    @Schema(description = "年龄")
    @Column(name = "age")
    private int age;

    /**
     * 负责产线，产线编码
     */
    @Schema(description = "负责产线，产线编码")
    @Column(name = "work_line_code")
    private String workLineCode;

    /**
     * 入职时间
     */
    @Schema(description = "入职时间")
    @Column(name = "entry_ime")
    private LocalDate entryIme;

    /**
     * 出勤率
     */
    @Schema(description = "出勤率")
    @Column(name = "attendance_rate")
    private Double attendanceRate;

    /**
     * 标语
     */
    @Schema(description = "标语")
    @Column(name = "slogan")
    private Object slogan;

    /**
     * 是否在职
     */
    @Schema(description = "是否在职")
    @Column(name = "is_active")
    private int isActive;

    /**
     * 公司id
     */
    @Schema(description = "公司id")
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;


    public String getWorkNo() {
        return workNo;
    }

    public Employee setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getRole() {
        return role;
    }

    public Employee setRole(int role) {
        this.role = role;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public String getWorkLineCode() {
        return workLineCode;
    }

    public Employee setWorkLineCode(String workLineCode) {
        this.workLineCode = workLineCode;
        return this;
    }

    public LocalDate getEntryIme() {
        return entryIme;
    }

    public Employee setEntryIme(LocalDate entryIme) {
        this.entryIme = entryIme;
        return this;
    }

    public Double getAttendanceRate() {
        return attendanceRate;
    }

    public Employee setAttendanceRate(double attendanceRate) {
        this.attendanceRate = attendanceRate;
        return this;
    }

    public Object getSlogan() {
        return slogan;
    }

    public Employee setSlogan(Object slogan) {
        this.slogan = slogan;
        return this;
    }

    public int getIsActive() {
        return isActive;
    }

    public Employee setIsActive(int isActive) {
        this.isActive = isActive;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Employee setCompany(Company company) {
        this.company = company;
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
        Employee employee = (Employee) o;
        if (employee.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), employee.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

}
