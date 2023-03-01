package com.example.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.example.interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo Coche SPORT");
    }
}
