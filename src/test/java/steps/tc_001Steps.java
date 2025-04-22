package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    @Given("que el usuario está en la página de carga de documentos")
    public void que_el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        // Initialize WebDriver and Page
        driver = // Initialize your WebDriver here
        page = PageFactory.initElements(driver, tc_001Page.class);
        driver.get("URL_DE_LA_PAGINA_DE_CARGA_DE_DOCUMENTOS");
    }

    @When("el usuario selecciona la opción 'cargar documentos'")
    public void el_usuario_selecciona_la_opcion_cargar_documentos() {
        page.selectUploadDocumentsOption();
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opcion_para_carga_unica_y_carga_multiple() {
        Assert.assertTrue(page.isSingleUploadOptionDisplayed());
        Assert.assertTrue(page.isMultipleUploadOptionDisplayed());
    }

    @When("el usuario elige 'carga en un solo archivo'")
    public void el_usuario_elige_carga_en_un_solo_archivo() {
        page.selectSingleFileUpload();
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_unico_recuadro_para_subir_el_archivo() {
        Assert.assertTrue(page.isSingleUploadBoxEnabled());
    }

    @When("el usuario elige 'cargar documentos por separado'")
    public void el_usuario_elige_cargar_documentos_por_separado() {
        page.selectMultipleFileUpload();
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_multiples_recuadros_correspondientes_a_cada_documento_requerido() {
        Assert.assertTrue(page.areMultipleUploadBoxesDisplayed());
    }    
}