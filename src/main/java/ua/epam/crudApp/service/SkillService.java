package ua.epam.crudApp.service;

import ua.epam.crudApp.model.Skill;
import ua.epam.crudApp.repository.SkillRepository;
import ua.epam.crudApp.repository.jdbc.JdbcSkillRepo;

import java.util.List;

public class SkillService implements SkillRepository {

    private SkillRepository jdbcRepo = new JdbcSkillRepo();
    @Override
    public void add(Skill entity) {
        jdbcRepo.add(entity);
    }

    @Override
    public Skill get(Long id) {
        return jdbcRepo.get(id);
    }

    @Override
    public List<Skill> getAll() {
        return jdbcRepo.getAll();
    }

    @Override
    public boolean update(Skill entity) {
        return jdbcRepo.update(entity);
    }

    @Override
    public Skill remove(Long id) {
        return jdbcRepo.remove(id);
    }
}
