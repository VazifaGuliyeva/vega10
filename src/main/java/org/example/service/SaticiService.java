package org.example.service;

import org.example.entity.Satici;

import java.util.List;

public interface SaticiService {
    Satici getSaticiById(Integer id);
    void deleteSaticiById(Integer id);
    List<Satici> getAll();
}
