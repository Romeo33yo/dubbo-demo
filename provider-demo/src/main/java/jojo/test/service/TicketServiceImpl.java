package jojo.test.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class TicketServiceImpl implements TicketService{

    public String sayHello() {
        return "faq";
    }
}
