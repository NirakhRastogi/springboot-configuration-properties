package com.spring.config.ConfigPropertiesDemo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SenderDetails {

    private String firstName;
    private String lastName;
    private String altEmail;

}
