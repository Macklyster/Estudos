function multiplicar(x, y) {
	var total = 0;
	var contador = 0;
	while(x){
		total = somar(total, y)
		x = subtrair(x,1);
	}
	return total;
}