package jojo.test.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;


    public String sayHi(){
        return ticketService.sayHello();
    }

}
