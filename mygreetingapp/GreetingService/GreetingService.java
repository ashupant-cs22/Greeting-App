package com.bridgelabz.mygreetingapp.GreetingService;

import com.bridgelabz.mygreetingapp.model.Greeting;
import com.bridgelabz.mygreetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    GreetingRepo greetingRepo;
    public Greeting save(Greeting greet){
        return greetingRepo.save(greet);
    }
    public Greeting getUser(Integer id) {
        return greetingRepo.findById(Long.valueOf(id)).get();
    }

    public List<Greeting> listAllUser() {
        return greetingRepo.findAll();
    }

    public void deleteUser(Integer id) {
        greetingRepo.deleteById(Long.valueOf(id));
    }
}
