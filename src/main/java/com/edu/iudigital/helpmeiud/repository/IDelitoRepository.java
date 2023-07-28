package com.edu.iudigital.helpmeiud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.iudigital.helpmeiud.model.Delito;

@Repository
public interface IDelitoRepository extends JpaRepository<Delito, Long> {
}
