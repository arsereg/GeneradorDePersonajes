/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadordepersonajes.armas;

import aleacion.aleacion;
import incrustacion.Incrustacion;
import java.util.*;

/**
 *
 * @author Gino
 */
public class Arma {
    private int idArma;
    private String nombre;
    private String familia;
    private int elite;
    private boolean lujosa;
    private int uso;
    private char golpe;
    private int tamDado;
    private int cantDados;
    private int activador;
    private int alcance;
    private int nivel;
    private int ddMax;
    private int espacio;
    private aleacion material;
    private ArrayList<Incrustacion> incrustacion;

    /**
     * @return the idArma
     */
    public int getIdArma() {
        return idArma;
    }

    /**
     * @param idArma the idArma to set
     */
    public void setIdArma(int idArma) {
        this.idArma = idArma;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * @return the elite
     */
    public int getElite() {
        return elite;
    }

    /**
     * @param elite the elite to set
     */
    public void setElite(int elite) {
        this.elite = elite;
    }

    /**
     * @return the lujosa
     */
    public boolean isLujosa() {
        return lujosa;
    }

    /**
     * @param lujosa the lujosa to set
     */
    public void setLujosa(boolean lujosa) {
        this.lujosa = lujosa;
    }

    /**
     * @return the uso
     */
    public int getUso() {
        return uso;
    }

    /**
     * @param uso the uso to set
     */
    public void setUso(int uso) {
        this.uso = uso;
    }

    /**
     * @return the golpe
     */
    public char getGolpe() {
        return golpe;
    }

    /**
     * @param golpe the golpe to set
     */
    public void setGolpe(char golpe) {
        this.golpe = golpe;
    }

    /**
     * @return the tamDado
     */
    public int getTamDado() {
        return tamDado;
    }

    /**
     * @param tamDado the tamDado to set
     */
    public void setTamDado(int tamDado) {
        this.tamDado = tamDado;
    }

    /**
     * @return the cantDados
     */
    public int getCantDados() {
        return cantDados;
    }

    /**
     * @param cantDados the cantDados to set
     */
    public void setCantDados(int cantDados) {
        this.cantDados = cantDados;
    }

    /**
     * @return the activador
     */
    public int getActivador() {
        return activador;
    }

    /**
     * @param activador the activador to set
     */
    public void setActivador(int activador) {
        this.activador = activador;
    }

    /**
     * @return the alcance
     */
    public int getAlcance() {
        return alcance;
    }

    /**
     * @param alcance the alcance to set
     */
    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the ddMax
     */
    public int getDdMax() {
        return ddMax;
    }

    /**
     * @param ddMax the ddMax to set
     */
    public void setDdMax(int ddMax) {
        this.ddMax = ddMax;
    }

    /**
     * @return the espacio
     */
    public int getEspacio() {
        return espacio;
    }

    /**
     * @param espacio the espacio to set
     */
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    /**
     * @return the material
     */
    public aleacion getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(aleacion material) {
        this.material = material;
    }

    /**
     * @return the incrustacion
     */
    public ArrayList<Incrustacion> getIncrustacion() {
        return incrustacion;
    }

    /**
     * @param incrustacion the incrustacion to set
     */
    public void setIncrustacion(ArrayList<Incrustacion> incrustacion) {
        this.incrustacion = incrustacion;
    }
    
}
