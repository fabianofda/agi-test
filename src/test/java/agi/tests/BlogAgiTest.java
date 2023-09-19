package agi.tests;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import agi.pages.BlogAgiPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BlogAgiTest extends BaseTest {

    @Test
    public void CT001_realizarPesquisaNoBlogAgiComCampoDeBuscaEmBranco() {

        BlogAgiPage blogPage = new BlogAgiPage(driver);

        assertEquals(blogPage.obterTituloPagina(), "Blog do Agi");

        blogPage.searchOpen();
        blogPage.inputSearch("");
        blogPage.inputSearchSubmit();

        assertEquals(blogPage.validarArchiveTitle(), "Resultados da busca por:");
    }

    @Test
    public void CT002_realizarPesquisaNoBlogAgiComCampoDeBuscaComValoresInvalidos() {

        BlogAgiPage blogPage = new BlogAgiPage(driver);

        blogPage.searchOpen();
        blogPage.inputSearch("aaaaaaaaaa");
        blogPage.inputSearchSubmit();

        assertEquals(blogPage.validarEntryTitle(), "Nenhum resultado");
    }

       @Test
    public void CT003_realizarPesquisaNoBlogAgiComCampoDeBuscaEspecifico() {

        BlogAgiPage blogPage = new BlogAgiPage(driver);

        blogPage.searchOpen();
        blogPage.inputSearch("Agibank se prepara para transacionar via Drex");
        blogPage.inputSearchSubmit();

        assertEquals(blogPage.validarArchiveTitle(), "Resultados da busca por: Agibank se prepara para transacionar via Drex");
    }

}
