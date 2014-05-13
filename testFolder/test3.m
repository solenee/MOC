// ce code contient les erreurs de typage
// Mais en fait en c on peut affecter les int au char et char au int : tester // Toutefois il faut penser au conversion de valeur de char a int et vice vers ca

// je suggere qu on ajoute les float ca sera plus amusant :)

// verification que les // sont pris en consideration 

// pour les erreurs de typage :p je n en vois pas encore pour le moment  

// L
//  comparatibilite depend de la taille de la variable 
	// Pour les pointeurs c est pas la meme chose on compare la taille des types des deux pointeurs  

asm {
	CALL (LB) _main 
	HALT
}

int main() {

	int * p = malloc (1);
	int * q = malloc (2);

	p = q;
	// erreur puisque la taille de q est plus grande que p	
		

	return 1;
}


































































