package com.anyaudit.service;

import com.anyaudit.BaseTest;
import com.anyaudit.models.Milestone;
import com.anyaudit.repository.MileStoneRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
class MilestoneServiceTest extends BaseTest {

    @Autowired
    private MilestoneService milestoneService;


    @Autowired
    private MileStoneRepository mileStoneRepository;

    @Before
    @After
    public void cleanup() {
        mileStoneRepository.deleteAll();
    }

    @Test
    public void save() {
        //Milestone m = new Milestone();
        milestoneService.save((long)23, "MyMileStone", "Yearly");
        milestoneService.save((long)24, "MyMileStone_1", "Monthly");
        milestoneService.save((long)25, "MyMileStone_2", "Weekly");
        List<Milestone> milestoneList = mileStoneRepository.findAll();
        Assert.assertEquals(milestoneList.size(), 3);
    }

    @Test
    void findAllMilestones() {
    }

    @Test
    void findById() {
    }
}
