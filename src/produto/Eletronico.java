/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;


    
    class Eletronico extends Produto {
        
    private String marca;
    private EnumVoltagem voltagem;

    public Eletronico(int codigo, String nome, double preco, String marca, EnumVoltagem voltagem) {
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public EnumVoltagem getVoltagem() {
        return voltagem;
    }
public void exibirInformacoes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println();
    }
}