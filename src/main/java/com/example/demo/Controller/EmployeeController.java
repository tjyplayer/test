package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.DTO.Employee;
import com.example.demo.Service.EmployeeService;
import java.util.List;
import org.springframework.http.HttpStatus;

@RestController

@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // 获取所有员工
    @GetMapping("/test")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        try {
            List<Employee> employees = employeeService.findAllEmployees();
            if (employees.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(employees);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
    // 根据姓名查询员工
    @GetMapping("/test/name/{name}")
    public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable String name) {
        try {
            List<Employee> employees = employeeService.findByName(name);
            if (employees.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(employees);
        } catch (Exception e) {
            // 日志记录异常信息
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}