
docker container run --rm -v "C:/Users/clemy/Desktop/conf/conf java:/documents" asciidoctor/docker-asciidoctor:1.65 asciidoctor-revealjs /documents/intro.adoc


== programme
JEP 447 _ Statements before super
JEP 459 _ String Templates
JEP 456 _ Unnamed Variables & Patterns
JEP 457 _ Class-File API

== Java 23

== programme




===  JEP 447 Statements before super (preview)

Quand une classe étend une autre classe , il est nécessaire d’appeler le constructeur de la classe parente dans le constructeur de la classe enfant. Dans ce cas, la JVM impose que cet appel soit la toute première instruction du constructeur. Cette contrainte garantit que les champs de la classe parente sont correctement initialisés avant que la classe enfant ne poursuive sa propre initialisation.

La fonctionnalité JEP 447, actuellement en préversion, assouplit cette règle en permettant l’exécution de certaines instructions avant l’appel au constructeur parent, à condition que celles-ci n’interagissent pas avec l’instance en cours de création. Cela ouvre la voie à de nouvelles possibilités, telles que la validation des paramètres ou le pré-calcul des arguments, avant d’initialiser la classe parente.

exemple, voici comment se faisait la validation des paramètres avant et après l’introduction de la JEP 447 :

images::images/JEP447_statement_before_super.png[title="JEP 447", alt="Description", width=600]
===  JEP 459 String Templates (Second Preview)

Ce que fait String de template
Traditionnellement, pour composer des chaînes de caractères en Java, il fallait utiliser des techniques comme la concaténation (+),
ou bien des classes comme StringBuilder et la méthode String.format(). Les expressions de template simplifient ce processus en
permettant d’insérer directement des variables ou des expressions dans une chaîne de caractères.

Points clés des String de template :

Permet d'insérer des valeurs variables dans une chaîne de caractères.
Les développeurs peuvent définir des règles pour générer des objets à partir de la structure du texte. Cela dépasse la simple génération
de chaînes et permet, par exemple, de créer des objets JSON ou SQL à partir du texte.
En plus d'une syntaxe simplifiée, les expressions de template offrent des mécanismes pour valider
les chaînes interpolées et éviter des erreurs de manipulation courantes (comme les injections SQL).
String name = "Bond";
String info = STR."My name is {name}";

===  JEP 456 – Unnamed Variables & Patterns
La JEP 456 introduit les variables et motifs anonymes (non-nommés) dans le langage Java. Cette fonctionnalité permet
d'utiliser le symbole _ comme une variable ou un motif qui n'a pas besoin d'être nommé, et qui est ignoré par
la JVM lors de l'exécution. Cela apporte plus de flexibilité et de simplicité, notamment dans les cas où certaines valeurs
ne sont pas pertinentes et n'ont pas besoin d'être référencées dans le code.

images::images/jep456 1.png[title="JEP 447", alt="Description", width=600]











!
mots clés : Java Enhancemen