package com.Souza.springMongoDB.businesService;

import com.Souza.springMongoDB.infranstructure.entitys.Usuario;
import com.Souza.springMongoDB.infranstructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
 private final UsuarioRepository repository;
 public UsuarioService(UsuarioRepository repository){
     this.repository=repository;
 }
public Usuario salvar (Usuario usuario){
     return repository.save(usuario);
}
public List<Usuario> listar(){
     return repository.findAll();
}
public Usuario buscarPorid(String id){
     return repository.findById(id).orElse(null);
}
public void deletar(String id){
     repository.deleteById(id);
}
}
