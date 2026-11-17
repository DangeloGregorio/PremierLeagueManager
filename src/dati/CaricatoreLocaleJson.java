/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dati;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.util.List;
import modello.Giocatore;
import modello.SquadraAvversaria;

/**
 *
 * @author dangelo.gregorio
 */


public class CaricatoreLocaleJson implements SorgenteDati {
    private final Gson gson = new Gson();

    @Override
    public List<Giocatore> caricaGiocatori() throws Exception {
        try (FileReader reader = new FileReader("data/giocatori.json")) {
            return gson.fromJson(reader, new TypeToken<List<Giocatore>>(){}.getType());
        }
    }

    @Override
    public List<SquadraAvversaria> caricaAvversari() throws Exception {
        try (FileReader reader = new FileReader("data/avversari.json")) {
            return gson.fromJson(reader, new TypeToken<List<SquadraAvversaria>>(){}.getType());
        }
    }
}