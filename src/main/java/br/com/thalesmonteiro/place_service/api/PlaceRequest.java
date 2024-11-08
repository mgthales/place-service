package br.com.thalesmonteiro.place_service.api;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest(
        @NotBlank String name, @NotBlank String city, @NotBlank String state) {

}