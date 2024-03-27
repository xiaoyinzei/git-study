package net.airuima.service;

import net.airuima.domain.Employee;
import net.airuima.repository.EmployeeRepository;
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
 * 职工信息Service
 *
 * @author ruima
 * @date 2024-03-19
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeService extends CommonJpaService<Employee> {

    private final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Employee> find(Specification<Employee> spec, Pageable pageable) {
        return employeeRepository.findAll(spec, pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> find(Specification<Employee> spec) {
        return employeeRepository.findAll(spec);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

}
