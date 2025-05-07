package com.Techforge.EasyBill.Repository;

import com.Techforge.EasyBill.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
