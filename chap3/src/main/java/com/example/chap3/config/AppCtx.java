package com.example.chap3.config;

import com.example.chap3.spring.ChangePasswordService;
import com.example.chap3.spring.MemberDao;
import com.example.chap3.spring.MemberRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public MemberDao memberDao(){
       return new MemberDao();
    }
    @Bean
    public MemberRegisterService memberRegisterService(){
        return new MemberRegisterService(memberDao());
    }

    @Bean
    public ChangePasswordService changePasswordService (){
        ChangePasswordService changePasswordService = new ChangePasswordService();
        changePasswordService.setMemberDao(memberDao());
        return changePasswordService;
    }

}
