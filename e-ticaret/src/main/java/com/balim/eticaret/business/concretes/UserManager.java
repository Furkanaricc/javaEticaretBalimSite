package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.UserService;
import com.balim.eticaret.business.request.CreateUserRequest;
import com.balim.eticaret.business.response.GetAllUserResponse;
import com.balim.eticaret.business.response.GetByIdUserResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    @Override
    public void add(CreateUserRequest createUserRequest) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void upDate(CreateUserRequest createUserRequest) {

    }

    @Override
    public List<GetAllUserResponse> getAll() {
        return null;
    }

    @Override
    public List<GetByIdUserResponse> getById(int id, String firstName, String secondName, String userAddress, String Email) {
        return null;
    }
}
