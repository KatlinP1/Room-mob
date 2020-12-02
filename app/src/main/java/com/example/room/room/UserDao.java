package com.example.room.room;

import java.util.List;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM scores ORDER BY id")
    List<User> getAllScores();

    @Insert
    void insertScore(User user);

    //if ypu want to get invalid user score
    @Query("SELECT * FROM scores WHERE id = :id")
    User loadUserById(int id);
}
