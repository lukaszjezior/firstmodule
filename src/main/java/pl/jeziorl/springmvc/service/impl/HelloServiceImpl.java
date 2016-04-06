package pl.jeziorl.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jeziorl.springmvc.dao.HelloDao;
import pl.jeziorl.springmvc.service.HelloService;

@Component
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloDao helloDao;

    public String hello() {
        return helloDao.hello();
    }
}
