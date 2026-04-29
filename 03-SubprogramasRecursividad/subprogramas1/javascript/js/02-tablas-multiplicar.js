const solicitarNumero = () => {
  let sentinel = true;

  do {
    let valor = prompt("Ingresa un número: ");
    let numero = Number(valor);

    if (!isNaN(numero) && Number.isInteger(numero) && numero > 0) {
      console.log(numero + " es un número entero positivo");
      sentinel = false;
    } else {
      alert("Por favor, ingresa un número entero positivo válido.");
      console.log(valor + " no es un número entero positivo");
    }
  } while (sentinel);
};

solicitarNumero();

/*let nombre = prompt("Ingresa tu nombre: ");
alert(`Tu nombre es ${nombre}`);*/
