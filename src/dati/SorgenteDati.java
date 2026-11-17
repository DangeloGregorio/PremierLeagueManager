/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dati;

import java.util.List;
import modello.Giocatore;
import modello.SquadraAvversaria;

/**
 *
 * @author dangelo.gregorio
 */

public interface SorgenteDati {
    List<Giocatore> caricaGiocatori() throws Exception;
    List<SquadraAvversaria> caricaAvversari() throws Exception;
}