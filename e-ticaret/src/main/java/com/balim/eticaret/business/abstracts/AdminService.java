package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateAdminRequest;
import com.balim.eticaret.business.request.UpdateAdminRequest;
import com.balim.eticaret.business.response.GetAllAdminResponse;
import com.balim.eticaret.business.response.GetAllCategoryResponse;
import com.balim.eticaret.business.response.GetByIdAdminResponse;


import java.util.List;

public interface AdminService {
    void add(CreateAdminRequest createAdminRequest);
    void upDate(UpdateAdminRequest updateProductResponse);
    void delete (int id);

    static List<GetAllAdminResponse> getAll() {
        return null;
    }

    List<GetByIdAdminResponse>getById(int id, String adminName, String eMail);

}
