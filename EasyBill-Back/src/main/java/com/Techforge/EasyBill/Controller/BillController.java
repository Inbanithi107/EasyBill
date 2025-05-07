package com.Techforge.EasyBill.Controller;

import com.Techforge.EasyBill.Entity.Bill;
import com.Techforge.EasyBill.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BillController {

    @Autowired
    private BillService service;

    @PostMapping("/savebill")
    public String savebill(@RequestBody Bill bill){
        service.savebill(bill);
         return "bill saved successfully";
    }

    @PostMapping("/saveandprint")
    public void saveandprint(@RequestBody Bill bill){
        service.saveandprint(bill);
    }

    @GetMapping("/getbillbyid")
    public ResponseEntity<Bill> getbill(@RequestHeader int id){
        return new ResponseEntity<>(service.getbill(id), HttpStatus.OK);
    }
}
