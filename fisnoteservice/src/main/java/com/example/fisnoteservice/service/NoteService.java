package com.example.fisnoteservice.service;

import java.util.List;

import com.example.fisnoteservice.model.Note;

public interface NoteService {
	
	public List<Note> findAllNotes();
	public Note addNote(Note note);
	public String deleteNotes(int pid);
	public List<Note> findAllNotesByAuthor(String author);
	public List<Note> findAllNotesByTitle(String title);
	
	//public List<Note> findCommentsForPid(int pid);

}
