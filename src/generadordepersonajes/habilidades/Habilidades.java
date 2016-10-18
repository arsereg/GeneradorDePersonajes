/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadordepersonajes.habilidades;

import generadordepersonajes.Personaje;

/**
 *
 * @author Gino
 */
public class Habilidades {
    private Personaje miPersonaje;
    //Se hacen verificaciones de si el personaje tiene esa habilidad entrenada
    private boolean acrobaciasEntrenada;
    private boolean actuacion1Entrenada;
    private boolean actuacion2Entrenada;
    private boolean artimaniasEntrenada;
    private boolean arte1Entrenada;
    private boolean arte2Entrenada;
    private boolean averiguarIntencionEntrenada;
    private boolean cabalgarEntrenada;
    private boolean comercioEntrenada;
    private boolean concentracionEntrenada;
    private boolean conocimientoCalabozosEntrenada;
    private boolean conocimentoCombateEntrenada;
    private boolean conocimientoGeografiaEntrenada;
    private boolean conocimientoHistoriaEntrenada;
    private boolean conocimientoIngenieriaEntrenada;
    private boolean conocimientoMagiaEntrenada;
    private boolean conocimientoNaturalezaEntrenada;
    private boolean conocimientoPlanosAstralesEntrenada;
    private boolean conocimientoReligionEntrenada;
    private boolean desactivarDispositivosEntrenada;
    private boolean diplomaciaEntrenada;
    private boolean escalarEntrenada;
    private boolean escaparEntrenada;
    private boolean intimidarEntrenada;
    private boolean manejarAnimalEntrenada;
    private boolean mentirEntrenada;
    private boolean nadarEntrenada;
    private boolean percepcionEntrenada;
    private boolean primerosAuxiliosEntrenada;
    private boolean profesionEntrenada1;
    private boolean profesion2Entrenada;
    private boolean sigiloEntrenada;
    private boolean sobrevivenciaEntrenada;
    private boolean usarArtefactosMagicosEntrenada;
    private boolean usarArtefactosMecanicosEntrenada;
    private boolean volarEntrenada;


    private int[] acrobacias;
    private int[] actuacion1;
    private int[] actuacion2;
    private int[] artimanias;
    private int[] arte1;
    private int[] arte2;
    private int[] averiguarIntencion;
    private int[] cabalgar;
    private int[] comercio;
    private int[] concentracion;
    private int[] conocimientoCalabozos;
    private int[] conocimentoCombate;
    private int[] conocimientoGeografia;
    private int[] conocimientoHistoria;
    private int[] conocimientoIngenieria;
    private int[] conocimientoMagia;
    private int[] conocimientoNaturaleza;
    private int[] conocimientoPlanosAstrales;
    private int[] conocimientoReligion;
    private int[] desactivarDispositivos;
    private int[] diplomacia;
    private int[] escalar;
    private int[] escapar;
    private int[] intimidar;
    private int[] manejarAnimal;
    private int[] mentir;
    private int[] nadar;
    private int[] percepcion;
    private int[] primerosAuxilios;
    private int[] profesion1;
    private int[] profesion2;
    private int[] sigilo;
    private int[] sobrevivencia;
    private int[] usarArtefactosMagicos;
    private int[] usarArtefactosMecanicos;
    private int[] volar;

    /**
     * @return the miPersonaje
     */
    public Personaje getMiPersonaje() {
        return miPersonaje;
    }

    /**
     * @param miPersonaje the miPersonaje to set
     */
    public void setMiPersonaje(Personaje miPersonaje) {
        this.miPersonaje = miPersonaje;
    }

    /**
     * @return the acrobaciasEntrenada
     */
    public boolean isAcrobaciasEntrenada() {
        return acrobaciasEntrenada;
    }

    /**
     * @param acrobaciasEntrenada the acrobaciasEntrenada to set
     */
    public void setAcrobaciasEntrenada(boolean acrobaciasEntrenada) {
        this.acrobaciasEntrenada = acrobaciasEntrenada;
    }

    /**
     * @return the actuacion1Entrenada
     */
    public boolean isActuacion1Entrenada() {
        return actuacion1Entrenada;
    }

    /**
     * @param actuacion1Entrenada the actuacion1Entrenada to set
     */
    public void setActuacion1Entrenada(boolean actuacion1Entrenada) {
        this.actuacion1Entrenada = actuacion1Entrenada;
    }

    /**
     * @return the actuacion2Entrenada
     */
    public boolean isActuacion2Entrenada() {
        return actuacion2Entrenada;
    }

    /**
     * @param actuacion2Entrenada the actuacion2Entrenada to set
     */
    public void setActuacion2Entrenada(boolean actuacion2Entrenada) {
        this.actuacion2Entrenada = actuacion2Entrenada;
    }

    /**
     * @return the artimaniasEntrenada
     */
    public boolean isArtimaniasEntrenada() {
        return artimaniasEntrenada;
    }

    /**
     * @param artimaniasEntrenada the artimaniasEntrenada to set
     */
    public void setArtimaniasEntrenada(boolean artimaniasEntrenada) {
        this.artimaniasEntrenada = artimaniasEntrenada;
    }

    /**
     * @return the arte1Entrenada
     */
    public boolean isArte1Entrenada() {
        return arte1Entrenada;
    }

    /**
     * @param arte1Entrenada the arte1Entrenada to set
     */
    public void setArte1Entrenada(boolean arte1Entrenada) {
        this.arte1Entrenada = arte1Entrenada;
    }

    /**
     * @return the arte2Entrenada
     */
    public boolean isArte2Entrenada() {
        return arte2Entrenada;
    }

    /**
     * @param arte2Entrenada the arte2Entrenada to set
     */
    public void setArte2Entrenada(boolean arte2Entrenada) {
        this.arte2Entrenada = arte2Entrenada;
    }

    /**
     * @return the averiguarIntencionEntrenada
     */
    public boolean isAveriguarIntencionEntrenada() {
        return averiguarIntencionEntrenada;
    }

    /**
     * @param averiguarIntencionEntrenada the averiguarIntencionEntrenada to set
     */
    public void setAveriguarIntencionEntrenada(boolean averiguarIntencionEntrenada) {
        this.averiguarIntencionEntrenada = averiguarIntencionEntrenada;
    }

    /**
     * @return the cabalgarEntrenada
     */
    public boolean isCabalgarEntrenada() {
        return cabalgarEntrenada;
    }

    /**
     * @param cabalgarEntrenada the cabalgarEntrenada to set
     */
    public void setCabalgarEntrenada(boolean cabalgarEntrenada) {
        this.cabalgarEntrenada = cabalgarEntrenada;
    }

    /**
     * @return the comercioEntrenada
     */
    public boolean isComercioEntrenada() {
        return comercioEntrenada;
    }

    /**
     * @param comercioEntrenada the comercioEntrenada to set
     */
    public void setComercioEntrenada(boolean comercioEntrenada) {
        this.comercioEntrenada = comercioEntrenada;
    }

    /**
     * @return the concentracionEntrenada
     */
    public boolean isConcentracionEntrenada() {
        return concentracionEntrenada;
    }

    /**
     * @param concentracionEntrenada the concentracionEntrenada to set
     */
    public void setConcentracionEntrenada(boolean concentracionEntrenada) {
        this.concentracionEntrenada = concentracionEntrenada;
    }

    /**
     * @return the conocimientoCalabozosEntrenada
     */
    public boolean isConocimientoCalabozosEntrenada() {
        return conocimientoCalabozosEntrenada;
    }

    /**
     * @param conocimientoCalabozosEntrenada the conocimientoCalabozosEntrenada to set
     */
    public void setConocimientoCalabozosEntrenada(boolean conocimientoCalabozosEntrenada) {
        this.conocimientoCalabozosEntrenada = conocimientoCalabozosEntrenada;
    }

    /**
     * @return the conocimentoCombateEntrenada
     */
    public boolean isConocimentoCombateEntrenada() {
        return conocimentoCombateEntrenada;
    }

    /**
     * @param conocimentoCombateEntrenada the conocimentoCombateEntrenada to set
     */
    public void setConocimentoCombateEntrenada(boolean conocimentoCombateEntrenada) {
        this.conocimentoCombateEntrenada = conocimentoCombateEntrenada;
    }

    /**
     * @return the conocimientoGeografiaEntrenada
     */
    public boolean isConocimientoGeografiaEntrenada() {
        return conocimientoGeografiaEntrenada;
    }

    /**
     * @param conocimientoGeografiaEntrenada the conocimientoGeografiaEntrenada to set
     */
    public void setConocimientoGeografiaEntrenada(boolean conocimientoGeografiaEntrenada) {
        this.conocimientoGeografiaEntrenada = conocimientoGeografiaEntrenada;
    }

    /**
     * @return the conocimientoHistoriaEntrenada
     */
    public boolean isConocimientoHistoriaEntrenada() {
        return conocimientoHistoriaEntrenada;
    }

    /**
     * @param conocimientoHistoriaEntrenada the conocimientoHistoriaEntrenada to set
     */
    public void setConocimientoHistoriaEntrenada(boolean conocimientoHistoriaEntrenada) {
        this.conocimientoHistoriaEntrenada = conocimientoHistoriaEntrenada;
    }

    /**
     * @return the conocimientoIngenieriaEntrenada
     */
    public boolean isConocimientoIngenieriaEntrenada() {
        return conocimientoIngenieriaEntrenada;
    }

    /**
     * @param conocimientoIngenieriaEntrenada the conocimientoIngenieriaEntrenada to set
     */
    public void setConocimientoIngenieriaEntrenada(boolean conocimientoIngenieriaEntrenada) {
        this.conocimientoIngenieriaEntrenada = conocimientoIngenieriaEntrenada;
    }

    /**
     * @return the conocimientoMagiaEntrenada
     */
    public boolean isConocimientoMagiaEntrenada() {
        return conocimientoMagiaEntrenada;
    }

    /**
     * @param conocimientoMagiaEntrenada the conocimientoMagiaEntrenada to set
     */
    public void setConocimientoMagiaEntrenada(boolean conocimientoMagiaEntrenada) {
        this.conocimientoMagiaEntrenada = conocimientoMagiaEntrenada;
    }

    /**
     * @return the conocimientoNaturalezaEntrenada
     */
    public boolean isConocimientoNaturalezaEntrenada() {
        return conocimientoNaturalezaEntrenada;
    }

    /**
     * @param conocimientoNaturalezaEntrenada the conocimientoNaturalezaEntrenada to set
     */
    public void setConocimientoNaturalezaEntrenada(boolean conocimientoNaturalezaEntrenada) {
        this.conocimientoNaturalezaEntrenada = conocimientoNaturalezaEntrenada;
    }

    /**
     * @return the conocimientoPlanosAstralesEntrenada
     */
    public boolean isConocimientoPlanosAstralesEntrenada() {
        return conocimientoPlanosAstralesEntrenada;
    }

    /**
     * @param conocimientoPlanosAstralesEntrenada the conocimientoPlanosAstralesEntrenada to set
     */
    public void setConocimientoPlanosAstralesEntrenada(boolean conocimientoPlanosAstralesEntrenada) {
        this.conocimientoPlanosAstralesEntrenada = conocimientoPlanosAstralesEntrenada;
    }

    /**
     * @return the conocimientoReligionEntrenada
     */
    public boolean isConocimientoReligionEntrenada() {
        return conocimientoReligionEntrenada;
    }

    /**
     * @param conocimientoReligionEntrenada the conocimientoReligionEntrenada to set
     */
    public void setConocimientoReligionEntrenada(boolean conocimientoReligionEntrenada) {
        this.conocimientoReligionEntrenada = conocimientoReligionEntrenada;
    }

    /**
     * @return the desactivarDispositivosEntrenada
     */
    public boolean isDesactivarDispositivosEntrenada() {
        return desactivarDispositivosEntrenada;
    }

    /**
     * @param desactivarDispositivosEntrenada the desactivarDispositivosEntrenada to set
     */
    public void setDesactivarDispositivosEntrenada(boolean desactivarDispositivosEntrenada) {
        this.desactivarDispositivosEntrenada = desactivarDispositivosEntrenada;
    }

    /**
     * @return the diplomaciaEntrenada
     */
    public boolean isDiplomaciaEntrenada() {
        return diplomaciaEntrenada;
    }

    /**
     * @param diplomaciaEntrenada the diplomaciaEntrenada to set
     */
    public void setDiplomaciaEntrenada(boolean diplomaciaEntrenada) {
        this.diplomaciaEntrenada = diplomaciaEntrenada;
    }

    /**
     * @return the escalarEntrenada
     */
    public boolean isEscalarEntrenada() {
        return escalarEntrenada;
    }

    /**
     * @param escalarEntrenada the escalarEntrenada to set
     */
    public void setEscalarEntrenada(boolean escalarEntrenada) {
        this.escalarEntrenada = escalarEntrenada;
    }

    /**
     * @return the escaparEntrenada
     */
    public boolean isEscaparEntrenada() {
        return escaparEntrenada;
    }

    /**
     * @param escaparEntrenada the escaparEntrenada to set
     */
    public void setEscaparEntrenada(boolean escaparEntrenada) {
        this.escaparEntrenada = escaparEntrenada;
    }

    /**
     * @return the intimidarEntrenada
     */
    public boolean isIntimidarEntrenada() {
        return intimidarEntrenada;
    }

    /**
     * @param intimidarEntrenada the intimidarEntrenada to set
     */
    public void setIntimidarEntrenada(boolean intimidarEntrenada) {
        this.intimidarEntrenada = intimidarEntrenada;
    }

    /**
     * @return the manejarAnimalEntrenada
     */
    public boolean isManejarAnimalEntrenada() {
        return manejarAnimalEntrenada;
    }

    /**
     * @param manejarAnimalEntrenada the manejarAnimalEntrenada to set
     */
    public void setManejarAnimalEntrenada(boolean manejarAnimalEntrenada) {
        this.manejarAnimalEntrenada = manejarAnimalEntrenada;
    }

    /**
     * @return the mentirEntrenada
     */
    public boolean isMentirEntrenada() {
        return mentirEntrenada;
    }

    /**
     * @param mentirEntrenada the mentirEntrenada to set
     */
    public void setMentirEntrenada(boolean mentirEntrenada) {
        this.mentirEntrenada = mentirEntrenada;
    }

    /**
     * @return the nadarEntrenada
     */
    public boolean isNadarEntrenada() {
        return nadarEntrenada;
    }

    /**
     * @param nadarEntrenada the nadarEntrenada to set
     */
    public void setNadarEntrenada(boolean nadarEntrenada) {
        this.nadarEntrenada = nadarEntrenada;
    }

    /**
     * @return the percepcionEntrenada
     */
    public boolean isPercepcionEntrenada() {
        return percepcionEntrenada;
    }

    /**
     * @param percepcionEntrenada the percepcionEntrenada to set
     */
    public void setPercepcionEntrenada(boolean percepcionEntrenada) {
        this.percepcionEntrenada = percepcionEntrenada;
    }

    /**
     * @return the primerosAuxiliosEntrenada
     */
    public boolean isPrimerosAuxiliosEntrenada() {
        return primerosAuxiliosEntrenada;
    }

    /**
     * @param primerosAuxiliosEntrenada the primerosAuxiliosEntrenada to set
     */
    public void setPrimerosAuxiliosEntrenada(boolean primerosAuxiliosEntrenada) {
        this.primerosAuxiliosEntrenada = primerosAuxiliosEntrenada;
    }

    /**
     * @return the profesionEntrenada1
     */
    public boolean isProfesionEntrenada1() {
        return profesionEntrenada1;
    }

    /**
     * @param profesionEntrenada1 the profesionEntrenada1 to set
     */
    public void setProfesionEntrenada1(boolean profesionEntrenada1) {
        this.profesionEntrenada1 = profesionEntrenada1;
    }

    /**
     * @return the profesion2Entrenada
     */
    public boolean isProfesion2Entrenada() {
        return profesion2Entrenada;
    }

    /**
     * @param profesion2Entrenada the profesion2Entrenada to set
     */
    public void setProfesion2Entrenada(boolean profesion2Entrenada) {
        this.profesion2Entrenada = profesion2Entrenada;
    }

    /**
     * @return the sigiloEntrenada
     */
    public boolean isSigiloEntrenada() {
        return sigiloEntrenada;
    }

    /**
     * @param sigiloEntrenada the sigiloEntrenada to set
     */
    public void setSigiloEntrenada(boolean sigiloEntrenada) {
        this.sigiloEntrenada = sigiloEntrenada;
    }

    /**
     * @return the sobrevivenciaEntrenada
     */
    public boolean isSobrevivenciaEntrenada() {
        return sobrevivenciaEntrenada;
    }

    /**
     * @param sobrevivenciaEntrenada the sobrevivenciaEntrenada to set
     */
    public void setSobrevivenciaEntrenada(boolean sobrevivenciaEntrenada) {
        this.sobrevivenciaEntrenada = sobrevivenciaEntrenada;
    }

    /**
     * @return the usarArtefactosMagicosEntrenada
     */
    public boolean isUsarArtefactosMagicosEntrenada() {
        return usarArtefactosMagicosEntrenada;
    }

    /**
     * @param usarArtefactosMagicosEntrenada the usarArtefactosMagicosEntrenada to set
     */
    public void setUsarArtefactosMagicosEntrenada(boolean usarArtefactosMagicosEntrenada) {
        this.usarArtefactosMagicosEntrenada = usarArtefactosMagicosEntrenada;
    }

    /**
     * @return the usarArtefactosMecanicosEntrenada
     */
    public boolean isUsarArtefactosMecanicosEntrenada() {
        return usarArtefactosMecanicosEntrenada;
    }

    /**
     * @param usarArtefactosMecanicosEntrenada the usarArtefactosMecanicosEntrenada to set
     */
    public void setUsarArtefactosMecanicosEntrenada(boolean usarArtefactosMecanicosEntrenada) {
        this.usarArtefactosMecanicosEntrenada = usarArtefactosMecanicosEntrenada;
    }

    /**
     * @return the volarEntrenada
     */
    public boolean isVolarEntrenada() {
        return volarEntrenada;
    }

    /**
     * @param volarEntrenada the volarEntrenada to set
     */
    public void setVolarEntrenada(boolean volarEntrenada) {
        this.volarEntrenada = volarEntrenada;
    }

    /**
     * @return the acrobacias
     */
    public int[] getAcrobacias() {
        return acrobacias;
    }

    /**
     * @param acrobacias the acrobacias to set
     */
    public void setAcrobacias(int[] acrobacias) {
        this.acrobacias = acrobacias;
    }

    /**
     * @return the actuacion1
     */
    public int[] getActuacion1() {
        return actuacion1;
    }

    /**
     * @param actuacion1 the actuacion1 to set
     */
    public void setActuacion1(int[] actuacion1) {
        this.actuacion1 = actuacion1;
    }

    /**
     * @return the actuacion2
     */
    public int[] getActuacion2() {
        return actuacion2;
    }

    /**
     * @param actuacion2 the actuacion2 to set
     */
    public void setActuacion2(int[] actuacion2) {
        this.actuacion2 = actuacion2;
    }

    /**
     * @return the artimanias
     */
    public int[] getArtimanias() {
        return artimanias;
    }

    /**
     * @param artimanias the artimanias to set
     */
    public void setArtimanias(int[] artimanias) {
        this.artimanias = artimanias;
    }

    /**
     * @return the arte1
     */
    public int[] getArte1() {
        return arte1;
    }

    /**
     * @param arte1 the arte1 to set
     */
    public void setArte1(int[] arte1) {
        this.arte1 = arte1;
    }

    /**
     * @return the arte2
     */
    public int[] getArte2() {
        return arte2;
    }

    /**
     * @param arte2 the arte2 to set
     */
    public void setArte2(int[] arte2) {
        this.arte2 = arte2;
    }

    /**
     * @return the averiguarIntencion
     */
    public int[] getAveriguarIntencion() {
        return averiguarIntencion;
    }

    /**
     * @param averiguarIntencion the averiguarIntencion to set
     */
    public void setAveriguarIntencion(int[] averiguarIntencion) {
        this.averiguarIntencion = averiguarIntencion;
    }

    /**
     * @return the cabalgar
     */
    public int[] getCabalgar() {
        return cabalgar;
    }

    /**
     * @param cabalgar the cabalgar to set
     */
    public void setCabalgar(int[] cabalgar) {
        this.cabalgar = cabalgar;
    }

    /**
     * @return the comercio
     */
    public int[] getComercio() {
        return comercio;
    }

    /**
     * @param comercio the comercio to set
     */
    public void setComercio(int[] comercio) {
        this.comercio = comercio;
    }

    /**
     * @return the concentracion
     */
    public int[] getConcentracion() {
        return concentracion;
    }

    /**
     * @param concentracion the concentracion to set
     */
    public void setConcentracion(int[] concentracion) {
        this.concentracion = concentracion;
    }

    /**
     * @return the conocimientoCalabozos
     */
    public int[] getConocimientoCalabozos() {
        return conocimientoCalabozos;
    }

    /**
     * @param conocimientoCalabozos the conocimientoCalabozos to set
     */
    public void setConocimientoCalabozos(int[] conocimientoCalabozos) {
        this.conocimientoCalabozos = conocimientoCalabozos;
    }

    /**
     * @return the conocimentoCombate
     */
    public int[] getConocimentoCombate() {
        return conocimentoCombate;
    }

    /**
     * @param conocimentoCombate the conocimentoCombate to set
     */
    public void setConocimentoCombate(int[] conocimentoCombate) {
        this.conocimentoCombate = conocimentoCombate;
    }

    /**
     * @return the conocimientoGeografia
     */
    public int[] getConocimientoGeografia() {
        return conocimientoGeografia;
    }

    /**
     * @param conocimientoGeografia the conocimientoGeografia to set
     */
    public void setConocimientoGeografia(int[] conocimientoGeografia) {
        this.conocimientoGeografia = conocimientoGeografia;
    }

    /**
     * @return the conocimientoHistoria
     */
    public int[] getConocimientoHistoria() {
        return conocimientoHistoria;
    }

    /**
     * @param conocimientoHistoria the conocimientoHistoria to set
     */
    public void setConocimientoHistoria(int[] conocimientoHistoria) {
        this.conocimientoHistoria = conocimientoHistoria;
    }

    /**
     * @return the conocimientoIngenieria
     */
    public int[] getConocimientoIngenieria() {
        return conocimientoIngenieria;
    }

    /**
     * @param conocimientoIngenieria the conocimientoIngenieria to set
     */
    public void setConocimientoIngenieria(int[] conocimientoIngenieria) {
        this.conocimientoIngenieria = conocimientoIngenieria;
    }

    /**
     * @return the conocimientoMagia
     */
    public int[] getConocimientoMagia() {
        return conocimientoMagia;
    }

    /**
     * @param conocimientoMagia the conocimientoMagia to set
     */
    public void setConocimientoMagia(int[] conocimientoMagia) {
        this.conocimientoMagia = conocimientoMagia;
    }

    /**
     * @return the conocimientoNaturaleza
     */
    public int[] getConocimientoNaturaleza() {
        return conocimientoNaturaleza;
    }

    /**
     * @param conocimientoNaturaleza the conocimientoNaturaleza to set
     */
    public void setConocimientoNaturaleza(int[] conocimientoNaturaleza) {
        this.conocimientoNaturaleza = conocimientoNaturaleza;
    }

    /**
     * @return the conocimientoPlanosAstrales
     */
    public int[] getConocimientoPlanosAstrales() {
        return conocimientoPlanosAstrales;
    }

    /**
     * @param conocimientoPlanosAstrales the conocimientoPlanosAstrales to set
     */
    public void setConocimientoPlanosAstrales(int[] conocimientoPlanosAstrales) {
        this.conocimientoPlanosAstrales = conocimientoPlanosAstrales;
    }

    /**
     * @return the conocimientoReligion
     */
    public int[] getConocimientoReligion() {
        return conocimientoReligion;
    }

    /**
     * @param conocimientoReligion the conocimientoReligion to set
     */
    public void setConocimientoReligion(int[] conocimientoReligion) {
        this.conocimientoReligion = conocimientoReligion;
    }

    /**
     * @return the desactivarDispositivos
     */
    public int[] getDesactivarDispositivos() {
        return desactivarDispositivos;
    }

    /**
     * @param desactivarDispositivos the desactivarDispositivos to set
     */
    public void setDesactivarDispositivos(int[] desactivarDispositivos) {
        this.desactivarDispositivos = desactivarDispositivos;
    }

    /**
     * @return the diplomacia
     */
    public int[] getDiplomacia() {
        return diplomacia;
    }

    /**
     * @param diplomacia the diplomacia to set
     */
    public void setDiplomacia(int[] diplomacia) {
        this.diplomacia = diplomacia;
    }

    /**
     * @return the escalar
     */
    public int[] getEscalar() {
        return escalar;
    }

    /**
     * @param escalar the escalar to set
     */
    public void setEscalar(int[] escalar) {
        this.escalar = escalar;
    }

    /**
     * @return the escapar
     */
    public int[] getEscapar() {
        return escapar;
    }

    /**
     * @param escapar the escapar to set
     */
    public void setEscapar(int[] escapar) {
        this.escapar = escapar;
    }

    /**
     * @return the intimidar
     */
    public int[] getIntimidar() {
        return intimidar;
    }

    /**
     * @param intimidar the intimidar to set
     */
    public void setIntimidar(int[] intimidar) {
        this.intimidar = intimidar;
    }

    /**
     * @return the manejarAnimal
     */
    public int[] getManejarAnimal() {
        return manejarAnimal;
    }

    /**
     * @param manejarAnimal the manejarAnimal to set
     */
    public void setManejarAnimal(int[] manejarAnimal) {
        this.manejarAnimal = manejarAnimal;
    }

    /**
     * @return the mentir
     */
    public int[] getMentir() {
        return mentir;
    }

    /**
     * @param mentir the mentir to set
     */
    public void setMentir(int[] mentir) {
        this.mentir = mentir;
    }

    /**
     * @return the nadar
     */
    public int[] getNadar() {
        return nadar;
    }

    /**
     * @param nadar the nadar to set
     */
    public void setNadar(int[] nadar) {
        this.nadar = nadar;
    }

    /**
     * @return the percepcion
     */
    public int[] getPercepcion() {
        return percepcion;
    }

    /**
     * @param percepcion the percepcion to set
     */
    public void setPercepcion(int[] percepcion) {
        this.percepcion = percepcion;
    }

    /**
     * @return the primerosAuxilios
     */
    public int[] getPrimerosAuxilios() {
        return primerosAuxilios;
    }

    /**
     * @param primerosAuxilios the primerosAuxilios to set
     */
    public void setPrimerosAuxilios(int[] primerosAuxilios) {
        this.primerosAuxilios = primerosAuxilios;
    }

    /**
     * @return the profesion1
     */
    public int[] getProfesion1() {
        return profesion1;
    }

    /**
     * @param profesion1 the profesion1 to set
     */
    public void setProfesion1(int[] profesion1) {
        this.profesion1 = profesion1;
    }

    /**
     * @return the profesion2
     */
    public int[] getProfesion2() {
        return profesion2;
    }

    /**
     * @param profesion2 the profesion2 to set
     */
    public void setProfesion2(int[] profesion2) {
        this.profesion2 = profesion2;
    }

    /**
     * @return the sigilo
     */
    public int[] getSigilo() {
        return sigilo;
    }

    /**
     * @param sigilo the sigilo to set
     */
    public void setSigilo(int[] sigilo) {
        this.sigilo = sigilo;
    }

    /**
     * @return the sobrevivencia
     */
    public int[] getSobrevivencia() {
        return sobrevivencia;
    }

    /**
     * @param sobrevivencia the sobrevivencia to set
     */
    public void setSobrevivencia(int[] sobrevivencia) {
        this.sobrevivencia = sobrevivencia;
    }

    /**
     * @return the usarArtefactosMagicos
     */
    public int[] getUsarArtefactosMagicos() {
        return usarArtefactosMagicos;
    }

    /**
     * @param usarArtefactosMagicos the usarArtefactosMagicos to set
     */
    public void setUsarArtefactosMagicos(int[] usarArtefactosMagicos) {
        this.usarArtefactosMagicos = usarArtefactosMagicos;
    }

    /**
     * @return the usarArtefactosMecanicos
     */
    public int[] getUsarArtefactosMecanicos() {
        return usarArtefactosMecanicos;
    }

    /**
     * @param usarArtefactosMecanicos the usarArtefactosMecanicos to set
     */
    public void setUsarArtefactosMecanicos(int[] usarArtefactosMecanicos) {
        this.usarArtefactosMecanicos = usarArtefactosMecanicos;
    }

    /**
     * @return the volar
     */
    public int[] getVolar() {
        return volar;
    }

    /**
     * @param volar the volar to set
     */
    public void setVolar(int[] volar) {
        this.volar = volar;
    }
    
}
