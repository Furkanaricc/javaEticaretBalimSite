package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.AdminService;
import com.balim.eticaret.business.request.CreateAdminRequest;
import com.balim.eticaret.business.request.UpdateAdminRequest;
import com.balim.eticaret.business.response.GetAllAdminResponse;
import com.balim.eticaret.business.response.GetByIdAdminResponse;
import com.balim.eticaret.business.rules.AdminBusinessRules;
import com.balim.eticaret.business.rules.PasswordChecker;
import com.balim.eticaret.core.utilities.mappers.ModelMapperService;
import com.balim.eticaret.dataAccess.abstracts.AdminsRepository;
import com.balim.eticaret.entitiy.Admin;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AdminManager implements AdminService, PasswordChecker {

    private AdminsRepository adminsRepository;
    private ModelMapperService modelMapperService;
    private AdminBusinessRules adminBusinessRules;

    @Override
    public void add(CreateAdminRequest createAdminRequest) {
        this.adminBusinessRules.checkIfAdminExists(createAdminRequest.getAdminName());
        Admin admin=this.modelMapperService.forRequest().map(createAdminRequest,Admin.class);
        this.adminsRepository.save(admin);

    }

    @Override
    public void upDate(UpdateAdminRequest updateAdminRequest) {
        Admin admin = this.modelMapperService.forRequest().map(updateAdminRequest,Admin.class);
        this.adminsRepository.save(admin);

    }

    @Override
    public void delete(int adminId) {

        this.adminsRepository.deleteById(adminId);
    }

    @Override
    public List<GetAllAdminResponse> getAll() {
        List<Admin>admins = adminsRepository.findAll();
        List<GetAllAdminResponse>getAllAdminResponses = new ArrayList<GetAllAdminResponse>();
        List<GetAllAdminResponse> adminResponses=(List<GetAllAdminResponse>) admins.stream()
                .map(admin -> this.modelMapperService.forResponse().map(admin,GetAllAdminResponse.class))
                .collect(Collectors.toList());
        return adminResponses;
    }

    @Override
    public List<GetByIdAdminResponse> getById(int adminId) {
        Admin admin = this.adminsRepository.findById(adminId).orElseThrow();
        GetByIdAdminResponse response=
                this.modelMapperService.forResponse().map(admin,GetByIdAdminResponse.class);


        return (List<GetByIdAdminResponse>) response;
    }

    @Override
    public boolean checkIfExistPassword(String enteredPassword, String password) {
        String hashedPassword = DigestUtils.sha256Hex(enteredPassword);
        return hashedPassword.equals(password);
    }
}
