package br.com.igocoelho.gamers

class Statistic {

	Integer playing
	Integer played
	Integer completed
	Integer abandoned
	Integer wantPlay
	Integer favorite
	Integer have
	Integer change
	Integer loaned

	static belongsTo = [game: Game]

    static constraints = {
    }
}