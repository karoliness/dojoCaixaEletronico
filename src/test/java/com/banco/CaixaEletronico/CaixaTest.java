package com.banco.CaixaEletronico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.banco.Caixa;

import org.junit.jupiter.api.Test;

public class CaixaTest {

    @Test
    public void se_sacar_10_reais_deve_entregar_uma_nota_de_10(){
        Caixa caixa = new Caixa();
        /* notas = Arrays.asList(100,50,20,10); */
        List<Integer> valorEsperado = Arrays.asList(0,0,0,1);
       
        caixa.sacar(10);
        List<Integer> valorDevolvido = caixa.quantidadeDeCedulas;

        assertEquals(valorEsperado, valorDevolvido);
    }

    @Test
    public void se_sacar_20_reais_deve_entregar_uma_nota_de_20(){
        Caixa caixa = new Caixa();
        /** notas = Arrays.asList(100,50,20,10); */
        List<Integer> valorEsperado = Arrays.asList(0,0,1,0);
       
        caixa.sacar(20);
        List<Integer> valorDevolvido = caixa.quantidadeDeCedulas;

        assertEquals(valorEsperado, valorDevolvido);
    }

    @Test
    public void se_sacar_50_reais_deve_entregar_uma_nota_de_50(){
        Caixa caixa = new Caixa();
        /** notas = Arrays.asList(100,50,20,10); */
        List<Integer> valorEsperado = Arrays.asList(0,1,0,0);
       
        caixa.sacar(50);
        List<Integer> valorDevolvido = caixa.quantidadeDeCedulas;

        assertEquals(valorEsperado, valorDevolvido);
    }

    @Test
    public void se_sacar_100_reais_deve_entregar_uma_nota_de_100(){
        Caixa caixa = new Caixa();
        /** notas = Arrays.asList(100,50,20,10); */
        List<Integer> valorEsperado = Arrays.asList(1,0,0,0);
       
        caixa.sacar(100);
        List<Integer> valorDevolvido = caixa.quantidadeDeCedulas;

        assertEquals(valorEsperado, valorDevolvido);
    }

    @Test
    public void se_sacar_80_reais_deve_entregar_uma_nota_de_50_reais_uma_de_20_reais_e_uma_de_10_reais(){
        Caixa caixa = new Caixa();
        /** notas = Arrays.asList(100,50,20,10); */
        List<Integer> valorEsperado = Arrays.asList(0,1,1,1);
       
        caixa.sacar(80);
        List<Integer> valorDevolvido = caixa.quantidadeDeCedulas;

        assertEquals(valorEsperado, valorDevolvido);
    }

    @Test
    public void se_sacar_30_reais_deve_entregar_uma_nota__de_20_reais_e_uma_de_10_reais(){
        Caixa caixa = new Caixa();
        /** notas = Arrays.asList(100,50,20,10); */
        List<Integer> valorEsperado = Arrays.asList(0,0,1,1);
       
        caixa.sacar(30);
        List<Integer> valorDevolvido = caixa.quantidadeDeCedulas;

        assertEquals(valorEsperado, valorDevolvido);
    }



}