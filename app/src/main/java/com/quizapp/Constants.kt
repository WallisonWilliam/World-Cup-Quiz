package com.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Qual o primeiro ganhador da Copa do Mundo?",
            R.drawable.questao1,
            "Inglaterra",
            "Italia",
            "Alemanha",
            "Uruguai",
            4
            )
        val que2 = Question(
            2,
            "Qual foi o artilheiro mais jovem da história da Copa do Mundo?",
            R.drawable.questao2,
            "Lionel Messi",
            "Cristiano Ronaldo",
            "Kylian Mbappé",
            "Pelé",
            4
        )
        val que3 = Question(
            3,
            "Qual o maior artilheiro da Copa do Mundo?",
            R.drawable.questao3,
            "Pelé",
            "Ronaldo Fenomeno",
            "Klose",
            "Zidane",
            3
        )
        val que4 = Question(
            4,
            "Qual é o jogador com mais jogos em Copa do Mundo de todos os tempos?",
            R.drawable.questao4,
            "Lothahr Matthäus",
            "Paul Pogba",
            "Paolo Maldini",
            "Harry Kane",
            1
        )
        val que5 = Question(
            5,
            "Em que ano o Brasil ganhou sua primeira copa do mundo?",
            R.drawable.questao5,
            "1958",
            "1950",
            "1962",
            "1966",
            1
        )
        val que6 = Question(
            6,
            "Quem que machucou o Neymar no primeiro jogo da Copa de 2022 ?",
            R.drawable.questao6,
            "Nikola Milenkovic",
            "Mbappe",
            "Daniel Alves",
            "Roosevelt",
            1
        )
        val que7 = Question(
            7,
            "Qual foi a ultima seleção a receber a Taça Jules Rimet? ?",
            R.drawable.questao7,
            "Russia",
            "Japão",
            "Brasil",
            "Argentina",
            1
        )
        val que8 = Question(
            8,
            "Qual seleção tem mais vices de Copa do Mundo ?",
            R.drawable.questao8,
            "França",
            "Italia",
            "Alemanha",
            "Ucrania",
            3
        )
        val que9 = Question(
            9,
            "Qual é o país da Copa do Mundo com mais gols feitos?",
            R.drawable.questao9,
            "Espanha",
            "Brasil",
            "Costa Rica",
            "Arabia Saudita",
            2
        )
        val que10 = Question(
            10,
            "Quem é esse Deus ?(extra)",
            R.drawable.questao11,
            "Neymar",
            "Roosevelt",
            "Casimiro",
            "Lucas Paquetá",
            3
        )


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }




}