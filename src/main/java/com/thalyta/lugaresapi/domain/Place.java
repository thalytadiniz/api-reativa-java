package com.thalyta.lugaresapi.domain;


import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.validation.constraints.NotBlank;

public record Place(
        @Id Long id, @NotBlank String name, String slug,
        @NotBlank String state,
        @NotBlank String city,
        @CreatedDate LocalDateTime createdAt,
        @LastModifiedDate LocalDateTime updatedAt) {

    public Place withSlug(String slug) {
        return new Place(id, name, slug, city, state, createdAt, updatedAt);
    }
}