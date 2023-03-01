package com.example.interfaces;

import com.company.Coche;

public interface CocheService {

    public Coche crearCocheDemo();

    /*
    Esto es una INTERFA  y hemos creado un nuevo metodo-----------------------------------
    ----Al crear un nuevo metodo obligamos a las clases a que lo implementen--------------
    ----como no lo teniain da un error, por lo tanto lo que debemos hacer es implementarlo
     */

    public void destruirCoche(Coche coche);
}
