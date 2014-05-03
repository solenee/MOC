// Dans ce test j ai pas de fonction main : je l aime bien ce test hhh

asm {
	CALL(LB) _main
	HALT
}

// fonction d affichage
void log (char *msg){
	asm {
		LOAD %msg
		SUBR Sout
		SUBR LN
		RETURN (1) 0
	}
}

// cette fonction ne fait rien de sa vie
int foo (){
	int a = 4; 
	int b = 7;
	int c = a+b;
}
