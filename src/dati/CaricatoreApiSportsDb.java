/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dati;

import java.util.ArrayList;
import java.util.List;
import modello.Giocatore;
import modello.SquadraAvversaria;

/**
 *
 * @author dangelo.gregorio
 */


public class CaricatoreApiSportsDb implements SorgenteDati {
    @Override
    public List<Giocatore> caricaGiocatori() {
        return new ArrayList<>(); // Lo farò nella quando introduco API
    }

    @Override
    public List<SquadraAvversaria> caricaAvversari() {
        return new ArrayList<>();
    }
}
