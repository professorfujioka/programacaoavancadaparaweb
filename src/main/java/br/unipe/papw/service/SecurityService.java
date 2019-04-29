package br.unipe.papw.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
