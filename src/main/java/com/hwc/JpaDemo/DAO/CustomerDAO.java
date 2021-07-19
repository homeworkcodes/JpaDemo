package com.hwc.JpaDemo.DAO;

import com.hwc.JpaDemo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer,Long> {


}
