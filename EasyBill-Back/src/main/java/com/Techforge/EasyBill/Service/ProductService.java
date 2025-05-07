package com.Techforge.EasyBill.Service;

import com.Techforge.EasyBill.Entity.Product;
import com.Techforge.EasyBill.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void createproduct(Product product){
        repository.save(product);
    }

    public Product getproductbyid(int id){
        Optional<Product> product = repository.findById(id);
        if (product.get()!=null){
            return product.get();
        }
        return new Product();
    }

    public Product getproductbybarcode(String barcode){
        Product product = repository.findByBarcode(barcode);
        return product;
    }

}
