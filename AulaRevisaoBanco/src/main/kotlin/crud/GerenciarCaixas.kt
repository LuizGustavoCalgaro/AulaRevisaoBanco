package org.example.crud

import entidades.CaixaDAgua
import enumeradores.Material

fun cadastrarCaixa(){
    println("Escolha o material do qual a caixa é feita")
    println("1 - PVC")
    println("2 - PLÀSTICO")
    println("3 - METAL")
    println("4 - FITA")
    val opcao = readln().toInt()
    var material : Material
    when (opcao) {

        1 -> material = Material.PVC
        2 -> material = Material.PLÁSTICO
        3 -> material = Material.METAL
        4 -> material = Material.FITA
        else -> material = Material.PLÁSTICO
    }
    println("Capacidade da caixa em Litros")
    val capacidade = readln().toInt()

    println("Escolha a cor da caixa")
    val cor = readln()

    println("Escolha a altura da caixa")
    val altura = readln().toDouble()

    println("Escolha a largura da caixa")
    val largura = readln().toDouble()

    println("Escolha a marca da caixa")
    val marca = readln().toString()

    //Salvar as variaveis dentro da caixa
    CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        altura = altura,
        largura = largura,
        marca = marca,
        )
}

fun editarCaixa(){

}

fun listarCaixa(){

}

fun excluirCaixa(){

}