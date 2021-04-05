package com.soturit.testdatamaker;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Person(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName,
		@JsonProperty("email") String email) {
}