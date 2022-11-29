package com.example.chap3.spring;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
    // 아직 DB 와의 연동은 하지 않는다.

    private static long nextId = 0;
    private Map<String, Member> map = new HashMap<>();

    // email 값 받아서 Member 객체 리턴
    public Member selectByEmail(String email){
        return map.get(email);
    }

    // member 객체 map에 삽입
    public void insert(Member member){
        member.setId(++nextId);
        map.put(member.getEmail(), member);
    }

    // member 객체 받아서 업데이트
    public void update(Member member){
        map.put(member.getEmail(), member);
    }

}
