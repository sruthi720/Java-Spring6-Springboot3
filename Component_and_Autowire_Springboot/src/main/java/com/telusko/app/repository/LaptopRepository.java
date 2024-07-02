package com.telusko.app.repository;

import com.telusko.app.models.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("Saved in database !");
    }
}
