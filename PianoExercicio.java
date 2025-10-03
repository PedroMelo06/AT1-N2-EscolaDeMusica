/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author pedrolucas.melo
 */
public class PianoExercicio extends InstrumentosMusicais {
    private int numeroTeclas;
    
    public PianoExercicio(String nome, String material, int numeroTeclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }
    
    @Override
    public void tocar() {
        System.out.println("Soando uma melodia no " + nome + " com " + numeroTeclas + " teclas...");
        System.out.println("Executando uma sonata classica ");
    }
    
    @Override
    public void afinar() {
    super.afinar();
    System.out.println("Ajustando a tensao das cordas internas do piano.");
}
    
    @Override
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Numero de teclas: " + numeroTeclas);
    }
    
    public int getNumeroTeclas() {
        return numeroTeclas;
    }
}
