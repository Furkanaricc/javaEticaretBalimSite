package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateAdminRequest;
import com.balim.eticaret.business.request.UpdateAdminRequest;
import com.balim.eticaret.business.response.GetAllAdminResponse;

import com.balim.eticaret.business.response.GetByIdAdminResponse;


import java.util.List;

public interface AdminService {
    void add(CreateAdminRequest createAdminRequest);
    void upDate(UpdateAdminRequest updateAdminRequest);
    void delete (int adminId);

    List<GetAllAdminResponse> getAll();

    List<GetByIdAdminResponse>getById( int adminId);

}
