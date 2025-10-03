/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author pedrolucas.melo
 */
public class BateriaExercicio extends InstrumentosMusicais {
    private int numeroPecas;
    
    public BateriaExercicio(String nome, String material, int numeroPecas) {
        super(nome, material);
    }
    
    @Override
    public void tocar() {
        System.out.println("Marcando o ritmo na " + nome + " com " + this.getNumeroPecas() + "pecas");
        System.out.println("Boom! Tss! Boom! Tss! ");
    }
    
    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensao das peles dos tambores ");
    }
    
    @Override
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Numero de pecas: " + numeroPecas);
    }
    
    public int getNumeroPecas() {
        return numeroPecas;
    }
}
