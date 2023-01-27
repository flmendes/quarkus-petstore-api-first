package io.flmendes.petstore.app;

import io.flmendes.petstore.api.PetApi;
import io.flmendes.petstore.model.ModelApiResponse;
import io.flmendes.petstore.model.Pet;

import javax.enterprise.context.RequestScoped;
import java.io.File;
import java.util.List;

@RequestScoped
public class PetResouce implements PetApi {


    @Override
    public Pet addPet(Pet pet) {
        return null;
    }

    @Override
    public void deletePet(Long petId, String apiKey) {

    }

    @Override
    public List<Pet> findPetsByStatus(String status) {
        return null;
    }

    @Override
    public List<Pet> findPetsByTags(List<String> tags) {
        return null;
    }

    @Override
    public Pet getPetById(Long petId) {
        return null;
    }

    @Override
    public Pet updatePet(Pet pet) {
        return null;
    }

    @Override
    public void updatePetWithForm(Long petId, String name, String status) {

    }

    @Override
    public ModelApiResponse uploadFile(Long petId, String additionalMetadata, File body) {
        return null;
    }
}
