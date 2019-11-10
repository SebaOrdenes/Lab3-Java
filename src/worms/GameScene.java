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
public class GameScene {
    public String GameState;
    public String Nivel;
    public int Puntaje;
    public Ally[] ListaAliados;
    public Enemie[] ListaEnemigos;
    public Obstacle[] ListaObstaculos;
    

   
   
    
    
    
    public String getGameState() {
        return GameState;
    }

    public void setGameState(String GameState) {
        this.GameState = GameState;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }

    public Ally[] getListaAliados() {
        return ListaAliados;
    }

    public void setListaAliados(Ally[] ListaAliados) {
        this.ListaAliados = ListaAliados;
    }

    public Enemie[] getListaEnemigos() {
        return ListaEnemigos;
    }

    public void setListaEnemigos(Enemie[] ListaEnemigos) {
        this.ListaEnemigos = ListaEnemigos;
    }

    public Obstacle[] getListaObstaculos() {
        return ListaObstaculos;
    }

    public void setListaObstaculos(Obstacle[] ListaObstaculos) {
        this.ListaObstaculos = ListaObstaculos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
