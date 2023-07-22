package com.blbulyandavbulyan.likeastoreboot.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record ItemAddRequest(@NotEmpty String name, @NotNull @Min(1) Long price) {
}
