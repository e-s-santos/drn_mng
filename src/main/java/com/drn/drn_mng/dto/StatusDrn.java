package com.drn.drn_mng.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record StatusDrn(
		@NotNull
		@NotBlank
		double longitude, 
		@NotNull
		@NotBlank
		double latitude, 
		@NotNull
		@NotBlank
		float barox,
		@NotNull
		@NotBlank
		float baroy,
		@NotNull
		@NotBlank
		float baroz,
		@NotNull
		@NotBlank
		float baroC) {
	
}
