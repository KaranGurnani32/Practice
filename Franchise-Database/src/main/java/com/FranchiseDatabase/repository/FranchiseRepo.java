package com.FranchiseDatabase.repository;

import com.FranchiseDatabase.entity.Franchise;
import com.FranchiseDatabase.service.FranchiseService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FranchiseRepo extends JpaRepository<Franchise, Long> {
    List<Franchise> findAll();
    Franchise save(Franchise franchise);
    Optional<Franchise> findById(Long id);

    @Query(value = "UPDATE Franchise franchise SET franchise = :franchise WHERE franchise.id = :id")
    Franchise update(Franchise franchise, Long id);

    @Query(value = "DELETE FROM Franchise franchise WHERE franchise.id = :id")
    Franchise delete(Long id);

}
