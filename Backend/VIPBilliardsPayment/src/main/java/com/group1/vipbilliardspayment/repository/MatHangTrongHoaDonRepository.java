package com.group1.vipbilliardspayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group1.vipbilliardspayment.entity.MatHangTrongHoaDon;
import com.group1.vipbilliardspayment.entity.MatHangTrongHoaDonId;

@Repository
public interface MatHangTrongHoaDonRepository extends JpaRepository<MatHangTrongHoaDon, MatHangTrongHoaDonId> {

}
