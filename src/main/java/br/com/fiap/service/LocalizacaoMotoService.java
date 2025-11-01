package br.com.fiap.service;

import br.com.fiap.entity.LocalizacaoMoto;
import br.com.fiap.repository.LocalizacaoMotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalizacaoMotoService {
    @Autowired
    private LocalizacaoMotoRepository repository;

    public LocalizacaoMoto salvar(LocalizacaoMoto localizacaoMoto) {
        return repository.save(localizacaoMoto);
    }

    public List<LocalizacaoMoto> listarTodos() {
        return repository.findAll();
    }

    public LocalizacaoMoto atualizar(Integer id, LocalizacaoMoto localizacaoMotoAtualizada) {
        LocalizacaoMoto existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodLocalizacao(localizacaoMotoAtualizada.getCodLocalizacao());
            existente.setMoto(localizacaoMotoAtualizada.getMoto());
            existente.setFilial(localizacaoMotoAtualizada.getFilial());
            existente.setBoxPosicao(localizacaoMotoAtualizada.getBoxPosicao());
            existente.setStatus(localizacaoMotoAtualizada.getStatus());
            existente.setDataEntrada(localizacaoMotoAtualizada.getDataEntrada());
            existente.setDataSaida(localizacaoMotoAtualizada.getDataSaida());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<LocalizacaoMoto> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
