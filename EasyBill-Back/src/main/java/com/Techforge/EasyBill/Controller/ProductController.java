package com.Techforge.EasyBill.Controller;

import com.Techforge.EasyBill.Entity.Product;
import com.Techforge.EasyBill.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addproduct")
    public ResponseEntity<String> addproduct(@RequestBody Product product){
        service.createproduct(product);
        return new ResponseEntity<>("Product created succesfully", HttpStatus.OK);
    }

    @GetMapping("/getbyid")
    public ResponseEntity<Product> findproductbyid(@RequestHeader int id){
        Product product = service.getproductbyid(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/getbybarcode")
    public Product findbybarcode(@RequestHeader String barcode){
        return service.getproductbybarcode(barcode);
    }

}
