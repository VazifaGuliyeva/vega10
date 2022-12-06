package org.example.manager;

import org.example.entity.Satici;
import org.example.service.SaticiService;

import java.util.ArrayList;
import java.util.List;

public class SaticiManager implements SaticiService {

    static  List<Satici> saticilar=new ArrayList<>();
    static{
        saticilar.add(new Satici(1,"Enver","Quliyev","12.09.2002"));
        saticilar.add(new Satici(2,"Kamil","Talibov","23.08.1978"));
    }
    @Override
    public Satici getSaticiById(Integer id) {
        return null;
    }

    @Override
    public void deleteSaticiById(Integer id) {

    }

    @Override
    public List<Satici> getAll() {
        return null;
    }
}
