package com.portfolio.portfoliobackend.Service;

import com.portfolio.portfoliobackend.Entity.Skills;
import com.portfolio.portfoliobackend.Repository.SkillsRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService {

    @Autowired
    SkillsRepository rSkills;

    public List<Skills> list() {
        return rSkills.findAll();
    }

    public Optional<Skills> getOne(int id) {
        return rSkills.findById(id);
    }

    public Optional<Skills> getByNombreSkill(String nombreSkill) {
        return rSkills.findByNombreSkill(nombreSkill);
    }

    public void save(Skills skills) {
        rSkills.save(skills);
    }

    public void delete(int id) {
        rSkills.deleteById(id);
    }

    public boolean existById(int id) {
        return rSkills.existsById(id);
    }

    public boolean existByNombreSkill(String nombreSkill) {
        return rSkills.existsByNombreSkill(nombreSkill);
    }
}
