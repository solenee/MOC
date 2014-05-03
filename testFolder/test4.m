// la verification que le if fonctionne à merveille 

asm {
	CALL (LB)  _main 
	HALT
}

int main (){
	int a = 4;
	if (a){
		log ("voila le if reconnait un true ");	
	}
	else {
		log ("voila le if reconnait un false ");	
	}
}
