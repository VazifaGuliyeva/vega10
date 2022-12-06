package org.example.service;

import org.example.entity.Mehsul;

import java.util.List;

public interface MehsulService {
     Mehsul getMehsukById(Integer id);
     void deleteMehsulById(Integer id);
     List<Mehsul> getAll();


}
