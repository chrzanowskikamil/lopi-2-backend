package com.liftoff.project.controller.category.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryUidRequestDTO {

    @NotNull(message = "Category Uid cannot be null")
    private UUID categoryUid;

}
