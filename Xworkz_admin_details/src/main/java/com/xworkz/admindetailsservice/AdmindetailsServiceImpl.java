<<<<<<< HEAD
package com.xworkz.admindetailsservice;

import com.xworkz.admindetailsdto.AdmindetailsDTO;
import com.xworkz.admindetailsentity.AdmindetailsEntity;
import com.xworkz.admindetailsrepository.AdmindetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdmindetailsServiceImpl implements AdmindetailsService {

    @Autowired
    private AdmindetailsRepository repository;

    @Override
    public boolean save(AdmindetailsDTO dto) {
        if (dto.getName() == null || dto.getName().length() < 10) {
            System.out.println("Validation failed: Name should be at least 10 characters long.");
            return false;
        }

        if (dto.getAge() < 18) {
            System.out.println("Validation failed: Age should be 18 or above.");
            return false;
        }

        if (dto.getPassword() == null || dto.getPassword().length() < 7  || dto.getPassword().chars().filter(ch -> "!@#$%^&*()".indexOf(ch) >= 0).count() < 2) {
            System.out.println("Validation failed: Password should have at least 7 characters and contain 2 special characters.");
            return false;
        }

        if (!dto.getPassword().equals(dto.getConfirmpassword())) {
            System.out.println("Validation failed: Password and Confirm Password should match.");
            return false;
        }

        if (!dto.getPhonenumber().startsWith("9") || dto.getPhonenumber().length() != 10) {
            System.out.println("Validation failed: Phone number should start with 9 and have 10 digits.");
            return false;
        }

        AdmindetailsEntity entity = new AdmindetailsEntity();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setConfirmPassword(dto.getConfirmpassword());
        entity.setPhonenumber(dto.getPhonenumber());

        boolean isSaved = repository.save(entity);
        return isSaved;
    }
}
=======
package com.xworkz.admindetailsservice;

import com.xworkz.admindetailsdto.AdmindetailsDTO;
import com.xworkz.admindetailsentity.AdmindetailsEntity;
import com.xworkz.admindetailsrepository.AdmindetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdmindetailsServiceImpl implements AdmindetailsService {

    @Autowired
    private AdmindetailsRepository repository;

    @Override
    public boolean save(AdmindetailsDTO dto) {
        if (dto.getName() == null || dto.getName().length() < 10) {
            System.out.println("Validation failed: Name should be at least 10 characters long.");
            return false;
        }

        if (dto.getAge() < 18) {
            System.out.println("Validation failed: Age should be 18 or above.");
            return false;
        }

        if (dto.getPassword() == null || dto.getPassword().length() < 7  || dto.getPassword().chars().filter(ch -> "!@#$%^&*()".indexOf(ch) >= 0).count() < 2) {
            System.out.println("Validation failed: Password should have at least 7 characters and contain 2 special characters.");
            return false;
        }

        if (!dto.getPassword().equals(dto.getConfirmpassword())) {
            System.out.println("Validation failed: Password and Confirm Password should match.");
            return false;
        }

        if (!dto.getPhonenumber().startsWith("9") || dto.getPhonenumber().length() != 10) {
            System.out.println("Validation failed: Phone number should start with 9 and have 10 digits.");
            return false;
        }

        AdmindetailsEntity entity = new AdmindetailsEntity();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setConfirmPassword(dto.getConfirmpassword());
        entity.setPhonenumber(dto.getPhonenumber());

        boolean isSaved = repository.save(entity);
        return isSaved;
    }
}
>>>>>>> 22a343a6ad2b0c03fc5478ea544b171112d152e5
