package com.group1.vipbilliardspayment.repository;

import com.group1.vipbilliardspayment.entity.ThuNgan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThuNganRepository extends JpaRepository<ThuNgan, Integer> {
}
