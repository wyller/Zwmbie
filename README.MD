Zwmbie
=====================

#### Esse � um projeto academico sobre Design Patterns

## inglobao

Clone o projeto para sua m�quina:

```bash
$ git clone <LINK DO REPOSIT�RIO>
```

- Abra o projeto no NetBeans(ou o editor de texto a sua preferencia).

## Est�ria

- Esse projeto se trata de um jogo de zumbis, no qual, ate o momento, se tem um Player e os Zumbis. Nesse Player
encontramos dois Patterns, o State e o Observer e nos Zumbis encontramos o Composite e o Builder.

## Sobre o projeto
- segue a explica��o das fun��es de cada Patterns em seus devidos pacotes pacote:
	
#### Patterns State, pacote "zwmbie.PlayerState"

- Esse pacote tem como responsabilidade controlar o estado que o Player se encontra, j� que se trata de um jogo de zumbi ele pode esta infectado ou normal.

#### Patterns Observer, pacote "zwmbie.PlayerObserver"

- Esse pacote tem como responsabilidade a transi��o do Player nas trocas de estados, quando ele for mordido ou curado.


#### Patterns Composite, pacote "zwmbie.ZumbisComposite"

- Esse pacote tem como responsabilidade tratar a cria��o de um zumbi e uma horda de zumbis com a mesma facilidade.


#### Patterns Builder, pacote "zwmbie.ZwmbieBuilder"

- Esse pacote tem como responsabilidade a facilidade e integridade, tratando de regras de negocio, cria��o de novos zumbis.

## Conclus�o

- Esse projeto � um exemplo academico de implementa��o de varios Patterns com o objetivo de demonstrar a interass�o deles.
