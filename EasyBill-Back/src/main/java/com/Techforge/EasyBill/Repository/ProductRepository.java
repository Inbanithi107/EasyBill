package com.Techforge.EasyBill.Repository;

import com.Techforge.EasyBill.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByBarcode(String barcode);

}
