package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateUserRequest;
import com.balim.eticaret.business.request.UpdateUserRequest;
import com.balim.eticaret.business.response.GetAllUserResponse;
import com.balim.eticaret.business.response.GetByIdUserResponse;

import java.util.*;

public interface UserService  {
    void add(CreateUserRequest createUserRequest);
    void delete (int id);
    void upDate(UpdateUserRequest createUserRequest);

    static List<GetAllUserResponse> getAll() {
        return null;
    }

    List<GetByIdUserResponse>getById(int id, String firstName, String secondName, String userAddress, String Email);

}
