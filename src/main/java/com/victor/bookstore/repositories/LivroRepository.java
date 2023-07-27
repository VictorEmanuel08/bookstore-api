package com.victor.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.victor.bookstore.domain.Livro;

//informar para o spring que estamos criando
//uma interface reposirory

//ele espera dois argumentos: 
//1 - A classe implementada (a camadad e comuncação)
//2 - O tipo primitivo da variavel utilizada como chave primária (identificadora da classe)
//@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{
	

}
