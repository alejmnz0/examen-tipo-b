package com.salesianostriana.dam.rest.exeptions;

import jakarta.persistence.EntityNotFoundException;

public class NotFoundExeption extends EntityNotFoundException {

    public NotFoundExeption(String message) {
        super(message);
    }
}
