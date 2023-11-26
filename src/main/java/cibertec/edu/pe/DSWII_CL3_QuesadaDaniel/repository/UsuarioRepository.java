package cibertec.edu.pe.DSWII_CL3_QuesadaDaniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cibertec.edu.pe.DSWII_CL3_QuesadaDaniel.model.Usuario;

@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer> {

    Usuario findByNomusuario(String nomusuario);

}