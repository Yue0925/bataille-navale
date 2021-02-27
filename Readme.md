# Projet Bataille Navale

## Gestion Git

Parfois entre deux commits d'exercice, il existe un commit "changements minores" qui est la modification/correction de l'exercice précédente.

## Définition du jeu

Comme vous voyez l'affichage de la grille dans le terminale, les lettres majuscules correspondent aux columns, les chiffres correspondent aux lignes. Par exemple, "A3" correspond à la position (3, 1).

Donnée une position (a, b), elle correspond à la case (a-1, b-1) du tableau/board.

## Exercice 1

* **Encapsulation:** Les attributes de la classe Board sont privées, les getters et setters sont fournis.
* **Exécution:** java ensta.board.TestBoard


## Exercice 2

* **Classe enum:** Vu que les types du navires sont préféfinis, je crée une classe enum ShipsType.java contenant les quatres types de navire. De même raison, pour les quatres orientations du jeu, je crée aussi une classe enum Orientation.java
* **Package:** En fonction du type des fichiers, je définis quatres sous-répertoires/packages pour le projet.
* **Exécution:** java ensta.ship.TestShip


## Exercice 3

* **Exception:** Je crée une classe d'exception BoardException.java, pour lancer l'exception en cas d'erreur de placement du navire.
* **Indice de position:** Donnée une position (x, y), x et y doivent être compris entre 1 et n où n est la taille de la grille. Cette position correspond à la case (x-1, y-1).
* **Vérification de bon placement:** Au début je n'avais pas pensé à la longeur de navire, donc je l'ai corrigé ultérieurement dans le commit "Exercice7 + Correction". Dans la fonction VerifyAndPutShip(), si le placement du navire à la position choisie ne pose pas d'érreur, alors le placement est fait. Sinon, la fontion VerifyAndPutShip() renvoie false.


## Exercice 4

* **Exécution:** java ensta.player.TestPlayer


## Exercice 5 & 6

* **État illégal:** Un navire est totalement dédruit si le nombre de frappes atteint à sa longeur, du coup ce navire est coulé, et il n'existe plus navire à cette position.
* **Envoie de frappe:** Dans la fonction sendHit(), il d'abord vérifie s'il existe un navire à la position donnée, s'il n'y a pas de navire, alors la frappe est faux. Si oui, la frappe est vraie et le nombre de frappe de ce navire augmente.
* **Exécution:** java ensta.player.TestPlayer


## Exercice 7

* **Exécution:** java ensta.game.TestGame


## Exercice 8

* **Affichage au tour:** Pour Player/AIPlayer, j'affichage le board adverse dans la fonction sendHit() après chaque l'envoie de frappe.
* **Exécution:** java ensta.game.Game


## Bonus 1

* **Deux players:** J'ajoute une variable booléan pour indiquer le mode du jeu.
