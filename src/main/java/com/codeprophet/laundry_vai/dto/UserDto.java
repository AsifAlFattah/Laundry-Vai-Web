package com.codeprophet.laundry_vai.dto;

import com.codeprophet.laundry_vai.entity.Feedback;
import com.codeprophet.laundry_vai.entity.Order;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.codeprophet.laundry_vai.entity.User}
 */
@Getter
@Setter
public class UserDto implements Serializable {
    Long id;
    String name;
    String email;
    String password;
    String phone;
    String role;
    String address;
}