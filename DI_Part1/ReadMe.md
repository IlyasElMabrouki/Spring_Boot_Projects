## Introduction

Afin d'assurer la qualité d'un projet et de respecter les bonnes pratiques (fermé à la modification et ouvert à l'extension), il est essentiel de suivre certains design patterns de programmation, tels que l'Aspect-Oriented Programming (AOP), qui assure la séparation entre le code métier et le code technique. Pour cette activité pratique, nous allons essayer d'appliquer le principe d'inversion de contrôle (IoC) et l'injection de dépendance (DI) afin d'avoir une application facile à maintenir pour les futures modifications.

## Structure du projet

Le projet sera composé de 3 parties principales, représentées sous forme de packages :

- Partie DAO
- Partie Métier
- Partie Présentation

## Interfaces et classes

Afin d'assurer une bonne implémentation de nos design patterns DI et IoC, il est essentiel de créer un couplage faible entre les classes en dépendant des interfaces. Nous avons réalisé cela dans la partie DAO en créant une interface suivie d'une implémentation de cette interface. La même approche a été adoptée pour la partie Métier.

## Injection des dépendances

Il existe plusieurs façons d'implémenter l'injection des dépendances entre les classes de notre projet :

- **Instanciation statique :** consiste à créer les dépendances en utilisant le mot-clé `new`.
- **Instanciation dynamique :** consiste à créer un fichier de configuration contenant l'ensemble des classes utilisables dans notre projet.
- **Spring (Version XML) :** consiste à spécifier l'ensemble des beans de notre projet dans un fichier XML, en définissant les relations de dépendances entre les classes.
- **Spring (Version Annotation) :** consiste à utiliser des annotations pour indiquer le rôle de chaque partie de notre projet. Utilisation de `@Component` pour indiquer que cette classe est un bean et `@Autowired` pour appliquer l'injection des dépendances.

## Conclusion

En suivant les principes d'inversion de contrôle et d'injection de dépendances, nous pouvons garantir une application bien structurée, facilement extensible et simple à maintenir pour les futures évolutions.