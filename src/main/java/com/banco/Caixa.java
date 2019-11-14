package com.banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caixa {

    private List<Integer> notas = new ArrayList<>();
    public List<Integer> quantidadeDeCedulas = new ArrayList<>();

    public Caixa() {
        notas = Arrays.asList(100,50,20,10);
        quantidadeDeCedulas = Arrays.asList(0,0,0,0);
    }

	public void sacar(Integer quantiaQueQueroSacar) {
        int tamanhodalista = notas.size();
        for(int i = 0; i < tamanhodalista; i++){
            Integer qualNotaPeguei = notas.get(i);
            if(quantiaQueQueroSacar >= qualNotaPeguei){
                quantiaQueQueroSacar -= qualNotaPeguei;
                quantidadeDeCedulas.set(i, quantidadeDeCedulas.get(i) + 1);
            }
        }
	}
    
}