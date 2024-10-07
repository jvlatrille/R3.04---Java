/**
 * Classe : Main
 * Objectif : Mettre en évidence les problémes liés é la différence entre l'objet et son adresse
 * 
 * 1. Créer un pointeur c'est différent que de créer un objet 
 * 2. Cas de l'objet référencé par deux pointeurs
 * 3. Créer un objet é l'identique d'un objet modéle : constructeur par recopie
 * 
 * 4. Comparer deux pointeurs versus comparer deux objets
 *  4.a Comparer 2 pointeurs
 *  4.b Comparer 2 objets => la méthode boolean equals(objetModele)
 * 
 * 5. Paramétres des fonctions et méthodes : seule la valeur de la variable est transmise 
 *  5.a Paramétre "type primitif"
 *  	=> modifications de la variable sans effet au niveau appelant
 *  5.b Paramétre "pointeur"
 *  	=> modification de la référence sans effet au niveau appelant
 *      => modification de l'objet référencé avec effet au niveau appelant 
 * @version 2.0
 * @author Lopistéguy Philippe
 * @date jj/mm/aa
 */
public class Main {

/** 1.ATTRIBUTS              -non- **/
/** 2.CONSTRUCTEURS          -non- **/
/** 3.METHODES ENCAPSULATION -non- **/
/** 4.METHODES USUELLES      -non- **/

/** 5.METHODES SPECIFIQUES : modifierLeParametreDeTypePrimitifInt, modifierLeParametreAdresse, modifierObjetPointeParLeParametre **/

	static public void modifierLeParametreDeTypePrimitifInt (int entierRecu) {
		System.out.println ("... je recois l'entier "+ entierRecu +" et l'augmente de 1");
		entierRecu++;  // incrémentation
		System.out.println ("... pour moi il vaut "+ entierRecu +" et la fonction se termine");
	}
	
	static public void modifierLeParametreAdresse (Ingredient ingredient1) {
		System.out.println ("... je recois l'adresse de l'ingredient "+ingredient1.toString());
		Ingredient unNouveau;
		unNouveau = new Ingredient ("vin", 40); // Crée unNouveau ingredient
		System.out.println ("... je cree un nouvel ingredient "+ unNouveau.toString());
		ingredient1 = unNouveau;					 
		System.out.println ("... le parametre recu pointe sur ce nouvel ingredient "+ingredient1.toString()+" et la fonction se termine");
	}
	
	static public void modifierObjetPointeParLeParametre (Ingredient ingredient1) {
		System.out.println ("... je recois l'adresse de l'ingredient "+ingredient1.toString());
		ingredient1.set_quantite(0);
		System.out.println ("... je modifie la quantite "+ ingredient1.toString()+" et la fonction se termine");
	}

/** 6.METHODE PRINCIPALE: main() **/
	public static void main(String[] args) {
		
		 /* 1. Créer un pointeur c'est différent que de créer un objet 
		 * - un pointeur est capable de stocker l'adresse d'un objet
		 * - un objet est créé par un 'new'
		 * - un 'new' retourne l'adresse de l'objet créé
		 * => on récupére l'adresse dans un pointeur
		*/
		System.out.println("\n1. Creer un pointeur c'est different que de creer un objet");
		// **** // On crée le pointeur ingredient10,
		Ingredient ingredient10;
		// **** // On crée l'objet <"lait",10> et le pointeur ingredient10 récupére l'adresse de l'objet <"lait",10>
		ingredient10 = new Ingredient ("lait", 10);
		// **** // On affiche la valeur de ingredient10
		ingredient10.afficher();

		/* 2. Cas de l'objet reference par deux pointeurs
		 *  a. declarer 2 pointeurs
		 *  b. creer un objet et garder son @ dans le 1er pointeur
		 *  c. copier cette @ dans // **** le 2eme pointeur
		 *  d. afficher l'objet que pointeur le 1er et le 2eme pointeur
		 *  e. modifier l'objet via le 2eme pointeur & constater la modification
		 *  f. afficher l'objet pointe par chacun de ces 2 pointeurs
		 * => les modifications de l'objet via le 1er pointeur ont affecté les valeurs
		 *    de l'objet pointé par le 2eme pointeur. Normal ! c'est le méme objet
		 */
		System.out.println("\n2. Cas de l'objet reference par deux pointeurs");
		// **** // a. création d'un 1er pointeur ingredient21
		Ingredient ingredient21;
		// **** // a. création d'un 2eme pointeur ingredient22
		Ingredient ingredient22;
		// **** // b. le 1er pointe sur new objet <"sel", 21>
		ingredient21 = new Ingredient ("sel", 21);
		// **** // c. copier l'@ de l'objet dans le 2éme pointeur
		ingredient22 = ingredient21;
		// **** // d. affichage via 1er pointeur
		ingredient21.afficher();
		// **** // d. affichage via 2éme pointeur
		ingredient22.afficher();
		// **** // e. modifier l'objet via le 1er pointeur
		ingredient21.set_libelle("Sucre");
		// **** // f. affichage via 1er pointeur
		ingredient21.afficher();
		// **** //    et 2éme pointeur
		ingredient22.afficher();

		 /* 3. Créer un objet é l'identique d'un objet modéle : constructeur par recopie
		 *   a. écrire un constructeur avec un objet modéle en paramétre (cf. classe Ingredients)
		 *   b. créer un 1er objet référencé par un 1er pointeur
		 *   c. créer un 2eme objet (sur la base du 1er objet) référencé par un 2éme pointeur
		 *   d. constater que les 2 pointeurs se référent é des objets de méme valeur
		 *   e. modifier le premier objet
		 *   f. constater que chaque pointeur se référe é des objets de valeurs différentes
		 * => Constructeur par recopie
		 */
		System.out.println("\n3. Creer un objet a l'identique d'un objet modele : constructeur par recopie");
		// a. est déjé fait : soyez tranquilles...
		// **** // b. crée le 1er pointeur    ingredient31
		Ingredient ingredient31;
		// **** // b. le 1er pointeur prend l'@ d'un ouvel objet <"milk", 31>
		ingredient31 = new Ingredient ("milk", 31);
		// **** // c. crée le 2éme pointeur   ingredient32
		Ingredient ingredient32;
		// **** // c. le 2éme pointeur prend l'@ du 2éme objet qui est construit sur la base du 1er objet, cad construit par recopie
		ingredient32 = new Ingredient (ingredient31);
		// **** // d. affichage de ce que pointe    ingredient31
		ingredient31.afficher();
		// **** // d. affichage de ce que pointe    ingredient32
		ingredient32.afficher();
		// **** // e. modification de l'un des 2 objets
		ingredient31.set_libelle("Farine");
		// **** // f. affichage de ce que pointent ingredient31 et ingredient32
		ingredient31.afficher();
		ingredient32.afficher();
		
		/* 4. Comparer deux pointeurs versus comparer deux objets
		 *  4.a Commparer 2 pointeurs
		 *      a. créer un objet référencé par un pointeur
		 *      b. copier le pointeur dans un second pointeur
		        c. observer qu'ils sont égaux (ils référencent le méme objet)
		 *  4.b Comparer 2 objets
		 *      a. créer et initialiser un premier objet référencé par un 1er pointeur
		 *      b. créer et initialiser (aux méme valeurs) un second objet référencé par un 2éme pointeur
		 *      c. comparer les pointeurs et constater qu'ils sont différentss alors que les 2 objets référencés sont identiques
		 * 	d. (c'est déjé fait) surcharger la méthode "static public boolean equals(objetModele)" (cf. classe Ingredients) de sorte
		 *      é ce que l'objet considéré compare ses attributs é ceux de l'objet modéle et retourne vrai en cas d'égalités
		 */
		System.out.println("\n4. Comparer deux pointeurs versus comparer deux objets");
		System.out.println("   4.a Comparer deux pointeurs : pointeurs egaux"); 
		// **** // a. créer un objet <"salt", 41> pointé par ingredient41
		Ingredient ingredient41;
		ingredient41 = new Ingredient ("salt", 41);
		// **** // b. copier le pointeur dans un second pointeur ingredient42
		Ingredient ingredient42;
		ingredient42 = ingredient41;
		// **** // c. observer que ingredient41 et ingredien42 sont égaux : utiliser un if
		if (ingredient42 == ingredient41){
			System.out.println("Oue c'est bon");
		}
		System.out.println("\n   4.b Comparer deux objets => la methode boolean equals(objetModele)");
		// **** // a. créer un objet pointé par ingredient43 aux valeurs <"vin", 49>
		Ingredient ingredient43;
		ingredient43 = new Ingredient ("vin", 49);
		// **** // b. créer un 2éme objet pointé par ingredient44 aux mémes valeurs <"vin", 49>
		Ingredient ingredient44 = new Ingredient ("vin", 49);
		// **** // c. observer différence d'adresse des objets, mais mêmes valeurs : utiliser des if
		if (ingredient43 == ingredient44){
			System.out.println("Oue c'est bon");
		}
		else{
			System.out.println("probleme (surement)");
		}
		if (ingredient43.equals(ingredient44)){
			System.out.println("Oue c'est bon (mais avec equals)");
		}
		else{
			System.out.println("probleme (surement (mais c'est normal))");
		}
		
		 /* 5. Paramétres des fonctions et méthodes : c'est la valeur de la variable qui est transmise
		  *   5.a Paramétre "type primitif" => modifications de la variable sans effet au niveau appelant
		  */
		System.out.println("\n5. Paramétres des fonctions et méthodes : c'est la valeur de la variable qui est transmise");
		System.out.println("     5.a Paramétre type primitif => modifications de la variable sans effet au niveau appelant");
		int unEntier = 20;
		System.out.println ("La valeur de unEntier "+unEntier+" est transmise a la fonction"); // avant  20
		// **** appeler : modifierLeParametreDeTypePrimitifInt (int);
		modifierLeParametreDeTypePrimitifInt(unEntier);
		System.out.println ("La valeur de unEntier "+unEntier+" et est INCHANGE apres la fonction"); // aprés 20 inchangé !!!
		//  5.b Paramétre "pointeur" => modification de la référence sans effet au niveau appelant
		System.out.println("\n     5.b Parametre pointeur => modification de la reference sans effet au niveau appelant");
		Ingredient ingredient00 = new Ingredient ("huile", 10);
		System.out.println ("La valeur de l'ingredient "+ingredient00.toString()+" est transmise é la fonction"); // avant <huile,10>
		// **** appeler : modifierLeParametreAdresse (Ingredient);
		modifierLeParametreAdresse (ingredient00);
		System.out.println ("La valeur de l'ingredient "+ingredient00.toString()+" apres la fonction INCHANGE"); // aprés <huile,10> inchangé !!!!
		
		//  5.c Paramétre "pointeur" => modification de l'objet référencé avec effet au niveau appelant 
		System.out.println("\n     5.c Parametre pointeur => modification de l'objet avec effet au niveau appelant");
		Ingredient ingredient11 = new Ingredient ("the", 11);
		System.out.println ("La valeur de l'objet pointe "+ingredient11.toString()+" est transmise a la fonction"); // avant <thé,10>
		// **** appeler : modifierObjetPointeParLeParametre (Ingredient);
		modifierObjetPointeParLeParametre (ingredient11);
		System.out.println ("La valeur de l'objet pointe "+ingredient11.toString()+" apres la fonction C H A N G E"); // aprés <vin,40> inchangé !!!!
	}
}