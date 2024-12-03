# Environnement

- Java 8 openjdk 1.8
- Maven 4.0
- JUnit 5.11.3

# Lancer le projet

- `mvn clean install` pour les dépendances
- `mvn test` pour lancer les tests unitaires
- Le fichier src/main/java/Main.java contient les deux chemin demandés dans l'énoncé. Chaque étape est décrite dans le terminal

# Overview

La class **Engine** contient deux attributs **Map** et **Adventurer** indépendants qu'elle fait fonctionner ensemble.

L'aventurier est initialisé avec une position de départ en paramètre constructeur.

La map contient un tileset chargé à partir d'un fichier texte sous forme de List de String; Chaque String correspond à une position Y, chaque caractère de String correspond à une position X.

Exemple: ["ABCD", "EFGH"]: **H** est en position [x: 3, y: 1]

La methode **process(String path)** de **Engine** prend un chemin sous forme de string en paramètre

Exemple: **engine.process("SSEESS");** dont chaque caractère correspond à une direction parmis **N,S,E,O**. Tout caractère différent sera ignoré et accompagné d'un message d'erreur.

Pour chaque déplacement, on simule la prochaine position. Si elle collisionne avec un arbre ou qu'elle est en dehors de la map, le déplacement est ignoré et accompagné d'un message d'erreur. Sinon, on met à jour la position du **Adventurer**. Puis on passe au déplacement suivant..

A la fin du trajet, la position finale de l'aventurier s'affiche en console
