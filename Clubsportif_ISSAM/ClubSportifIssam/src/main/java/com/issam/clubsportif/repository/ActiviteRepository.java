package com.issam.clubsportif.repository;

import com.issam.clubsportif.entity.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Issam ABOUSSAKKINE
 */
@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {
}
