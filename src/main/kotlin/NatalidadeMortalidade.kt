
fun NatalidadeMortalidade () : Unit {

    println("Digite a taxa de nascimentos:")
    var nascidos = readLine()!!.toInt()
    println("Digite a taxa de óbitos:")
    var numeroDeObitos = readLine()!!.toInt()
    println("Digite o número de habitantes:")
    var numeroDeHabitantes = readLine()!!.toInt()

    println("Escolha alguma opção: \n1 - Taxa de mortalidade \n2 - Taxa de natalidade")

    when (readLine()!!.toInt()) {
        1 -> println("Opção escolhida: Taxa de mortalidade: ${(numeroDeObitos * 1000) / numeroDeHabitantes}" )
        2 -> println("Opção escolhida: Taxa de natalidade: ${(nascidos * 1000) / numeroDeHabitantes}")

        else -> println("Opção Invalida!")
    }
}