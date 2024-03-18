# Gestion des Produits avec Spring Boot, Spring MVC, Thymeleaf, JPA et Spring Security

## Introduction :
Ce projet est une application Java basée sur Spring Boot qui offre un système complet de gestion des produits. Il intègre Spring MVC avec Thymeleaf pour la création de l'interface utilisateur, Spring Data JPA pour la persistance des données dans une base de données MySQL, et Spring Security pour assurer l'authentification et l'autorisation des utilisateurs.

## Fonctionnalités Principales :

1. **CRUD des Produits** :
    - Création, lecture, mise à jour et suppression des produits.

2. **Recherche de Produits** :
    - Possibilité de rechercher des produits par nom.
    - Interface utilisateur conviviale pour saisir les critères de recherche.

3. **Authentification et Autorisation** :
    - Les utilisateurs doivent s'authentifier pour accéder aux fonctionnalités de gestion des produits.
    - Spring Security assure la gestion des rôles et des autorisations pour contrôler l'accès aux différentes fonctionnalités de l'application.

4. **Persistance des Données** :
    - Utilisation de Spring Data JPA pour la persistance des produits dans une base de données MySQL.
    - Mapping objet-relationnel (ORM) pour simplifier l'interaction avec la base de données relationnelle.

5. **Sécurité des Données** :
    - Les données sensibles, telles que les mots de passe des utilisateurs, sont sécurisées grâce à des techniques de hachage et de salage.

6. **Interface Utilisateur (UI) Conviviale** :
    - Interface utilisateur basée sur Spring MVC et Thymeleaf pour faciliter la gestion des produits.
    - Présentation claire des informations sur les produits.

## Technologies Utilisées :

- **Spring Boot** : Framework Java pour créer des applications Java autonomes.
- **Spring MVC** : Framework web basé sur le modèle MVC pour la création d'applications web.
- **Thymeleaf** : Moteur de templates Java pour la création de vues HTML.
- **Spring Data JPA** : Facilite la mise en œuvre de la couche d'accès aux données basée sur JPA.
- **Spring Security** : Assure la sécurité de l'application en gérant l'authentification et l'autorisation.
- **MySQL** : Système de gestion de base de données relationnelle open-source.
- **Maven** : Outil de gestion de projets et de construction utilisé pour la gestion des dépendances et le cycle de vie du projet.

## Conclusion :
Ce projet vise à fournir une solution robuste et sécurisée pour la gestion des produits, tout en démontrant l'utilisation efficace des technologies Spring Boot, Spring MVC, Thymeleaf, JPA et Spring Security dans le contexte d'une application web moderne.

