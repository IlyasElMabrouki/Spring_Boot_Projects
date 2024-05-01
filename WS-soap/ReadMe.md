## Introduction

Cette documentation décrit l'implémentation et l'utilisation d'un service web offrant des fonctionnalités de conversion ainsi que la récupération des informations de compte.

## Concept

Le service web est basé sur le protocole SOAP (Simple Object Access Protocol) et utilise XML pour la transmission des données. Il est transporté via le protocole HTTP. Pour que les clients puissent consommer ce service, ils doivent suivre les étapes suivantes :

1. Communiquer avec un serveur intermédiaire pour récupérer les informations de l'annuaire UDDI (Universal Description, Discovery, and Integration).
2. Communiquer avec le serveur correspondant pour obtenir la description du service via WSDL (Web Services Description Language).
3. Envoyer des requêtes au serveur en utilisant le protocole SOAP.

## Implémentation

### Étapes de l'implémentation :

1. Création d'une classe contenant les méthodes à implémenter.
2. Ajout de la dépendance JAX-WS (Java API for XML Web Services).
3. Ajout des annotations telles que `@WebService`, `@WebMethod`, `@WebParam` pour définir les services web et les méthodes.
4. Création d'une classe serveur qui déploie le service web en utilisant la méthode `Endpoint.publish()`.
5. Récupération du WSDL en communiquant avec le serveur.
6. Test du service web en utilisant SOAP UI ou tout autre outil similaire.

### Fonctionnalités offertes par le service web :

1. **Conversion :** Cette fonctionnalité permet de convertir entre DH et Euro.

2. **getCompte :** Cette fonctionnalité permet de récupérer les informations d'un compte spécifique.

3. **getComptes :** Cette fonctionnalité permet de récupérer la liste des comptes disponibles.

## Conclusion

Ce document fournit une vue d'ensemble de l'implémentation et de l'utilisation d'un service web offrant des fonctionnalités de conversion et de récupération d'informations de compte.