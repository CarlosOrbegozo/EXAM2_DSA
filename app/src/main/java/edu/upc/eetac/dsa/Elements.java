package edu.upc.eetac.dsa;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ine",
        "municipi_nom",
        "municipi_nom_curt",
        "municipi_article",
        "municipi_transliterat",
        "municipi_curt_transliterat",
        "centre_municipal",
        "grup_comarca",
        "grup_provincia",
        "grup_ajuntament",
        "municipi_escut",
        "municipi_bandera",
        "municipi_vista",
        "ine6",
        "nom_dbpedia"
})
public class Elements {

    @JsonProperty("ine")
    private String ine;
    @JsonProperty("municipi_nom")
    private String municipiNom;
    @JsonProperty("municipi_nom_curt")
    private String municipiNomCurt;
    @JsonProperty("municipi_article")
    private String municipiArticle;
    @JsonProperty("municipi_transliterat")
    private String municipiTransliterat;
    @JsonProperty("municipi_curt_transliterat")
    private String municipiCurtTransliterat;
    @JsonProperty("centre_municipal")
    private String centreMunicipal;
    @JsonProperty("grup_comarca")
    private GrupComarca grupComarca;
    @JsonProperty("grup_provincia")
    private GrupProvincia grupProvincia;
    @JsonProperty("grup_ajuntament")
    private GrupAjuntament grupAjuntament;
    @JsonProperty("municipi_escut")
    private String municipiEscut;
    @JsonProperty("municipi_bandera")
    private String municipiBandera;
    @JsonProperty("municipi_vista")
    private String municipiVista;
    @JsonProperty("ine6")
    private String ine6;
    @JsonProperty("nom_dbpedia")
    private String nomDbpedia;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ine")
    public String getIne() {
        return ine;
    }

    @JsonProperty("ine")
    public void setIne(String ine) {
        this.ine = ine;
    }

    @JsonProperty("municipi_nom")
    public String getMunicipiNom() {
        return municipiNom;
    }

    @JsonProperty("municipi_nom")
    public void setMunicipiNom(String municipiNom) {
        this.municipiNom = municipiNom;
    }

    @JsonProperty("municipi_nom_curt")
    public String getMunicipiNomCurt() {
        return municipiNomCurt;
    }

    @JsonProperty("municipi_nom_curt")
    public void setMunicipiNomCurt(String municipiNomCurt) {
        this.municipiNomCurt = municipiNomCurt;
    }

    @JsonProperty("municipi_article")
    public String getMunicipiArticle() {
        return municipiArticle;
    }

    @JsonProperty("municipi_article")
    public void setMunicipiArticle(String municipiArticle) {
        this.municipiArticle = municipiArticle;
    }

    @JsonProperty("municipi_transliterat")
    public String getMunicipiTransliterat() {
        return municipiTransliterat;
    }

    @JsonProperty("municipi_transliterat")
    public void setMunicipiTransliterat(String municipiTransliterat) {
        this.municipiTransliterat = municipiTransliterat;
    }

    @JsonProperty("municipi_curt_transliterat")
    public String getMunicipiCurtTransliterat() {
        return municipiCurtTransliterat;
    }

    @JsonProperty("municipi_curt_transliterat")
    public void setMunicipiCurtTransliterat(String municipiCurtTransliterat) {
        this.municipiCurtTransliterat = municipiCurtTransliterat;
    }

    @JsonProperty("centre_municipal")
    public String getCentreMunicipal() {
        return centreMunicipal;
    }

    @JsonProperty("centre_municipal")
    public void setCentreMunicipal(String centreMunicipal) {
        this.centreMunicipal = centreMunicipal;
    }

    @JsonProperty("grup_comarca")
    public GrupComarca getGrupComarca() {
        return grupComarca;
    }

    @JsonProperty("grup_comarca")
    public void setGrupComarca(GrupComarca grupComarca) {
        this.grupComarca = grupComarca;
    }

    @JsonProperty("grup_provincia")
    public GrupProvincia getGrupProvincia() {
        return grupProvincia;
    }

    @JsonProperty("grup_provincia")
    public void setGrupProvincia(GrupProvincia grupProvincia) {
        this.grupProvincia = grupProvincia;
    }

    @JsonProperty("grup_ajuntament")
    public GrupAjuntament getGrupAjuntament() {
        return grupAjuntament;
    }

    @JsonProperty("grup_ajuntament")
    public void setGrupAjuntament(GrupAjuntament grupAjuntament) {
        this.grupAjuntament = grupAjuntament;
    }

    @JsonProperty("municipi_escut")
    public String getMunicipiEscut() {
        return municipiEscut;
    }

    @JsonProperty("municipi_escut")
    public void setMunicipiEscut(String municipiEscut) {
        this.municipiEscut = municipiEscut;
    }

    @JsonProperty("municipi_bandera")
    public String getMunicipiBandera() {
        return municipiBandera;
    }

    @JsonProperty("municipi_bandera")
    public void setMunicipiBandera(String municipiBandera) {
        this.municipiBandera = municipiBandera;
    }

    @JsonProperty("municipi_vista")
    public String getMunicipiVista() {
        return municipiVista;
    }

    @JsonProperty("municipi_vista")
    public void setMunicipiVista(String municipiVista) {
        this.municipiVista = municipiVista;
    }

    @JsonProperty("ine6")
    public String getIne6() {
        return ine6;
    }

    @JsonProperty("ine6")
    public void setIne6(String ine6) {
        this.ine6 = ine6;
    }

    @JsonProperty("nom_dbpedia")
    public String getNomDbpedia() {
        return nomDbpedia;
    }

    @JsonProperty("nom_dbpedia")
    public void setNomDbpedia(String nomDbpedia) {
        this.nomDbpedia = nomDbpedia;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
