
console.warn("Funciones tradicionales");
/*
function saludar() {
    console.log("Hola JavaScript");
}

function saludar2(nombre) {
    console.log(`Hola ` + nombre);
}

function sumar(a, b) {
    return a + b;
}

function multiplicar(a, b) {
    return 'La multiplicación de ' + a + ' x ' + b + ' = ' + (a * b);
}

function dividir(a, b) {
    if (b == 0) {
        console.warn("No se puede dividir por cero");
        return;
    }
    
    return `La división de ${a} / ${b} = ${a / b}`;
}

saludar();
saludar2('Luis');

let suma = sumar(3, 4);
console.log({suma});

const mensaje = multiplicar(5, 6);
console.log({mensaje});
//console.log(suma);

*/


console.warn("Funciones anónimas");

const sumar = function(a, b) {
    return a + b;
}


const saludar = function() {
    console.log("Hola");
}


const dividir = function(a, b) {
    return (b === 0) ? 0 : (a/b);
}


let suma1 = sumar(9, 8);
let saludo = saludar();
let dividir1 = dividir(10, 3);



console.warn("Arrow functions (funciones flecha)");

const mensaje3 = () => {
 return "Hola mundo desde la función flecha";   
}



const saludar3 = (nombre) => {
    return `Hola! Cómo estás ${nombre}?`;
}


const dividir3 = (a, b) => {
    return (b === 0) ? 0 : (a/b);
}


console.log(mensaje3());
console.log(saludar3("Floriberto"));
console.log("dividir: " +dividir3(10, 20));
