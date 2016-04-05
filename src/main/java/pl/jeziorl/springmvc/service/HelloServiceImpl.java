package pl.jeziorl.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jeziorl.springmvc.dao.HelloDao;

@Component
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloDao helloDao;

    public String hello() {
        return helloDao.hello();
    }
}
