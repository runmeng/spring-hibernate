package com.teamtreehouse.giflib.dao;

import com.teamtreehouse.giflib.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao{
    @Autowired
    private SessionFactory sf;

    @Override
    public List<Category> findAll() {
        Session session =sf.openSession();

        List<Category> categories = session.createCriteria(Category.class).list();

        session.close();
        return categories;
    }

    @Override
    public Category findById(Long id) {


        return null;
    }

    @Override
    public void save(Category category) {
        //open the session
        Session session = sf.openSession();

        //Begin a transaction
        session.beginTransaction();

        //save the category
        session.save(category);

        //commit the transaction
        session.getTransaction().commit();
        //close the session
        session.close();
    }

    @Override
    public void delete(Category category) {

    }
}
