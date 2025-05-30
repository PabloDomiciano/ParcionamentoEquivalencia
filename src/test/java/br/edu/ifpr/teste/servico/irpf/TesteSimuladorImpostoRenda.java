package br.edu.ifpr.teste.servico.irpf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import imposto.renda.SimuladorImpostoRenda;

public class TesteSimuladorImpostoRenda {
    @Test
    public void exemploTeste() {
        // Arrange (PREPARAR) - Roy Osherove no livro “The Art of Unit Testing”.
        // Given (DADO) - BDD (Behavior Driven Development)

        // Act (AGIR)
        // When (QUANDO)

        SimuladorImpostoRenda.calcularImposto(0);
        // Assert (VERIFICAR)
        // Then (ENTÃO)
    }

    @Test
    public void salarioIsento() {
        double resultado = SimuladorImpostoRenda.calcularImposto(1000.00);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    public void salarioNaFaixaDe75() {
        double resultado = SimuladorImpostoRenda.calcularImposto(2000.00);
        assertEquals(7.20, resultado, 0.01);
    }

    @Test
    public void salarioNaFaixaDe15() {
        double resultado = SimuladorImpostoRenda.calcularImposto(3000.00);
        assertEquals(95.20, resultado, 0.01);
    }

    @Test
    public void salarioNaFaixaDe225() {
        double resultado = SimuladorImpostoRenda.calcularImposto(4000.00);
        assertEquals(263.87, resultado, 0.01);
    }

    @Test
    public void salarioNaFaixaDe275() {
        double resultado = SimuladorImpostoRenda.calcularImposto(7000.00);
        assertEquals(1055.64, resultado, 0.01);
    }
}
