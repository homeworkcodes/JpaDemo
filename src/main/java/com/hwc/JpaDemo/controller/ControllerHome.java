package com.hwc.JpaDemo.controller;

import com.hwc.JpaDemo.DAO.CustomerDAO;
import com.hwc.JpaDemo.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHome {

    @Autowired
    public CustomerDAO cusDao;

    @PostMapping("customer/addCustomer")
    public ResponseEntity addCustomer(@RequestBody Customer cus){

        cusDao.save(cus);
        return new ResponseEntity("Created", HttpStatus.OK);
    }


}
