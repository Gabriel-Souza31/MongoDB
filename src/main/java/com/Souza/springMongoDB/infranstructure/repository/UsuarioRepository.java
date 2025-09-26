package com.Souza.springMongoDB.infranstructure.repository;

import com.Souza.springMongoDB.infranstructure.entitys.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario,String> {
    Usuario findByNome(String nome);
    List<Usuario>findByIdade(Integer idade);
}
