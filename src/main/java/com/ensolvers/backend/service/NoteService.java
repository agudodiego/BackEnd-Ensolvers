package com.ensolvers.backend.service;

import com.ensolvers.backend.model.Note;
import com.ensolvers.backend.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteService implements INoteService{

    @Autowired
    public NoteRepository noteRepository;

    @Override
    public List<Note> getAllData() {
        return noteRepository.findAll();
    }

    @Override
    public void createData(Note note) {
        noteRepository.save(note);
    }

    @Override
    public void deleteData(Long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public void updateData(Note note) {
    noteRepository.save(note);
    }
}
