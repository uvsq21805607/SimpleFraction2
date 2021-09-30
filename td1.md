# TD 1
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    >  > si on coche une ou plusieurs cases on aura moins de commits car certains fichiers seront deja initialisés par exemple ( README.md ou .gitignore)
    > si on ne coche aucune case le projet sera initialisé et vide on devra créer des fichiers donc avoir plusieurs commit 

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    - user name :  git config --global user.name "Linda Bedjaoui"
    - user mail : git config --global user.mail "lindabed06@yahoo.com"
    
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    - git init
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    # Commandes pour valider les changements
     # Commandes pour valider les changements
    - echo >> frac.java
    - echo >> main.java ( un code qui fait un simple affichage )
    - git add frac.java main.java
    - git commit -m "commit 2 " 
    - git branch -M main
    - git remote add origin https://github.com/uvsq21805607/SimpleFraction2.git
    - git push -u origin main
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    // Code pour tester toString
    Dans la classe fraction.java : 

    
public class frac{

    private int nume;
    private int denom;

    public frac(int nume, int denom){

        this.nume = nume;
        this.denom = denom;
        
        
    }
    
    @Override

    public String toString(){

        return nume + " / " + denom;
    }


    public frac multiplication(frac A){

        int a = this.nume * A.nume;
        int b = this.denom * A.denom;

        return new frac(a,b);
    }

    public frac addition(frac A){

        int a = (this.nume * A.denom) + (this.denom * A.nume);
        int b = this.denom * A.denom;

        return new frac(a,b);
    }

}

Dans la classe Main.java : 

  public class main {


    public static void main(String[] args){

//AFFICHER UNE SIMPLE FRACTION :

        frac M = new frac(26, 6);
        
        System.out.println(" fraction 1 = " + M.toString() + "\n");

// MULTIPLICATION DE DEUX FRACTIONS : 

        frac L = new frac(6,26);

        frac c = L.multiplication(M);

         System.out.println(" Multiplication : \n ");

         System.out.println( M.toString() + " * " + L.toString() + "\n");

         System.out.println(" Resultat de la multiplication = \n " + c.toString()+ "\n");

// ADDITION DE DEUX FRACTIONS : 

        frac S = new frac(1,2);

        frac d = L.addition(S);

         System.out.println(" Addition : \n ");

         System.out.println( S.toString() + " + " + L.toString() + "\n");

         System.out.println(" Resultat de la addition = \n " + d.toString()+ "\n");


    } 
}


Validez les changements :

    - git add frac.java main.java
    - git commit -m "commit 2" 
    - git branch -M main
    - git remote add origin https...
    - git push -u origin main
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # Commandes pour publier les modifications
    - git push origin main
    ou bien : 
    - git remote add origin https://github.com/uvsq21805607/SimpleFraction.git
    - git push -u origin main
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    - echo "# Simple fraction2 ">> README.md
    - git add README.md
    - git commit -m " commit 1" 
    - git branch -M main
    - git remote add origin https://github.com/uvsq21805607/SimpleFraction2.git
    - git push -u origin main
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
     git fetch
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    # Copier ici le contenu de `.gitignore`
    - .gitignore contient : 
    # fichiers de la compilation 
    *.class
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
        rm *.class
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`
     ecrire *.class dans le fichier .gitignore
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la procédure de façon synthétique

    Tapez sur terminal (mac OS): 

1 : ssh-keygen
2 : Nommer le fichier ou sauvegarder la clé : ssh-key
3 : Entrer un passphrase 
4 : La randomart image de la clé s'affiche 
5 : Deux fichiers se créent ssh-key.pub ( clé publique ) et ssh-key ( clé privée )

6 : Creer ssh-agnt en tapant : eval 'ssh-agent'
7 : Entrez : ssh-add -K ssh-key et ensuite le passphrase
8 : Identifiant ajouté a ssh-key

## Partie II (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > Répondre ici
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # Répondre ici
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # Répondre ici
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # Répondre ici
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        # Répondre ici
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        # Répondre ici
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # Répondre ici
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        # Répondre ici
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Répondre ici
    * `screen`/`tmux`
        > Répondre ici
    * `curl`/[HTTPie](https://httpie.org/)
        > Répondre ici
    * [jq](https://stedolan.github.io/jq/)
        > Répondre ici

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > Répondre ici

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Répondre ici
1. Comment choisir le JDK à utiliser dans un projet ?
    > Répondre ici
1. Comment préciser la version Java des sources dans un projet ?
    > Répondre ici
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Répondre ici
1. Comment reformater un fichier source Java ?
    > Répondre ici
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Répondre ici
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Répondre ici
1. Comment renommer une classe dans l'ensemble du projet ?
    > Répondre ici
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Répondre ici
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Répondre ici
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Répondre ici