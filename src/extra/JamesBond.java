package extra;

public class JamesBond {
	
	
JamesBond(){

}
int guess(Vault v){
	
for (int i = 0; i < 999999999; i++) {
if(v.tryCode(i)) 	{
	return i;
	
}
}
return -1;	
	
	
	
}


}

