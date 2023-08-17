package com.anyaudit.service;

import com.anyaudit.models.Milestone;
import com.anyaudit.repository.MileStoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MilestoneService {
    @Autowired
    private MileStoneRepository mileStoneRepository;

    // accessModifies returnType methodName(dataType paramName, dataType paramName)
    public void save(Long identifier, String name, String type) {
        Milestone milestone = new Milestone();
        milestone.setMilestoneName(name);
        milestone.setActivityType(type);
        mileStoneRepository.save(milestone);
    }

    public List<Milestone> findAllMilestones() {
        return mileStoneRepository.findAll();
    }

    public Milestone findById(Long mileStoneId) {
       Optional<Milestone> milestone = mileStoneRepository.findById(mileStoneId);
       return milestone.get();
    }


}
