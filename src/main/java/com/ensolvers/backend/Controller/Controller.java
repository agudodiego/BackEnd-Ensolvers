package com.ensolvers.backend.Controller;

import com.ensolvers.backend.model.Note;
import com.ensolvers.backend.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    public NoteService noteService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping ("/api/notes")
    @ResponseBody
    public List<Note> getNotes(){
        return noteService.getAllData();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping ("/api/notes")
    public void createNote(@RequestBody Note note){
        noteService.createData(note);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping ("/api/notes/{id}")
    public void deleteNote(@PathVariable Long id){
        noteService.deleteData(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping ("/api/notes")
    public void updateNote(@RequestBody Note note) {
        noteService.updateData(note);
    }
}
