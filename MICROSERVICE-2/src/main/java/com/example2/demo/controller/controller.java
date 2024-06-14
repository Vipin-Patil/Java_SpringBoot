package com.example2.demo.controller;

import com.example2.demo.fiegnclient.FiegnClientMicro;
import com.example2.demo.model.Model;
import com.example2.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    Service service;

    @GetMapping("/getData")
    public ResponseEntity<List<Model>> getDataFromMicroservice() {
        return service.getDataMicro();
    }
}
