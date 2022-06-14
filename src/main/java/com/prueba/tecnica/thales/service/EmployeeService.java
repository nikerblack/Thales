package com.prueba.tecnica.thales.service;

import com.google.gson.Gson;
import com.prueba.tecnica.thales.client.ThalesClient;
import com.prueba.tecnica.thales.message.EmployeeWrapper;
import com.prueba.tecnica.thales.model.Employee;
import lombok.AllArgsConstructor;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

@Service
@AllArgsConstructor
public class EmployeeService {

    public ThalesClient client;

    public Employee findById(Employee employee) {
        String employess = client.getEmployess();
        final EmployeeWrapper novedades = new Gson().fromJson(employess, EmployeeWrapper.class);
        System.out.println(novedades);
        return null;
    }

    public void restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://dummy.restapiexample.com/api/v1/employees";
        HttpHeaders headers = new HttpHeaders();
        //headers.set("Host", "www.example.com");
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

        // headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.toSingleValueMap();
        ResponseEntity<String> response = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, new HttpEntity<String>(null, headers), String.class);
        System.out.println(response.getBody());
    }
}



