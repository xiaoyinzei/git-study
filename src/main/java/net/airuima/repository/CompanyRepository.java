package net.airuima.repository;

import net.airuima.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2017-2023, 武汉睿码智能科技有限公司
 * 公司信息Repository
 *
 * @author ruima
 * @date 2024-03-19
 */
@Repository
public interface CompanyRepository extends LogicDeleteableRepository<Company>,
        JpaSpecificationExecutor<Company>, JpaRepository<Company, Long> {

}
