package com.virtusa.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.tms.dto.Staff;


@Repository
public interface StaffDao extends JpaRepository<Staff, Integer> {

}
