package com.example.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.example.interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo(){
        return new CocheElectrico("Creando Coche Clasico");
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche CLASICO");
    }
}

