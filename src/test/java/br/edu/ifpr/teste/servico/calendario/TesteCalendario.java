package br.edu.ifpr.teste.servico.calendario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import paranavai.calendario.Calendario;

public class TesteCalendario {

    @Test
    public void imprimeJaneiro2025() throws IOException {
        // Arrange (PREPARAR) - Roy Osherove no livro “The Art of Unit Testing”.
        // Given (DADO) - BDD (Behavior Driven Development)

        Path path = Paths.get("src\\test\\resources\\calendario", "janeiro2025.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        // Act (AGIR)
        // When (QUANDO)
        Calendario calendario = new Calendario();
        String janeiro2025 = calendario.getCalendario("1", "2025");

        // Assert (VERIFICAR)
        // Then (ENTÃO)
        assertEquals(saidaEsperada, janeiro2025);
    }

    @Test
    public void imprimeMesAtualAnoAtual() throws IOException {
        // Arrange (PREPARAR)
        // Given (DADO)

        Path path = Paths.get("src\\test\\resources\\calendario", "maio2025.txt");
        String saidaEsperada = Files.readString(path).replace("\r\n", "\n");

        // Act (AGIR)
        // When (QUANDO)
        Calendario calendario = new Calendario();
        String resultado = calendario.getCalendario();

        // Assert (VERIFICAR)
        // Then (ENTÃO)
        assertEquals(saidaEsperada, resultado);
    }

    @Test
    public void imprimeAnoCompleto2023() throws IOException {
        // Arrange (PREPARAR)
        // Given (DADO)

        Path path = Paths.get("src\\test\\resources\\calendario", "ano2023.txt");
        String saidaEsperada = Files.readString(path).replace("\r\n", "\n");

        // Act (AGIR)
        // When (QUANDO)
        Calendario calendario = new Calendario();
        String resultado = calendario.getCalendario("2023");

        // Assert (VERIFICAR)
        // Then (ENTÃO)
        assertEquals(saidaEsperada, resultado);
    }

    @Test
    public void anoInvalidoMaiorQue9999() {
        // Arrange (PREPARAR)
        // Given (DADO)

        Calendario calendario = new Calendario();

        // Act (AGIR)
        // When (QUANDO)
        NumberFormatException thrown = org.junit.jupiter.api.Assertions.assertThrows(
                NumberFormatException.class,
                () -> calendario.getCalendario("10000"));

        // Assert (VERIFICAR)
        // Then (ENTÃO)
        assertEquals("getCalendario: 10000: ano invÃ¡lido.", thrown.getMessage());
    }

    @Test
    public void mesInvalidoMaiorQue12() {
        // Arrange (PREPARAR)
        // Given (DADO)

        Calendario calendario = new Calendario();

        // Act (AGIR)
        // When (QUANDO)
        NumberFormatException thrown = org.junit.jupiter.api.Assertions.assertThrows(
                NumberFormatException.class,
                () -> calendario.getCalendario("13", "2025"));

        // Assert (VERIFICAR)
        // Then (ENTÃO)
        assertEquals("getCalendario: 13: mÃªs invÃ¡lido.", thrown.getMessage());
    }

    @Test
    public void ignoraParametrosExcedentes() throws IOException {
        // Arrange (PREPARAR)
        // Given (DADO)

        Path path = Paths.get("src\\test\\resources\\calendario", "marco2024.txt");
        String saidaEsperada = Files.readString(path).replace("\r\n", "\n");

        // Act (AGIR)
        // When (QUANDO)
        Calendario calendario = new Calendario();
        String resultado = calendario.getCalendario("3", "2024", "extra", "inutil");

        // Assert (VERIFICAR)
        // Then (ENTÃO)
        assertEquals(saidaEsperada, resultado);
    }

}
