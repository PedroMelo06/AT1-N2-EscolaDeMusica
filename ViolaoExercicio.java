/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author pedrolucas.melo
 */
public class ViolaoExercicio extends InstrumentosMusicais{
    private int numeroCordas;
    
    public ViolaoExercicio(String nome, String material, int numeroCordas) {
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando notas suaves no " + nome + " com " +  numeroCordas + " cordas ");
        System.out.println("Dedicando uma melodia romantica no violao ");
    }
    
    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Numero de cordas: " + numeroCordas);
    }
    
    public int getNumeroCordas() { return numeroCordas; }
   
}
