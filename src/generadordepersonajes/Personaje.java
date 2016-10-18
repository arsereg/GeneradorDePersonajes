/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadordepersonajes;

import escudos.Escudo;
import java.util.*;
import especialidades.especialidades;
import generadordepersonajes.armas.Arma;
import generadordepersonajes.habilidades.Habilidades;
import inmunidades.inmunidades;

/**
 *
 * @author Gino
 */
public class Personaje {
    private String idPersonaje;
    private String jugador;
    private String nombre;
    private Raza raza;
    private char genero;
    private int edad;
    private Clase clase;
    private Alineamiento alineamiento;
    //Datos de calculo
    private int pdMax;
    private int pdActual;
    private int manaActual;
    private int manaMax;
    private int cantidadTurnos;
    private int capacidadDeMovimiento;
    private int nivel;
    private int punteriaBase;
    private int carisma;
    private int constitucion;
    private int destreza;
    private int fuerza;
    private int inteligencia;
    private int magia;
    private int sabiduria;
    private int puntosDeHeroe;
    private int bonificadorIniciativa;
    private Arma arma;
    private Armadura armadura;
    private Escudo escudo;
    //Habilidades
    private Habilidades habilidades;
    private especialidades[] especialidades;
    private ArrayList<inmunidades> inmunidades;
    //Currency
    private int bronce;
    private int plata;
    private int oro;
    private int platino;
    private int girso;
    //Para cuando se sube de nivel
    private int puntosHabilidadNivel;
    private int pdPorNivel;
    private int manaPorNivel;

    /**
     * @return the idPersonaje
     */
    public String getIdPersonaje() {
        return idPersonaje;
    }

    /**
     * @param idPersonaje the idPersonaje to set
     */
    public void setIdPersonaje(String idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    /**
     * @return the jugador
     */
    public String getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(String jugador) {
        this.jugador = jugador;
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
     * @return the raza
     */
    public Raza getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the clase
     */
    public Clase getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(Clase clase) {
        this.clase = clase;
    }

    /**
     * @return the alineamiento
     */
    public Alineamiento getAlineamiento() {
        return alineamiento;
    }

    /**
     * @param alineamiento the alineamiento to set
     */
    public void setAlineamiento(Alineamiento alineamiento) {
        this.alineamiento = alineamiento;
    }

    /**
     * @return the pdMax
     */
    public int getPdMax() {
        return pdMax;
    }

    /**
     * @param pdMax the pdMax to set
     */
    public void setPdMax(int pdMax) {
        this.pdMax = pdMax;
    }

    /**
     * @return the pdActual
     */
    public int getPdActual() {
        return pdActual;
    }

    /**
     * @param pdActual the pdActual to set
     */
    public void setPdActual(int pdActual) {
        this.pdActual = pdActual;
    }

    /**
     * @return the manaActual
     */
    public int getManaActual() {
        return manaActual;
    }

    /**
     * @param manaActual the manaActual to set
     */
    public void setManaActual(int manaActual) {
        this.manaActual = manaActual;
    }

    /**
     * @return the manaMax
     */
    public int getManaMax() {
        return manaMax;
    }

    /**
     * @param manaMax the manaMax to set
     */
    public void setManaMax(int manaMax) {
        this.manaMax = manaMax;
    }

    /**
     * @return the cantidadTurnos
     */
    public int getCantidadTurnos() {
        return cantidadTurnos;
    }

    /**
     * @param cantidadTurnos the cantidadTurnos to set
     */
    public void setCantidadTurnos(int cantidadTurnos) {
        this.cantidadTurnos = cantidadTurnos;
    }

    /**
     * @return the capacidadDeMovimiento
     */
    public int getCapacidadDeMovimiento() {
        return capacidadDeMovimiento;
    }

    /**
     * @param capacidadDeMovimiento the capacidadDeMovimiento to set
     */
    public void setCapacidadDeMovimiento(int capacidadDeMovimiento) {
        this.capacidadDeMovimiento = capacidadDeMovimiento;
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
     * @return the punteriaBase
     */
    public int getPunteriaBase() {
        return punteriaBase;
    }

    /**
     * @param punteriaBase the punteriaBase to set
     */
    public void setPunteriaBase(int punteriaBase) {
        this.punteriaBase = punteriaBase;
    }

    /**
     * @return the carisma
     */
    public int getCarisma() {
        return carisma;
    }

    /**
     * @param carisma the carisma to set
     */
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    /**
     * @return the constitucion
     */
    public int getConstitucion() {
        return constitucion;
    }

    /**
     * @param constitucion the constitucion to set
     */
    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    /**
     * @return the destreza
     */
    public int getDestreza() {
        return destreza;
    }

    /**
     * @param destreza the destreza to set
     */
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    /**
     * @return the fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return the inteligencia
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * @param inteligencia the inteligencia to set
     */
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    /**
     * @return the magia
     */
    public int getMagia() {
        return magia;
    }

    /**
     * @param magia the magia to set
     */
    public void setMagia(int magia) {
        this.magia = magia;
    }

    /**
     * @return the sabiduria
     */
    public int getSabiduria() {
        return sabiduria;
    }

    /**
     * @param sabiduria the sabiduria to set
     */
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    /**
     * @return the puntosDeHeroe
     */
    public int getPuntosDeHeroe() {
        return puntosDeHeroe;
    }

    /**
     * @param puntosDeHeroe the puntosDeHeroe to set
     */
    public void setPuntosDeHeroe(int puntosDeHeroe) {
        this.puntosDeHeroe = puntosDeHeroe;
    }

    /**
     * @return the bonificadorIniciativa
     */
    public int getBonificadorIniciativa() {
        return bonificadorIniciativa;
    }

    /**
     * @param bonificadorIniciativa the bonificadorIniciativa to set
     */
    public void setBonificadorIniciativa(int bonificadorIniciativa) {
        this.bonificadorIniciativa = bonificadorIniciativa;
    }

    /**
     * @return the arma
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    /**
     * @return the armadura
     */
    public Armadura getArmadura() {
        return armadura;
    }

    /**
     * @param armadura the armadura to set
     */
    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    /**
     * @return the escudo
     */
    public Escudo getEscudo() {
        return escudo;
    }

    /**
     * @param escudo the escudo to set
     */
    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    /**
     * @return the habilidades
     */
    public Habilidades getHabilidades() {
        return habilidades;
    }

    /**
     * @param habilidades the habilidades to set
     */
    public void setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }

    /**
     * @return the bronce
     */
    public int getBronce() {
        return bronce;
    }

    /**
     * @param bronce the bronce to set
     */
    public void setBronce(int bronce) {
        this.bronce = bronce;
    }

    /**
     * @return the plata
     */
    public int getPlata() {
        return plata;
    }

    /**
     * @param plata the plata to set
     */
    public void setPlata(int plata) {
        this.plata = plata;
    }

    /**
     * @return the oro
     */
    public int getOro() {
        return oro;
    }

    /**
     * @param oro the oro to set
     */
    public void setOro(int oro) {
        this.oro = oro;
    }

    /**
     * @return the platino
     */
    public int getPlatino() {
        return platino;
    }

    /**
     * @param platino the platino to set
     */
    public void setPlatino(int platino) {
        this.platino = platino;
    }

    /**
     * @return the girso
     */
    public int getGirso() {
        return girso;
    }

    /**
     * @param girso the girso to set
     */
    public void setGirso(int girso) {
        this.girso = girso;
    }
    
    
    //Comienza lógica de negocio
    
    public int Car(){
        int resul = procesarPerfil(this.getCarisma());
        return resul;
    }
    
    public int Con(){
        int resul = procesarPerfil(this.getConstitucion());
        return resul;
    }
    
    public int Dza(){
        int resul = procesarPerfil(this.getDestreza());
        return resul;
    }
    
    public int Fza(){
        int resul = procesarPerfil(this.getFuerza());
        return resul;
    }
    
    public int Int(){
        int resul = procesarPerfil(this.getInteligencia());
        return resul;
    }
    
    public int Mag(){
        int resul = procesarPerfil(this.getMagia());
        return resul;
    }
    
    public int Sab(){
        int resul = procesarPerfil(this.getSabiduria());
        return resul;
    }
    
    private int procesarPerfil(int pperfil){
        int resul = (int) Math.floor(pperfil /2 -5);
        return resul;
    }

    /**
     * @return the especialidades
     */
    public especialidades[] getEspecialidades() {
        return especialidades;
    }

    /**
     * @param especialidades the especialidades to set
     */
    public void setEspecialidades(especialidades[] especialidades) {
        this.especialidades = especialidades;
    }

    /**
     * @return the inmunidades
     */
    public ArrayList<inmunidades> getInmunidades() {
        return inmunidades;
    }

    /**
     * @param inmunidades the inmunidades to set
     */
    public void setInmunidades(ArrayList<inmunidades> inmunidades) {
        this.inmunidades = inmunidades;
    }

    /**
     * @return the puntosHabilidadNivel
     */
    public int getPuntosHabilidadNivel() {
        return puntosHabilidadNivel;
    }

    /**
     * @param puntosHabilidadNivel the puntosHabilidadNivel to set
     */
    public void setPuntosHabilidadNivel(int puntosHabilidadNivel) {
        this.puntosHabilidadNivel = puntosHabilidadNivel;
    }

    /**
     * @return the pdPorNivel
     */
    public int getPdPorNivel() {
        return pdPorNivel;
    }

    /**
     * @param pdPorNivel the pdPorNivel to set
     */
    public void setPdPorNivel(int pdPorNivel) {
        this.pdPorNivel = pdPorNivel;
    }

    /**
     * @return the manaPorNivel
     */
    public int getManaPorNivel() {
        return manaPorNivel;
    }

    /**
     * @param manaPorNivel the manaPorNivel to set
     */
    public void setManaPorNivel(int manaPorNivel) {
        this.manaPorNivel = manaPorNivel;
    }
    
}
