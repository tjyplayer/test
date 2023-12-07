package com.example.demo.DTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // 根據姓名查詢員工
    List<Employee> findByName(String name);

    // 根據性別查詢員工
    List<Employee> findByGender(String gender);



    // 其他自定義查詢方法...
}
