/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modello;

/**
 *
 * @author dangelo.gregorio
 */

public class Giocatore {
    private String id;
    private String nome;
    private Ruolo ruolo;
    private String squadraReale;
    private int prezzo;
    private int puntiForza;
    private String urlFoto;

    public Giocatore(String id, String nome, Ruolo ruolo, String squadraReale, int prezzo, int puntiForza, String urlFoto) {
        this.id = id;
        this.nome = nome;
        this.ruolo = ruolo;
        this.squadraReale = squadraReale;
        this.prezzo = prezzo;
        this.puntiForza = puntiForza;
        this.urlFoto = urlFoto;
    }

    public String getId() { 
        return id; 
    }
    public String getNome() { 
        return nome; 
    }
    public Ruolo getRuolo() { 
        return ruolo; 
    }
    public String getSquadraReale() { 
        return squadraReale; 
    }
    public int getPrezzo() { 
        return prezzo; 
    }
    public int getPuntiForza() { 
        return puntiForza; 
    }
    public String getUrlFoto() { 
        return urlFoto; 
    }

    @Override
    public String toString() {
        return "[" + ruolo + "] " + nome + " (" + squadraReale + ") - Prezzo: " + prezzo + " | Forza: " + puntiForza;
    }
}
