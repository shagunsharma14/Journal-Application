package com.journalApp.journal.App.controller;

import com.journalApp.journal.App.entity.JournalEntry;
import com.journalApp.journal.App.repository.JournalEntryRepository;
import com.journalApp.journal.App.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;
    @GetMapping //GET:localhost:8080/journal
    public List<JournalEntry> getAll(){
        return null;
    }


    @PostMapping //POST:localhost:8080/journal
    public boolean createEntry(@RequestBody JournalEntry entry){//req converted to object
        journalEntryService.saveEntry(entry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myId){
        return null;
    }

    @PutMapping("id/{myId}" + "")
    public JournalEntry updateJournalEntryByid(@PathVariable long myId, @PathVariable JournalEntry entry){
        return null;
    }
}
