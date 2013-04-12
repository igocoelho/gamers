import br.com.igocoelho.gamers.User

class BootStrap {

    def init = { servletContext ->
    	new User(name: "Igo Coelho", login: "igocoelho", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho2", login: "igocoelho2", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho3", login: "igocoelho3", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho4", login: "igocoelho4", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho5", login: "igocoelho5", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho6", login: "igocoelho6", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho7", login: "igocoelho7", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho8", login: "igocoelho8", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho9", login: "igocoelho9", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho10", login: "igocoelho10", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho11", login: "igocoelho11", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho12", login: "igocoelho12", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho13", login: "igocoelho13", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    	new User(name: "Igo Coelho14", login: "igocoelho14", password: "12345678", email: "igo@coelho.com", facebook: "http://facebook.com/igocoelho", twitter: "http://twitter.com/igocoelho", avatar: "", active: true).save(failOnError: true)
    }
    def destroy = {
    }
}
