package net.airuima.service;

import net.airuima.domain.Company;
import net.airuima.repository.CompanyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Copyright (C), 2017-2023, 武汉睿码智能科技有限公司
 * 公司信息Service
 *
 * @author ruima
 * @date 2024-03-19
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CompanyService extends CommonJpaService<Company> {

    private final Logger log = LoggerFactory.getLogger(CompanyService.class);

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Company> find(Specification<Company> spec, Pageable pageable) {
        return companyRepository.findAll(spec, pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Company> find(Specification<Company> spec) {
        return companyRepository.findAll(spec);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Company> findAll(Pageable pageable) {
        return companyRepository.findAll(pageable);
    }

}
