package com.excel.moneytrasferapiactpasd.repositories;

import com.excel.moneytrasferapiactpasd.domains.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {}
