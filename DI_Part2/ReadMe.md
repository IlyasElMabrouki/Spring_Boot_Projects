# Mini Framework d'injection de dépendances en Java

## Introduction
Dans le cadre de ce projet, nous allons développer un mini-framework d'injection de dépendances en Java. Ce framework permettra aux développeurs de configurer et d'injecter les dépendances entre les différents composants de leur application. Nous fournirons deux méthodes pour effectuer l'injection de dépendances : via un fichier de configuration XML et à l'aide d'annotations directement dans le code source.

## Fichier XML de configuration
Nous utiliserons JAXB (Java Architecture for XML Binding) pour mapper les données du fichier XML aux objets Java correspondants. Pour assurer une implémentation correcte, nous créerons des classes Java qui correspondent aux noms des balises utilisées dans le fichier XML.

## Annotations
Nous utiliserons des annotations Java pour marquer les classes et les méthodes nécessitant une injection de dépendances. Nous créerons deux annotations : `@Component` et `@Autowired`.

- `@Component` sera utilisé pour marquer les classes à injecter.
- `@Autowired` sera utilisé pour marquer les méthodes setter ou les constructeurs nécessitant une injection de dépendances.

## Injection de dépendances
Une fois que les classes ont été correctement annotées, nous utiliserons un processeur d'annotations pour traiter ces annotations et effectuer l'injection de dépendances au moment approprié.

Le processeur d'annotations vérifiera les classes pour la présence des annotations `@Component` et `@Autowired`. Lorsqu'une classe est marquée avec `@Component`, elle sera instanciée et stockée dans une Map. Lorsqu'une méthode setter ou un constructeur est marqué avec `@Autowired`, on recherchera l'instance appropriée dans la Map et effectuera l'injection de dépendances.
