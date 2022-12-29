package com.FranchiseDatabase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Franchise {
    @Id

    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    private String ownerName;

    private String location;

}
