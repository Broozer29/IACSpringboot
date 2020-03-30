package com.example.demo;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@RestController
public class IACController {

  @GetMapping
  LocalDate getDate() {
    LocalDate today = LocalDate.now();
    return today;
  }
  
  @PostMapping
  String sayName(@RequestBody String input) {
    JsonParser parser = new JsonParser();
    JsonObject jsonObject = parser.parse(input).getAsJsonObject();
    JsonElement name = jsonObject.get("Name");
    return "Welcome " + name;
  }
  
}
