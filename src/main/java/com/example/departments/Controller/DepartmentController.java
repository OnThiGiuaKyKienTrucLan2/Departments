package com.example.departments.Controller;

import com.example.departments.Entity.Department;
import com.example.departments.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
//    @Value("${welcome}")
//    String AA;

    @PostMapping
    public Department saveDeparment(@RequestBody Department department){
        log.info("inside saveDeparment method if Department controller!");
        return departmentService.saveDeparment(department);
    }

    @GetMapping("/{id}")
//    @Cacheable("order")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDeparmentById method if Department controller!");
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping
    public String helloWorld(){
        return "Hello Vinh nè";
    }
}
