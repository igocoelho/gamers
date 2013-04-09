gamers
======

Acesso com controle de usuario.
Implementar controle de segurança usando filtro.
Mais de um jogo por plataforma.
Mesmo jogo em varias plataformas.
Jogo é dividido em categoria.
Usuario pode adicionar jogo com status { Já joguei, zerei, jogando, abandonei, quero jogar }, nota e comentar
Criptografar senha
Usar qualquer banco, inclusive o deafult
Jogo tem estatisticas
Agendar estatisticas para fazer em um determinado horario
Integração com facebook e twitter
Permitir envio de email para o usuario
Envio de senha ao email do usuario


Classes:
Usuario { avatar, nome, login, senha, email, facebook, twitter }
Jogo { nome, desenvolvedora, publicadora, lançamento, descrição, capa }
Plataforma { nome }
Categoria { nome }
MeuJogo { status, nota, comentario, favoritos, tenho, troco, emprestados }
Estatistica { favorito, tenho, troco, emprestados, ja jogaram,, zeraram, abandonaram, querem jogar, jogando }