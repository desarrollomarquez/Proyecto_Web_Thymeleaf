package com.crud.service;

import java.util.List;

import com.crud.domain.Notes;

/**
 * Created by diego on 11/01/2019.
 */
public interface NotesService {

    List<Notes> findAll();

    Notes findOne(Long id);

    Notes saveNotes(Notes notes);

    void deleteNotes(Long id);

}
