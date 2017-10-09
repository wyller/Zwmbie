Zwmbie
=====================

#### Esse é um projeto academico sobre Design Patterns

## inglobao

Clone o projeto para sua máquina:

```bash
$ git clone <LINK DO REPOSITÓRIO>
```

- Abra o projeto no NetBeans(ou o editor de texto a sua preferencia).

## Estória

- Esse projeto se trata de um jogo de zumbis, no qual, ate o momento, se tem um Player e os Zumbis. Nesse Player
encontramos dois Patterns, o State e o Observer e nos Zumbis encontramos o Composite e o Builder.

## Sobre o projeto
-segue a explicação das funções de cada Patterns em seus devidos pacotes pacote:
	
#### Patterns State, pacote "zwmbie.PlayerState"

-Esse pacote tem como responsabilidade controlar o estado que o Player se encontra, já que se trata de um jogo de zumbi ele pode esta infectado ou normal.

#### Patterns Observer, pacote "zwmbie.PlayerObserver"

-Esse pacote tem como responsabilidade a transição do Player nas trocas de estados, quando ele for mordido ou curado.


#### Patterns Composite, pacote "zwmbie.ZumbisComposite"

-Esse pacote tem como responsabilidade tratar a criação de um zumbi e uma horda de zumbis com a mesma facilidade.


#### Patterns Builder, pacote "zwmbie.ZwmbieBuilder"

-Esse pacote tem como responsabilidade a facilidade e integridade, tratando de regras de negocio, criação de novos zumbis.

## Conclusão

-Esse projeto é um exemplo academico de implementação de varios Patterns com o objetivo de demonstrar a interração delles.
