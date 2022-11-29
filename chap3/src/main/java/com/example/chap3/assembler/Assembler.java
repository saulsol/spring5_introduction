package com.example.chap3.assembler;

import com.example.chap3.spring.ChangePasswordService;
import com.example.chap3.spring.MemberDao;
import com.example.chap3.spring.MemberRegisterService;

public class Assembler {
    private MemberDao memberDao;
    private MemberRegisterService regSvc;
    private ChangePasswordService pwdSvc;

    public Assembler() {
        memberDao = new MemberDao();
        regSvc = new MemberRegisterService(memberDao);
        pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
    }

    //자신이 생성하고 조립한 객체를 리턴하는 메서드를 제공
    //

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public MemberRegisterService getMemberRegisterService() {
        return regSvc;
    }

    public ChangePasswordService getChangePasswordService() {
        return pwdSvc;
    }
}
