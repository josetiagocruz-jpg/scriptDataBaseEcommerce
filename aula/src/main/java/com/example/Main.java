package com.example;

import java.util.Scanner;

import cliente.Cliente;
import planos.Plano;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.cadastrarCliente();

        Plano planos = new Plano();
        planos.exibirCatalogoPlanos();

        
    }
}