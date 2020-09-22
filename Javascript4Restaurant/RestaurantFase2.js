var monetas, sino, taglio5, taglio10, taglio20, taglio50, taglio100, taglio200, taglio500;
var preu_total=0;
var arrayMenu = [];
var arrayPrecio = [];
var pedido = [];
document.write("El menu del dia es: <p>");
for(var i=0; i<5; i++){ 
    if(i==0){
        arrayMenu.push("Paella");
        arrayPrecio.push(15.50);
    }else if(i==1){
        arrayMenu.push("Calamars");
        arrayPrecio.push(12.50);
    }else if(i==2){
        arrayMenu.push("Bacalla");
        arrayPrecio.push(10.50);
    }else if(i==3){
        arrayMenu.push("Amanida");
        arrayPrecio.push(5.50);
    }else if(i==4){
        arrayMenu.push("Crema catalana");
        arrayPrecio.push(3.50);
    }
    document.write(arrayMenu[i] +" "+ arrayPrecio[i] + " Euro" + "</br>");
}
var risp=true;
var k=0;
var sino="";
var risposta="";
while(risp){
    if(k==0) {
        risposta = prompt("Introducir un plato: ");
        k++;
    }else{ 
        risposta = prompt("Introducir un otro plato: ");
    }
    pedido.push(risposta);
    sino = prompt("Quereis pedir otro plato ? (ingrese 1 para si o 2 para no)");
    if(sino=="2"){
        risp = false;
    } 
}
document.write("</br>" + "Vas demanar: ");  
document.write(pedido + "</br>");