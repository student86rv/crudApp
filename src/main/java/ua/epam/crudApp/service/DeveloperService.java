package ua.epam.crudApp.service;

import ua.epam.crudApp.model.Developer;
import ua.epam.crudApp.repository.DeveloperRepository;
import ua.epam.crudApp.repository.jdbc.JdbcDeveloperRepo;

import java.util.List;

public class DeveloperService implements DeveloperRepository {

    private DeveloperRepository jdbcRepo = new JdbcDeveloperRepo();

    @Override
    public void add(Developer entity) {
        jdbcRepo.add(entity);
    }

    @Override
    public Developer get(Long id) {
        return jdbcRepo.get(id);
    }

    @Override
    public List<Developer> getAll() {
        return jdbcRepo.getAll();
    }

    @Override
    public boolean update(Developer entity) {
        return jdbcRepo.update(entity);
    }

    @Override
    public Developer remove(Long id) {
        return jdbcRepo.remove(id);
    }
}
