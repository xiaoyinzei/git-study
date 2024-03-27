package net.airuima.web.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import net.airuima.constant.Constants;
import net.airuima.domain.Company;
import net.airuima.service.CompanyService;
import net.airuima.web.ProtectBaseResource;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2017-2023, 武汉睿码智能科技有限公司
 * 公司信息Resource
 *
 * @author ruima
 * @date 2024-03-19
 */
@Tag(name = "公司信息Resource")
@RestController
@RequestMapping("/api/companies")
public class CompanyResource extends ProtectBaseResource<Company> {

    private final Logger log = LoggerFactory.getLogger(CompanyResource.class);

    private final CompanyService companyService;

    public CompanyResource(CompanyService companyService) {
        this.companyService = companyService;
        this.mapUri = "/api/companies";
    }

    @Override
    public String getAuthorityDescription(String authority) {
        if (StringUtils.isBlank(authority)) {
            return "";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_READ)) {
            return "浏览公司信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_CREATE)) {
            return "新建公司信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_UPDATE)) {
            return "修改公司信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_DELETE)) {
            return "删除公司信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_IMPORT)) {
            return "导入公司信息";
        } else if (authority.equals(this.entityName.toUpperCase() + Constants.AUTHORITY_EXPORT)) {
            return "导出公司信息";
        }
        return "";
    }

    public String sayHello() {
        return "hello world";
    }
    public String getAge() {
        return "My age is 24.";
    }

}
