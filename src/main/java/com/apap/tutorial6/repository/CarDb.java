package com.apap.tutorial6.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tutorial6.model.CarModel;

/**
 * CarDb
 */
@Repository
public interface CarDb extends JpaRepository<CarModel, Long> {
    Optional<CarModel> findByType(String type);

    List<CarModel> findByDealerIdOrderByPriceAsc(Long dealerId);
}