package com.github.alanamanco.pessoaApi.pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query(value = "SELECT ((SELECT lat_lon FROM pessoa WHERE id=?1) ", nativeQuery = true)
    Double distanceByPoints(final Long cityId1, final Long cityId2);
}

