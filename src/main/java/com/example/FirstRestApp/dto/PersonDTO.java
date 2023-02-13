package com.example.FirstRestApp.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
public class PersonDTO {
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 30,message = "Имя должно быть 2-30 символов")
    private String name;
    @Range(min = 18, max = 100, message = "Укажите возраст")
    private int age;
    @Email
    @NotEmpty
    private String email;
}
