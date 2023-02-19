package com.cg.model.dto;

import com.cg.model.BaseEntity;
import com.cg.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserDTO extends BaseEntity implements Validator {
    private Long id;
    private String username;
    private String email;
    private String password;
    private RoleDTO role;

    @Override
    public boolean supports(Class<?> clazz) {
        return UserDTO.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
