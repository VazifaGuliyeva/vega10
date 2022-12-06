package org.example.manager;

import org.example.entity.Mehsul;
import org.example.service.MehsulService;

import java.util.ArrayList;
import java.util.List;

public class MehsulManager implements MehsulService {
    static List<Mehsul> mehsullar=new ArrayList<>();
    static{
        mehsullar.add(new Mehsul(1,"koynek",23.90,"Enver Sadiqov",4,"Zara"));
        mehsullar.add(new Mehsul(2,"Ayaqqabi",45.89,"Tofiq Quliyev",6,"Nike"));
        mehsullar.add(new Mehsul(3,"Salvar",56.32,"Sevinc Huseynova",9,"Adidas"));

    }
    @Override
    public Mehsul getMehsukById(Integer id) {
        return null;
    }

    @Override
    public void deleteMehsulById(Integer id) {

    }

    @Override
    public List<Mehsul> getAll() {
        return mehsullar;
    }
}
