package com.telusko.app.service;

import com.telusko.app.models.Laptop;
import com.telusko.app.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop laptop) {
        repo.save(laptop);
    }


    public boolean isServiceProgram(Laptop laptop){
        return true;
    }
}
