package com.example.chap3.spring;

public class RegisterRequest {
    // 실제 회원가입 때 받는 회원 정보
    private String email;
    private String password;
    private String confirmPassword;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 비밀번호 재확인
    public boolean isPasswordEqualToConfirmPassword() {
        return password.equals(confirmPassword);
    }
}
