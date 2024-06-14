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

    @Override
    public ResponseEntity<List<Model>> getDataMicro() {
//        List<Model> dataList = (List<Model>) fiegnClientMicro.getAllData();
        return new ResponseEntity<List<Model>>((List<Model>) null,HttpStatus.OK);
    }
}
