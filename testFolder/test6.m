// test de l affectation de variables non encore initialisee 

asm {
	CALL (LB) _main
	HALT	
}

int main (){
	int nonInitVar;
	int initVar = nonInitVar + 2;

	int * point1; 
	point1* = 23;

	int * point2 = NULL;
	point2* = 212;

	int * point3 = (int *) malloc (1);
	point3 * = 12; 
	point3   = NULL;
	point3 * = 43;   


	return 0;
}
