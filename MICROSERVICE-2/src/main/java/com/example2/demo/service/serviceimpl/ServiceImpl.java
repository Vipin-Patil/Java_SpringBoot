package com.example2.demo.service.serviceimpl;

import com.example2.demo.fiegnclient.FiegnClientMicro;
import com.example2.demo.model.Model;
import com.example2.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    FiegnClientMicro fiegnClientMicro;

    @Override
    public ResponseEntity<List<Model>> getDataMicro() {
        return fiegnClientMicro.getAllData();
    }
}
