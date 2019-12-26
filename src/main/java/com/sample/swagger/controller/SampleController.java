package com.sample.swagger.controller;


import com.sample.swagger.Connection;
import com.sample.swagger.ConnectionEntity;
import com.sample.swagger.api.ConnectionsApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class SampleController implements ConnectionsApi {

    public ResponseEntity<ConnectionEntity> addConnection(@RequestBody Connection body) {
        System.out.println(body);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
