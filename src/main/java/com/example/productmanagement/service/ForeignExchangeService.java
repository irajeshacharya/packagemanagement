package com.example.productmanagement.service;

import java.io.IOException;
import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
@Service
public class ForeignExchangeService {

	public RatesResponse getForeignExchange() {
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("my_other_key", "my_other_value");

		HttpEntity<String> entity = new HttpEntity<>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange("https://api.exchangeratesapi.io/latest",
				HttpMethod.GET, entity, String.class);
		RatesResponse ratesResponse = null;
		try {
			ratesResponse = readValue(response.getBody(), RatesResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ratesResponse;
	}

	private ObjectMapper mapper = new ObjectMapper();

	private DozerBeanMapper dozerMapper = new DozerBeanMapper();

	private XmlMapper xmlMapper = new XmlMapper();

	public <T> T convert(Object source, Class<T> target) {
		return mapper.convertValue(source, target);
	}

	public <T> T readValue(String jsonString, Class<T> target)
			throws JsonParseException, JsonMappingException, IOException {
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		return mapper.readValue(jsonString, target);
	}
}
