package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class SongrApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testSayHelloWithoutName() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
	}

	@Test
	public void testSayHelloWithName() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello").param("name", "Alice"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello, Alice!"));
	}


	@Test
	public void testCapitalizeText() throws Exception {
		String inputText = "hello";
		String expectedCapitalizedText = "HELLO";

		mockMvc.perform(MockMvcRequestBuilders.get("/capitalize/{text}", inputText))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("capitalize"))
				.andExpect(MockMvcResultMatchers.model().attribute("capitalizedText", expectedCapitalizedText));
	}

}
