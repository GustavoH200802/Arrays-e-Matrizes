fun main() {

    //Questão 1

    val numeros = intArrayOf(10, 20, 30, 40, 50, 60)
    var inicio = 0
    var fim = numeros.lastIndex

    while (inicio < fim) {
        val temp = numeros[inicio]
        numeros[inicio] = numeros[fim]
        numeros[fim] = temp

        inicio++
        fim--
    }

    println("Array invertido: ${numeros.contentToString()}")

    //Questão 2

    val codigos = arrayOf("TXN-101", "TXN-204", "TXN-309", "TXN-412", "TXN-550")
    val alvo = "TXN-309"
    var encontrado = false

    for (i in codigos.indices) {
        if (codigos[i] == alvo) {
            println("Código $alvo encontrado na posição (índice) $i.")
            encontrado = true
            break
        }
    }

    if (!encontrado) {
        println("Código $alvo não encontrado.")
    }

    //Questão 3

    val temperaturas = doubleArrayOf(28.5, 31.0, 26.8, 32.4, 29.9, 27.5, 30.2)
    var soma = 0.0

    for (temp in temperaturas) {
        soma += temp
    }

    val media = soma / temperaturas.size
    println("Média da semana: ${"%.2f".format(media)}°C")
    println("Dias (índices) acima da média:")

    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("Dia/Índice $i: ${temperaturas[i]}°C")
        }
    }

    //Questão 4

    val numeros = IntArray(20) { it + 1 } // [1, 2, ..., 20]
    var somaIndicesPares = 0

    for (i in 0 until numeros.size step 2) {
        val valor = numeros[i]
        print("$valor ")
        somaIndicesPares += valor
    }

    println("\nSoma dos elementos em índices pares: $somaIndicesPares")

    //Questão 5

    val tarefas = arrayOf(
        "Revisar pull requests",
        "Atualizar documentação da API",
        "Escrever testes unitários",
        "Deploy em ambiente de homologação"
    )

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("${indice + 1}. $tarefa")
    }

    //Questão 6

    val matriz = arrayOf(
        intArrayOf(2, 4, 6, 8),
        intArrayOf(1, 3, 5, 7),
        intArrayOf(10, 20, 30, 40)
    )

    for (linha in matriz.indices) {
        var somaLinha = 0
        for (coluna in matriz[linha].indices) {
            somaLinha += matriz[linha][coluna]
        }
        println("Soma da linha $linha: $somaLinha")
    }

    //Questão 7

    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val linhasOrig = original.size // 2
    val colunasOrig = original[0].size // 3

    val transposta = Array(colunasOrig) { IntArray(linhasOrig) }

    for (i in 0 until linhasOrig) {
        for (j in 0 until colunasOrig) {
            transposta[j][i] = original[i][j]
        }
    }

    println("Matriz Original (2x3):")
    for (linha in original) {
        println(linha.joinToString(" "))
    }

    println("\nMatriz Transposta (3x2):")
    for (linha in transposta) {
        println(linha.joinToString(" "))
    }

    //Questão 8

    val matriz = arrayOf(
        intArrayOf(5, 2, 9, 1),
        intArrayOf(4, 8, 3, 7),
        intArrayOf(6, 1, 12, 4),
        intArrayOf(2, 5, 7, 10)
    )

    var somaDiagonalPrincipal = 0

    println("Matriz 4x4:")
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            print("${matriz[i][j]}\t")
            if (i == j) {
                somaDiagonalPrincipal += matriz[i][j]
            }
        }
        println()
    }

    println("\nSoma da Diagonal Principal: $somaDiagonalPrincipal")

    //Questão 9

    val matriz = arrayOf(
        intArrayOf(15, 0, 8),
        intArrayOf(0, 25, 0),
        intArrayOf(10, 5, 0)
    )

    var somaPositivos = 0

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            val valor = matriz[i][j]
            if (valor == 0) {
                continue
            }
            if (valor > 0) {
                somaPositivos += valor
            }
        }
    }

    println("Soma dos valores maiores que zero: $somaPositivos")

    //Questão 10

    val boletim = Array(3) { DoubleArray(2) }

    // Preenchendo as 2 notas de cada um dos 3 alunos
    boletim[0] = doubleArrayOf(8.0, 7.5)
    boletim[1] = doubleArrayOf(6.0, 5.5)
    boletim[2] = doubleArrayOf(9.0, 8.5)

    var somaMediasTurma = 0.0

    for (i in boletim.indices) {
        val n1 = boletim[i][0]
        val n2 = boletim[i][1]
        val mediaAluno = (n1 + n2) / boletim[i].size
        somaMediasTurma += mediaAluno

        val situacao = if (mediaAluno >= 7.0) "Aprovado" else "Reprovado"
        println("Aluno ${i + 1} | Notas: $n1, $n2 | Média: ${"%.2f".format(mediaAluno)} | $situacao")
    }

    val mediaGeralTurma = somaMediasTurma / boletim.size
    println("\nMédia geral da turma: ${"%.2f".format(mediaGeralTurma)}")
}