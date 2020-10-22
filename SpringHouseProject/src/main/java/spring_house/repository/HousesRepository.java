package spring_house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring_house.beans.Houses;

@Repository
public interface HousesRepository extends JpaRepository<Houses, Long>{ }
