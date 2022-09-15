package com.example.bp_proekt.repository;

import com.example.bp_proekt.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query(value = "SELECT a.* FROM \"DB_proekt\".\"Eshopp\".account a WHERE a.username = :user and a.password=:pass", nativeQuery = true)
    Account findByUsernameAndPassword(@Param("user") String username, @Param("pass") String password);

}
