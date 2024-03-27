package net.airuima.repository;

import net.airuima.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2017-2023, 武汉睿码智能科技有限公司
 * 职工信息Repository
 *
 * @author ruima
 * @date 2024-03-19
 */
@Repository
public interface EmployeeRepository extends LogicDeleteableRepository<Employee>,
        JpaSpecificationExecutor<Employee>, JpaRepository<Employee, Long> {

}
