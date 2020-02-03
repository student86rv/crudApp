package ua.epam.crudApp.service;

import ua.epam.crudApp.model.Account;
import ua.epam.crudApp.repository.AccountRepository;
import ua.epam.crudApp.repository.jdbc.JdbcAccountRepo;

import java.util.List;

public class AccountService implements AccountRepository {

    private AccountRepository jdbcRepo = new JdbcAccountRepo();

    @Override
    public void add(Account entity) {
        jdbcRepo.add(entity);
    }

    @Override
    public Account get(Long id) {
        return jdbcRepo.get(id);
    }

    @Override
    public List<Account> getAll() {
        return jdbcRepo.getAll();
    }

    @Override
    public boolean update(Account entity) {
        return jdbcRepo.update(entity);
    }

    @Override
    public Account remove(Long id) {
        return jdbcRepo.remove(id);
    }
}
