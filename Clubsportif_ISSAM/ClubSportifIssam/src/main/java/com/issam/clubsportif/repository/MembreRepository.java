package com.issam.clubsportif.repository;

import com.issam.clubsportif.entity.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Issam ABOUSSAKKINE
 */
@Repository
public interface MembreRepository extends JpaRepository<Membre, Long> {
}
