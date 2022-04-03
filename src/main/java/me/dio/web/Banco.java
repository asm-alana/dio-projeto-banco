package me.dio.web;

import lombok.Data;

import java.util.List;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;
}
