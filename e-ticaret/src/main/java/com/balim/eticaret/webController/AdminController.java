package com.balim.eticaret.webController;

import com.balim.eticaret.business.abstracts.AdminService;
import java.util.*;

import com.balim.eticaret.business.request.CreateAdminRequest;
import com.balim.eticaret.business.request.UpdateAdminRequest;
import com.balim.eticaret.business.response.GetAllAdminResponse;
import com.balim.eticaret.business.response.GetByIdAdminResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/admin")
public class AdminController {

   private final AdminService adminService;

   private HttpStatus code;


    public AdminController(AdminService adminService){
        this.adminService=adminService;
    }
    @GetMapping()
    List<GetAllAdminResponse>getAll(){
        return adminService.getAll();
    }
    @GetMapping("/{adminName}")
    public GetByIdAdminResponse getById(@PathVariable int adminId){

        return (GetByIdAdminResponse) adminService.getById(adminId);

    }
    @PostMapping()
    @ResponseStatus(code=HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateAdminRequest createAdminRequest){
        this.adminService.add(createAdminRequest);
    }
    @PutMapping()
    public void update(@RequestBody() UpdateAdminRequest updateAdminRequest){
        this.adminService.upDate(updateAdminRequest);
    }
    @DeleteMapping("/adminName-eMail")
    public void delete(@PathVariable int adminId){

        this.adminService.delete(adminId);
    }
}
