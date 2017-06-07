package com.teamtreehouse.giflib.dao;


import com.teamtreehouse.giflib.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delet(Category category);
}
