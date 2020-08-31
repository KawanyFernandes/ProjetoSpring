package com.example.projeto2;

import org.springframework.data.jpa.repository.JpaRepository;
//ajuda a consultar os dados do banco de dados especifico
public interface UserRepository extends JpaRepository<User, Long> {
}
