package cibertec.edu.pe.DSWII_CL3_QuesadaDaniel.repository;

import cibertec.edu.pe.DSWII_CL3_QuesadaDaniel.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends
        JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nombrerol);
}