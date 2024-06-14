package com.example2.demo.fiegnclient;

import com.example2.demo.model.Model;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("microservice-1")
public interface FiegnClientMicro {

    @GetMapping("/getalldata")
    public ResponseEntity<List<Model>> getAllData();
}
