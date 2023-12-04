package com.salesianostriana.dam.rest.user.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {

    @NotNull(message = "El nombre de usuario no puede estar vacío")
    @NotEmpty(message = "El nombre de usuario no puede estar vacío")
    @NotBlank(message = "El nombre de usuario no puede estar vacío")
    private String username;

    @Email(message = "Introduzca un email válido")
    private String email;

    @NotNull(message = "La contraseña no puede estar vacía")
    @NotEmpty(message = "La contraseña no puede estar vacía")
    @NotBlank(message = "La contraseña no puede estar vacía")
    @Min(value = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    @NotNull(message = "La contraseña no puede estar vacía")
    @NotEmpty(message = "La contraseña no puede estar vacía")
    @NotBlank(message = "La contraseña no puede estar vacía")
    @Min(value = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String verifyPassword;


    private String avatar;


    private String fullName;

}
