package org.example.ui

fun menu(){

    do {
        println("1 - Cadastrar Caixa D' Àgua")
        println("2 - Editar Caixa D' Àgua")
        println("3 - Listar Caixa D' Àgua")
        println("4 - Excluir Caixa D' Àgua")
        println("0 - Sair")

        var opcao = readln().toInt()
        when (opcao) {
            1 -> println("Cadastrando Caixa D' Àgua")
            2 -> println("Editando Caixa D' Àgua")
            3 -> println("Listar Caixa D' Àgua")
            4 -> println("Excluindo Caixa D' Àgua")
            0 -> println("Adios")
            else -> println("Opção inválida!!!")
        }
    }while (opcao != 0)

}