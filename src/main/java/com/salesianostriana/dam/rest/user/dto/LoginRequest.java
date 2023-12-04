package com.salesianostriana.dam.rest.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    @NotNull(message = "El nombre de usuario no puede estar vacío")
    @NotEmpty(message = "El nombre de usuario no puede estar vacío")
    @NotBlank(message = "El nombre de usuario no puede estar vacío")
    private String username;

    @NotNull(message = "La contraseña no puede estar vacía")
    @NotEmpty(message = "La contraseña no puede estar vacía")
    @NotBlank(message = "La contraseña no puede estar vacía")
    private String password;

}
