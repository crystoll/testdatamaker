package com.soturit.testdatamaker;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
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
				"[0].firstName", notNullValue(),
				"[0].lastName", notNullValue(),
				"[0].email", notNullValue()
			);
	}

}
