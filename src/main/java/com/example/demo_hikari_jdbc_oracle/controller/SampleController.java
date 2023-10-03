package com.example.demo_hikari_jdbc_oracle.controller;

import com.example.demo_hikari_jdbc_oracle.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/data")
    public List<Map<String, Object>> getDataFromTable() {
        return sampleService.getSampleData();
    }
}
