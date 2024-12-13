package com.xworkz.admindetailscontroller;

import com.xworkz.admindetailsdto.AdmindetailsDTO;
import com.xworkz.admindetailsservice.AdmindetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdmindetailsController {

    @Autowired
    private AdmindetailsService adminService;

    public AdmindetailsController() {
        System.out.println("AdmindetailsController Constructor");
    }

    @PostMapping("/save")
    public String onSubmit(AdmindetailsDTO dto) {
        System.out.println(dto);
        boolean saved = adminService.save(dto);
        if (saved) {
            return "success.jsp";
        } else {
            return "form.jsp";
        }
    }
}
