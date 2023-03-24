package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateAdminRequest;
import com.balim.eticaret.business.request.UpdateAdminRequest;
import com.balim.eticaret.business.response.GetAllAdminResponse;

import com.balim.eticaret.business.response.GetByIdAdminResponse;
import org.springframework.stereotype.Service;


import java.util.List;

public interface AdminService {
    void add(CreateAdminRequest createAdminRequest);
    void upDate(UpdateAdminRequest updateAdminRequest);
    void delete (String adminName,String eMail);

    static List<GetAllAdminResponse> getAll() {
        return null;
    }

    List<GetByIdAdminResponse>getById( String adminName, String eMail);

}
