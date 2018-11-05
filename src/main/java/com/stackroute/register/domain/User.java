package com.stackroute.register.domain;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private String userName;
    private String userId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private long contactNumber;





}
