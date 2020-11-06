package com.example.crm.domain.partner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
@RepositoryRestResource(path = "partners")
public interface PartnerRepository extends JpaRepository<Partner, Long> {

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    <S extends Partner> List<S> saveAll(Iterable<S> iterable);

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void flush();

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    <S extends Partner> S saveAndFlush(S s);

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteInBatch(Iterable<Partner> iterable);

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteAllInBatch();

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    <S extends Partner> S save(S s);

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteById(Long aLong);

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void delete(Partner partner);

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteAll(Iterable<? extends Partner> iterable);

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteAll();
}
