package com.issam.clubsportif.repository;

import com.issam.clubsportif.entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Issam ABOUSSAKKINE
 */
@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
