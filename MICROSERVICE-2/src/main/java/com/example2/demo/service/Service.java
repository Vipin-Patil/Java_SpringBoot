package com.example2.demo.service;

import com.example2.demo.model.Model;
import jakarta.ws.rs.core.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface Service {

    public ResponseEntity<List<Model>> getDataMicro();
}
