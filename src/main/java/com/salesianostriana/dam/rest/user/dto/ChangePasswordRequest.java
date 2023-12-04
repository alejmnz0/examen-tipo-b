package com.salesianostriana.dam.rest.user.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ChangePasswordRequest {

    @NotNull(message = "La contraseña no puede estar vacía")
    @NotEmpty(message = "La contraseña no puede estar vacía")
    @NotBlank(message = "La contraseña no puede estar vacía")
    @Min(value = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String oldPassword;

    @NotNull(message = "La contraseña no puede estar vacía")
    @NotEmpty(message = "La contraseña no puede estar vacía")
    @NotBlank(message = "La contraseña no puede estar vacía")
    @Min(value = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String newPassword;

    @NotNull(message = "La contraseña no puede estar vacía")
    @NotEmpty(message = "La contraseña no puede estar vacía")
    @NotBlank(message = "La contraseña no puede estar vacía")
    @Min(value = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String verifyNewPassword;

}
