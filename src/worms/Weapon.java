/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worms;

/**
 *
 * @author Sebastian Ordenes
 */
public abstract class Weapon {
    public int daño;
    public String tipoTrayectoria;
    public int alcanceMax;

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public String getTipoTrayectoria() {
        return tipoTrayectoria;
    }

    public void setTipoTrayectoria(String tipoTrayectoria) {
        this.tipoTrayectoria = tipoTrayectoria;
    }

    public int getAlcanceMax() {
        return alcanceMax;
    }

    public void setAlcanceMax(int alcanceMax) {
        this.alcanceMax = alcanceMax;
    }
    
    
    
    
    
}
