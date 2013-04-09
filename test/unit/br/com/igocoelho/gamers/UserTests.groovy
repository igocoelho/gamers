package br.com.igocoelho.gamers

import grails.test.mixin.*
import org.junit.*

@TestFor(User)
class UserTests {

  final NAME = "Igo Coelho"
  final LOGIN = "igocoelho"
  final PASS = "1234"
  final EMAIL = "igocoelho@gmail.com"
  final TWITTER = "http://twitter.com/igocoelho"
  final FACEBOOK = "http://facebook.com/igocoelho"

  void testConstructor() {
    def user = new User(name: NAME, login: LOGIN, password: PASS, email: EMAIL, twitter: TWITTER, facebook: FACEBOOK)
    assert user.name == NAME
    assert user.login == LOGIN
    assert user.password == PASS
    assert user.email == EMAIL
    assert user.twitter == TWITTER
    assert user.facebook == FACEBOOK
  }

  void testToString() {
    def user = new User(name: NAME)
    assert user.toString() == NAME
  }
}