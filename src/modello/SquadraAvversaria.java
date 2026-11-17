/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modello;

/**
 *
 * @author dangelo.gregorio
 */

public class SquadraAvversaria {
    private String id;
    private String nome;
    private String stadio;
    private int puntiDifficolta;
    private int premioCrediti;

    public SquadraAvversaria(String id, String nome, String stadio, int puntiDifficolta, int premioCrediti) {
        this.id = id;
        this.nome = nome;
        this.stadio = stadio;
        this.puntiDifficolta = puntiDifficolta;
        this.premioCrediti = premioCrediti;
    }

    public String getId() { 
        return id; 
    }
    public String getNome() { 
        return nome; 
    }
    public String getStadio() { 
        return stadio; 
    }
    public int getPuntiDifficolta() { 
        return puntiDifficolta; 
    }
    public int getPremioCrediti() { 
        return premioCrediti; 
    }

    @Override
    public String toString() {
        return nome + " (Difficoltà: " + puntiDifficolta + " | Premio: +" + premioCrediti + ")";
    }
}
