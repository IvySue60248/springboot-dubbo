package com.ivy.sbdubboprovider.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.ivy.sbdubboservice.service.RemoteUserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class RemoteUserServiceImpl implements RemoteUserService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
