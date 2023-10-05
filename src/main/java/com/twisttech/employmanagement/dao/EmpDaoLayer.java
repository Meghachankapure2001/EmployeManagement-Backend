package com.twisttech.employmanagement.dao;

import com.twisttech.employmanagement.Model.EmpModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDaoLayer extends JpaRepository<EmpModel,Integer> {
}
