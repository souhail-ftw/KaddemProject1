package tn.ey.dev.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ey.dev.kaddemproject.entities.DetailEquipe;
import tn.ey.dev.kaddemproject.repositories.DetailEquipeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IDetailEquipeServiceImp implements IDetailEquipeServices{
    private DetailEquipeRepository detailEquipeRepository;
    @Override
    public void ajouterDetailEquipe(DetailEquipe de) {
        detailEquipeRepository.save(de);
    }

    @Override
    public void updateDetailEquipe(DetailEquipe de) {
        detailEquipeRepository.save(de);
    }

    @Override
    public List<DetailEquipe> getAllDetailEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe getByIdDetailEquipe(Integer id) {
        return detailEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDetailEquipe(Integer id) {
        detailEquipeRepository.deleteById(id);
    }
}
