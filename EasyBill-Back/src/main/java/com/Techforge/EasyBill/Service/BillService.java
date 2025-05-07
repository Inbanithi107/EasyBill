package com.Techforge.EasyBill.Service;

import com.Techforge.EasyBill.Entity.Bill;
import com.Techforge.EasyBill.Repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillService {

    @Autowired
    private BillRepository repository;

    public void savebill(Bill bill){
        repository.save(bill);
    }

    public Bill getbill(int billid){
        Optional<Bill> bill = repository.findById(billid);
        return bill.get();
    }

    public void printbill(int billid){
        Bill bill = getbill(billid);

    }

    public void saveandprint(Bill bill){
        savebill(bill);
        printbill(bill.getId());
    }
}
