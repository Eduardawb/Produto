/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

/**
 *
 * @author Escola
 */
public class Roupa {
    
    private int tamanho ;
    private EnumGenero genero;

    public Roupa(int codigo, String tamanho, double preco) {
        this.tamanho = tamanho;
        this.genero = genero;
    }

    public int getAutor() {
        return tamanho;
    }

    public EnumGenero getGenero() {
        return genero;
    }

     public void exibirInformacoes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("tamanho: " + tamanho);
        System.out.println("Gênero: " + genero);
        System.out.println();
    }


}

