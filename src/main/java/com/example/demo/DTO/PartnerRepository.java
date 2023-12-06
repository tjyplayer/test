package com.example.demo.DTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {
    // 自定义查询方法
}
