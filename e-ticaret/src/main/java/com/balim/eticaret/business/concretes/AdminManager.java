package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.AdminService;
import com.balim.eticaret.business.request.CreateAdminRequest;
import com.balim.eticaret.business.request.UpdateAdminRequest;
import com.balim.eticaret.business.response.GetByIdAdminResponse;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminManager implements AdminService {


    @Override
    public void add(CreateAdminRequest createAdminRequest) {

    }

    @Override
    public void upDate(UpdateAdminRequest updateAdminRequest) {

    }

    @Override
    public void delete(String adminName, String eMail) {

    }

    @Override
    public List<GetByIdAdminResponse> getById(String adminName, String eMail) {
        return null;
    }
}
