package com.example.departments.Service;
import com.example.departments.Entity.Department;
import com.example.departments.Repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@RequiredArgsConstructor
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDeparment(Department department) {
        log.info("Inside saveDepartment of Service! ");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside findDepartmentById ");
        return departmentRepository.findById(departmentId).get();
    }
}
