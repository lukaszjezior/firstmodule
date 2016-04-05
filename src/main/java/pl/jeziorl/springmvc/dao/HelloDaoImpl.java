package pl.jeziorl.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jeziorl.springmvc.mapper.HelloMapper;

@Component
public class HelloDaoImpl implements HelloDao {

    @Autowired
    private HelloMapper helloMapper;

    public String hello() {
        return helloMapper.getHello(1);
    }

}
