package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.UserService;
import com.balim.eticaret.business.request.CreateUserRequest;
import com.balim.eticaret.business.request.UpdateUserRequest;
import com.balim.eticaret.business.response.GetAllUserResponse;
import com.balim.eticaret.business.response.GetByIdUserResponse;
import com.balim.eticaret.business.rules.PasswordChecker;
import com.balim.eticaret.business.rules.UserBusinessRules;
import com.balim.eticaret.core.utilities.mappers.ModelMapperService;
import com.balim.eticaret.dataAccess.abstracts.UsersRepository;
import com.balim.eticaret.entitiy.User;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class UserManager implements UserService,PasswordChecker {

    private ModelMapperService modelMapperService;
    private UsersRepository usersRepository;
    private UserBusinessRules userBusinessRules;
    //private PasswordChecker passwordChecker;


    /*public static boolean checkPassword(String enteredPassword, String userPassword) {
        String hashedPassword = DigestUtils.sha256Hex(enteredPassword);
        return hashedPassword.equals(userPassword);
    }*/






    @Override
    public void add(CreateUserRequest createUserRequest) {

        this.userBusinessRules.checkIfUserExists(createUserRequest.getEMail());
        User user = this.modelMapperService.forRequest().map(createUserRequest,User.class);
this.usersRepository.save(user);
    }

    @Override
    public void delete(int id) {
        this.usersRepository.deleteById(id);

    }

    @Override
    public void upDate(UpdateUserRequest updateUserRequest) {

        User user=this.modelMapperService.forRequest().map(updateUserRequest,User.class);
        this.usersRepository.save(user);

    }

    @Override
    public List<GetAllUserResponse> getAll() {
        List<User>users = usersRepository.findAll();
        List<GetAllUserResponse>getAllUserResponses = new ArrayList<GetAllUserResponse>();
        List<GetAllUserResponse>userResponses=(List<GetAllUserResponse>)users.stream()
                .map(user -> this.modelMapperService.forResponse().map(user,GetAllUserResponse.class))
                .collect(Collectors.toList());

        return userResponses;
    }

    @Override
    public List<GetByIdUserResponse> getById(int id, String firstName, String secondName, String userAddress, String Email) {
        User user = this.usersRepository.findById(id).orElseThrow();
        GetByIdUserResponse response =
        this.modelMapperService.forResponse().map(user,GetByIdUserResponse.class);

        return (List<GetByIdUserResponse>) response;
    }

    @Override
    public boolean checkIfExistPassword(String enteredPassword, String password) {
        String hashedPassword = DigestUtils.sha256Hex(enteredPassword);
        return hashedPassword.equals(password);

    }
}
