package com.soturit.testdatamaker;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


class TestdatamakerApplicationIT {

	@Test
	void contextLoads() {
		when().
			get("/people").
		then().
			statusCode(200)
			.and()
			.body(
				"firstName", notNullValue(),
				"lastName", notNullValue(),
				"email", notNullValue()
			);
	}

}
