// test de la recursivite d une fonction 

asm {
	CALL (LB) _main
	HALT	
}

int fact(int n){
	if (n >= 1){
		return 1;
	}
	else {
		return n*fact(n-1);
	}
}


int main (){
	// cela nous permet aussi de tester la localite des variables des fonctions 
	int n = 5;
	
	int result = fact(n);

	return result;
}
