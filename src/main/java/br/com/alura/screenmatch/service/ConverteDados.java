package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.DadosSerie;
import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConvertDados {

    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }
}
