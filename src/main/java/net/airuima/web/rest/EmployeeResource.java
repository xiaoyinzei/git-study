package net.airuima.web.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import net.airuima.constant.Constants;
import net.airuima.domain.Employee;
import net.airuima.service.EmployeeService;
import net.airuima.web.ProtectBaseResource;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2017-2023, 武汉睿码智能科技有限公司
 * 职工信息Resource
 *
 * @author ruima
 * @date 2024-03-19
 */
@Tag(name = "职工信息Resource")
@RestController
@RequestMapping("/api/employees")
public class EmployeeResource extends ProtectBaseResource<Employee> {

    private final Logger log = LoggerFactory.getLogger(EmployeeResource.class);

    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.mapUri = "/api/employees";
    }

    @Override
    public String getAuthorityDescription(String authority) {
        if (StringUtils.isBlank(authority)) {
            return "";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_READ)) {
            return "浏览职工信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_CREATE)) {
            return "新建职工信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_UPDATE)) {
            return "修改职工信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_DELETE)) {
            return "删除职工信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_IMPORT)) {
            return "导入职工信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_EXPORT)) {
            return "导出职工信息";
        }
        return "";
    }

}
