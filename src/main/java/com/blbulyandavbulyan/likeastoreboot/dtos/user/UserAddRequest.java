package com.blbulyandavbulyan.likeastoreboot.dtos.user;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record UserAddRequest(@NotEmpty String name, @NotNull @Min(1) Long age) {
}
