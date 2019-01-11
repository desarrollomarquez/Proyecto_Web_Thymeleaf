package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.domain.Notes;

/**
 * Created by diego on 11/01/2019.
 */
@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {
}
