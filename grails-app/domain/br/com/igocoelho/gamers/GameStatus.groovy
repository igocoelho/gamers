package br.com.igocoelho.gamers

enum GameStatus {

	PLAYING(1),
	PLAYED(2),
 	COMPLETED(3),
	ABANDONED(4),
	WANT_PLAY(5)

 	int id

	GameStatus(int id) {
 		this.id = id
	}
}