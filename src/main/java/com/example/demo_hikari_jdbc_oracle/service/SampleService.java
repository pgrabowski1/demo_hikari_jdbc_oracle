package com.example.demo_hikari_jdbc_oracle.service;

import com.example.demo_hikari_jdbc_oracle.repository.SampleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<Map<String, Object>> getSampleData() {
        return sampleRepository.getSampleData();
    }

}
