package com.ensolvers.backend.service;

import com.ensolvers.backend.model.Note;

import java.util.List;

public interface INoteService {
    public List<Note> getAllData();

    public void createData(Note note);

    public void deleteData(Long id);

    public void updateData(Note note);

}
