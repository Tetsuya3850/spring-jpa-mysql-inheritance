package com.example.jpainheritance;

import com.example.jpainheritance.models.BillingMethod;
import com.example.jpainheritance.models.CreditCard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class JpaInheritanceApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {

		// findAllBillingMethods
		ResponseEntity<List<CreditCard>> findAllBillingMethods = restTemplate.exchange(
				"/creditcards", HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), new ParameterizedTypeReference<List<CreditCard>>() {});
		assertEquals(HttpStatus.OK, findAllBillingMethods.getStatusCode());
		assertEquals(1, findAllBillingMethods.getBody().size());
		System.out.println(findAllBillingMethods.getBody().get(0).toString());
	}

}
