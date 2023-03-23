package com.balim.eticaret.webController;

import com.balim.eticaret.business.abstracts.AdminService;
import java.util.*;
import com.balim.eticaret.business.response.GetAllAdminResponse;
import com.balim.eticaret.business.response.GetByIdAdminResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin")
public class AdminController {

   private AdminService adminService;


    public AdminController(AdminService adminService){
        this.adminService=adminService;
    }
    @GetMapping()
    List<GetAllAdminResponse>getAll(){
        return AdminService.getAll();
    }
    @GetMapping("/{adminName}")
    public GetByIdAdminResponse getById(@PathVariable String adminName){

        return adminService.getById(adminName);

    }
}
