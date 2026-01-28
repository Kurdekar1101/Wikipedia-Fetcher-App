package com.example.wikipedia.Controller;


import com.example.wikipedia.Service.WikiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class WikiController {


@Autowired
private WikiService wikiService;


// JSON Response
@GetMapping("/api/search")
public String searchWiki(@RequestParam String query) {
return wikiService.fetchData(query);
}
}