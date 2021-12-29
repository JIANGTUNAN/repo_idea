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

    void t11();
    void t12();
    void t13();
    void t14();
    void t15();
    void t16();
    void t17();
    void t1();
    void t2();
    void t3();
    void t4();
    void t5();
    void t6();
    void t7();

}
