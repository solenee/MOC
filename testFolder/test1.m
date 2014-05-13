// Ce fichier contient l'erreur: une fonction declarer avec un retour mais le retour n est pas explicite

asm {
	CALL (LB) _main
	HALT
}
// passage 
int addition (int a){
	a = a + 1; 
}

int main(){
	int sholene;
	int leger = 3;
	
	sholene = addition(leger);

	return sholene; 
}
