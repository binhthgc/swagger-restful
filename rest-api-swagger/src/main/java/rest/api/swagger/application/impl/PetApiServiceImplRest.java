package rest.api.swagger.application.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataHandler;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import io.swagger.api.PetApi;
import io.swagger.model.Pet;
import io.swagger.model.PetArray;
import io.swagger.model.Tag;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2018-04-04T16:46:10.006+07:00")
public class PetApiServiceImplRest implements PetApi {

	@Override
	public Pet getPetById(Long petId) {
		System.out.println("PetApiServiceImplRest.getPetById()" + petId);
		Pet pet = new Pet();
		List<Tag> listTags = new ArrayList<>();
		Tag tag = new Tag();
		tag.setName("tag1");
		tag.setId(Long.valueOf(1));
		listTags.add(tag);
		pet.setId(Long.valueOf(1));
		pet.setName("1");
		pet.setCategory(listTags);
		
		System.out.println("PetApiServiceImplRest.getall()"+pet);
	       
		return pet;
	}
	
	@Override
	public Pet uploadFile(Long petId, String additionalMetadata, Attachment fileDetail) {
		System.out.println("PetApiServiceImplRest.getPetById()" + fileDetail);
		System.out.println("PetApiServiceImplRest.uploadFile()" + additionalMetadata);
		InputStream inputStream = null;

		DataHandler dataHandler = fileDetail.getDataHandler();
		
		try {
			System.out.println("PetApiServiceImplRest.uploadFile()"+dataHandler.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Pet pet = new Pet();
		List<Tag> listTags = new ArrayList<>();
		Tag tag = new Tag();
		tag.setName("tag1");
		tag.setId(Long.valueOf(1));
		listTags.add(tag);
		pet.setId(Long.valueOf(1));
		pet.setName("1");
		pet.setCategory(listTags);
		
		System.out.println("PetApiServiceImplRest.getall()"+pet);
	       
		return pet;
	}

	@Override
	public void addPet(Pet body) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePet(Long petId, String apiKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PetArray> getall(String keyword) {
		// TODO Auto-generated method stub
		System.out.println("PetApiServiceImplRest.getall()" + keyword);
		return null;
	}
}
