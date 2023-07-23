package com.blbulyandavbulyan.likeastoreboot.dtos.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record UserDto(@NotNull Long id, @NotEmpty String name, @NotNull @Min(1) Long age) {
}
