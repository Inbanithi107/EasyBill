package com.Techforge.EasyBill.Repository;

import com.Techforge.EasyBill.Entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Integer> {
}
