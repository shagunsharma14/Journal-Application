package com.journalApp.journal.App.repository;

import com.journalApp.journal.App.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
public interface JournalEntryRepository extends com.journalApp.journal.App.repository.MongoRepository<JournalEntry, String> {

}
