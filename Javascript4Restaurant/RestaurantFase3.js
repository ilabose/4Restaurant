var monetas, sino, taglio5, taglio10, taglio20, taglio50, taglio100, taglio200, taglio500;
var preu_total=0;
var arrayMenu = [];
var arrayPrecio = [];
var pedido = [];
var risposta="";
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
for(var i=0; i<pedido.length; i++){
    for(var j=0; j<arrayMenu.length; j++){
        if(pedido[i]==arrayMenu[j]){
            preu_total = preu_total + arrayPrecio[j];
            j=arrayMenu.length;
        }else if(j == arrayMenu.length-1){
            document.write("</br>El producte que heu demanat(" + pedido[i]+ ") no existeix:");
        }
    }
}
document.write("</br>El preu total de la vostra comanda és de: "+ preu_total);
preuTotal = parseInt(preu_total);
taglio500 = parseInt(preuTotal / 500); preuTotal = parseInt(preuTotal%500);
taglio200 = parseInt(preuTotal / 200); preuTotal = parseInt(preuTotal%200);
taglio100 = parseInt(preuTotal / 100); preuTotal = parseInt(preuTotal%100);
taglio50 = parseInt(preuTotal / 50); preuTotal = parseInt(preuTotal%50);
taglio20 = parseInt(preuTotal / 20); preuTotal = parseInt(preuTotal%20);
taglio10 = parseInt(preuTotal / 10); preuTotal = parseInt(preuTotal%10);
taglio5 = parseInt(preuTotal / 5); 
monetas = parseInt(preuTotal%5);

document.write("</br>Es pot pagar amb els següents bitllets: </br>"+
    "n° " + taglio500 + " de 500\</br>"+
    "n° " + taglio200 + " de 200\</br>"+
    "n° " + taglio100 + " de 100\</br>"+
    "n° " + taglio50 + " de 50\</br>"+
    "n° " + taglio20 + " de 20\</br>"+
    "n° " + taglio10 + " de 10\</br>"+
    "n° " + taglio5 + " de 5\</br>"+
    "n° " + monetas + " de monedes");