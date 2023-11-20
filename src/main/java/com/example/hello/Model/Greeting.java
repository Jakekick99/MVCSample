package com.example.hello.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Greeting {
    private String greeting;
    private String name;
    private String salutation;

}
