package com.balim.eticaret.webController;

import com.balim.eticaret.business.abstracts.UserService;
import com.balim.eticaret.business.request.CreateUserRequest;
import com.balim.eticaret.business.request.UpdateUserRequest;
import com.balim.eticaret.business.response.GetAllUserResponse;
import com.balim.eticaret.business.response.GetByIdUserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
@RestController
public class UsersController {
    private UserService userService;
    private HttpStatus code;

    public UsersController (UserService userService){
        this.userService=userService;
    }
    @GetMapping
    List<GetAllUserResponse> getAll(){
        return  UserService.getAll();
    }
    @GetMapping("{/User-id-name-ad-mail}")
    GetByIdUserResponse getById(@PathVariable int id,String firstName,String secondName,String userAddress,String Email){
        return (GetByIdUserResponse) userService.getById(id, firstName, secondName, userAddress, Email);
    }
    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() @Valid()CreateUserRequest createUserRequest){
        this.userService.add(createUserRequest);
    }
    @PutMapping()
    public void update(@RequestBody()UpdateUserRequest updateUserRequest){
        this.userService.upDate(updateUserRequest);
    }
    @DeleteMapping("/id")
    public void delete(@PathVariable int id){
        this.userService.delete(id);
    }
}
