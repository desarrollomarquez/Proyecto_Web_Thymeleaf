package com.crud.service;

import com.crud.dao.NotesRepository;
import com.crud.domain.Notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by diego on 11/01/2019.
 */
@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public List<Notes> findAll() {
        return notesRepository.findAll();
    }

    @Override
    public Notes findOne(Long id) {
        return notesRepository.findOne(id);
    }

    @Override
    public Notes saveNotes(Notes notes) {
        return notesRepository.save(notes);
    }

    @Override
    public void deleteNotes(Long id) {
        notesRepository.delete(id);
    }
}
