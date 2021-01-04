package com.gbabler.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleRequestOne {

    private String name;
    private Integer age;
    private Boolean isAdult;
    private Gender gender;

}