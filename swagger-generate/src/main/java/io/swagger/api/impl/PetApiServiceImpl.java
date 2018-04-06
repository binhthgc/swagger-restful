package io.swagger.api.impl;

import io.swagger.api.*;
import java.io.File;
import io.swagger.model.Pet;
import io.swagger.model.PetArray;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

public class PetApiServiceImpl implements PetApi {
    public void addPet(Pet body) {
        // TODO: Implement...
        
        
    }
    
    public void deletePet(Long petId, String apiKey) {
        // TODO: Implement...
        
        
    }
    
    public Pet getPetById(Long petId) {
        // TODO: Implement...
        
        return null;
    }
    
    public List<PetArray> getall(String keyword) {
        // TODO: Implement...
        
        return null;
    }
    
    public Pet uploadFile(Long petId, String additionalMetadata,  Attachment fileDetail) {
        // TODO: Implement...
        
        return null;
    }
    
}

