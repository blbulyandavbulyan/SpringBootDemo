package com.blbulyandavbulyan.likeastoreboot.dtos.item;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record ItemAddRequest(@NotEmpty String title, @NotNull @Min(1) Long price) {
}
