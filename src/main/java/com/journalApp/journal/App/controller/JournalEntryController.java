package com.journalApp.journal.App.controller;

import com.journalApp.journal.App.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<Long, JournalEntry>(); //Since we've no DB so we're using map to store data

    @GetMapping //GET:localhost:8080/journal
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping //POST:localhost:8080/journal
    public boolean createEntry(@RequestBody JournalEntry entry){//req converted to object
        journalEntries.put(entry.getId(), entry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myId){
        return journalEntries.remove(myId);
    }

    @PutMapping("id/{myId}" +
            "")
    public JournalEntry updateJournalEntryByid(@PathVariable long myId, @PathVariable JournalEntry entry){
        return journalEntries.put(myId, entry);
    }
}
