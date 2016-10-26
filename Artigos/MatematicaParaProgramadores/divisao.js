function dividir(x, y) {
  var total = x;
  var contador = 0;

  if(y !== 0){ // não existe divisão por 0
    if(x === y) { // um número dividido por ele mesmo é 1
      return 1;
    }
    while(total > 0) {
      total = total - y;
      contador = contador + 1;
    }
    return contador;
  }
  return false;
}