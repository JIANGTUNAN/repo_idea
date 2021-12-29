package com.tooolan.dao;

import com.tooolan.domain.Account;

import java.util.List;

public interface AccountDao {


    List<Account> findAll();

    void save(Account account);

    Account findById(Integer id);

    void update(Account account);

    void deleteBatch(Integer[] ids);
    
    void update2(Account account);
}
