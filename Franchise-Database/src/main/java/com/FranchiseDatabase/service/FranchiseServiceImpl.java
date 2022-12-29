package com.FranchiseDatabase.service;

import com.FranchiseDatabase.entity.Franchise;
import com.FranchiseDatabase.repository.FranchiseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FranchiseServiceImpl implements FranchiseService{

    @Autowired
    private FranchiseRepo franchiseRepo;


    @Override
    public List<Franchise> getAllFranchise() {
        return franchiseRepo.findAll();
    }

    @Override
    public Franchise saveFranchise(Franchise franchise) {
        return franchiseRepo.save(franchise);
    }

    @Override
    public Optional<Franchise> getFranchiseById(Long id) {
        return franchiseRepo.findById(id);
    }

    @Override
    public Franchise updateFranchise(Franchise franchise, Long id) {
        return franchiseRepo.update(franchise, id);
    }

    @Override
    public Franchise deleteFranchise(Long id) {
        return franchiseRepo.delete(id);
    }
}
