package br.com.igocoelho.gamers

class User {

    String name
    String login
    String password
    String email
    String facebook
    String twitter
    String avatar
    Boolean active

    static constraints = {
        name nullable:false, blank:false
        login size: 5..20, nullable:false, blank:false, unique:true
        password size: 8..10, nullable:false, blank:false
        email email:true, nullable:false, blank:false
    }

    String toString() {
        name
    }
}