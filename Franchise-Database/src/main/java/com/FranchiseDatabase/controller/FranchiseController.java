package com.FranchiseDatabase.controller;

import com.FranchiseDatabase.entity.Franchise;
import com.FranchiseDatabase.service.FranchiseService;
import com.FranchiseDatabase.service.FranchiseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v2")
public class FranchiseController {

    @Autowired
    private FranchiseService franchiseService;

    @GetMapping("franchise")
    public ResponseEntity<?> getAllFranchise() {
        List<Franchise> franchises = franchiseService.getAllFranchise();

        if (franchises == null) {
            return new ResponseEntity<String> ("Something went wrong.", HttpStatus.INTERNAL_SERVER_ERROR);

        }

        return new ResponseEntity<List<Franchise>>(franchises, HttpStatus.OK);
    }

    @PostMapping("franchises")
    public ResponseEntity<?> saveFranchise(@RequestBody Franchise franchise) {
        Franchise responseFranchise = franchiseService.saveFranchise(franchise);
        return new ResponseEntity<Franchise>(responseFranchise, HttpStatus.OK);

    }

    @PutMapping("franchises")
    public ResponseEntity<?> updateFranchise(@RequestBody Franchise franchise, @PathVariable Long id) {
        Franchise responseFranchise = franchiseService.updateFranchise(franchise, id);
        return new ResponseEntity<Franchise>(responseFranchise, HttpStatus.OK);
    }

    @DeleteMapping("franchises")
    public ResponseEntity<?> deleteFranchise(@RequestBody Franchise franchise, @PathVariable Long id) {
        Franchise responseFranchise = franchiseService.deleteFranchise(id);
        return new ResponseEntity<Franchise>(responseFranchise,HttpStatus.OK);

    }

    @GetMapping("franchise/{id}")
    public ResponseEntity<?> getFranchiseById(@PathVariable Long id) {

        Optional<Franchise> franchise = franchiseService.getFranchiseById(id);
        if (!franchise.isPresent()) {
            System.out.println("here");
            return new ResponseEntity<String>("Franchise does not exist", HttpStatus.NOT_FOUND);

        } else {
            return new ResponseEntity<Franchise>(franchise.get(), HttpStatus.OK);
        }
    }
}
