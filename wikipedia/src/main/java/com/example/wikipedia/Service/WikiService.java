package com.example.wikipedia.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WikiService {

    public String fetchData(String query) {

        try {
            // ✅ Normalize query for Wikipedia
            String formattedQuery = query.trim().replace(" ", "_");
            String encodedQuery = URLEncoder.encode(formattedQuery, StandardCharsets.UTF_8);

            String url = "https://en.wikipedia.org/api/rest_v1/page/summary/" + encodedQuery;

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.set("User-Agent", "WikipediaFetcher/1.0 (contact@example.com)");

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<String> response = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    entity,
                    String.class
            );

            return response.getBody();

        } catch (Exception e) {
            return "{\"error\":\"No Wikipedia page found\"}";
        }
    }
}
