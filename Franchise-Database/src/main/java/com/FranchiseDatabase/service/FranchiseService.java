package com.FranchiseDatabase.service;

import com.FranchiseDatabase.entity.Franchise;

import java.util.List;
import java.util.Optional;

public interface FranchiseService {
    List<Franchise> getAllFranchise();
    Franchise saveFranchise(Franchise franchise);
    Optional<Franchise> getFranchiseById(Long id);

    Franchise updateFranchise(Franchise franchise, Long id);

    Franchise deleteFranchise(Long id);
}
