package br.com.igocoelho.gamers

class Game {

	String name
	String description
	String folder

	static belongsTo = [plataform: Plataform, categorie: Categorie]

    static constraints = {
    }
}