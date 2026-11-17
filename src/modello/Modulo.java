/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modello;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author dangelo.gregorio
 */


public class Modulo {
    private String nome;
    private Map<Ruolo, Integer> slot = new EnumMap<>(Ruolo.class);

    public Modulo(String nome) {
        this.nome = nome;
        switch (nome) {
            case "4-4-2": setSlot(1, 4, 4, 2); break;
            case "3-5-2": setSlot(1, 3, 5, 2); break;
            case "3-4-3": setSlot(1, 3, 4, 3); break;
            default:      this.nome = "4-3-3"; setSlot(1, 4, 3, 3);
        }
    }

    private void setSlot(int por, int dif, int cen, int att) {
        slot.put(Ruolo.POR, por);
        slot.put(Ruolo.DIF, dif);
        slot.put(Ruolo.CEN, cen);
        slot.put(Ruolo.ATT, att);
    }

    public String getNome() { return nome; }
    public int getSlotPerRuolo(Ruolo r) { return slot.get(r); }
}
