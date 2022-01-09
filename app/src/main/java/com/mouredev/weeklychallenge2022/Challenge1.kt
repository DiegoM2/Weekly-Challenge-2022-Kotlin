package com.mouredev.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🗓reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


fun comprobadorAnagrama(firstWord:String, palabraDos:String): Boolean{ 
    if(firstWord == palabraDos){ //Si las dos palabras ingresadas son exactamente iguales, no es anagrama. 
        return false; 
    } 
    var arrOriginalWords : Array<String> = arrayOf(firstWord, palabraDos); 
    var arrModifiedWords = ArrayList<String>(); 
    
    for (i in arrOriginalWords.indices){ 
        arrModifiedWords.add(arrOriginalWords[i].lowercase().replace("\\s".toRegex(),"").toCharArray().sorted().joinToString("")); 
    } 
    
    if(arrModifiedWords[0] == arrModifiedWords[1]){ 
        println("SON UN ANAGRAMA!!") 
        return true; 
    } 
    else{ 
        println("No son anagrama ;_;") 
        return false; 
    } 
} 

/* 
    La mona lisa -  amilla asno (Anagrama!) 
    Romanos - Son amor (Anagrama!) 
    Lamina - Animal (Anagrama!) 
    Esponja - Japonés (Anagrama!) 
 */ 

var firstWord = "Lamina"; 
var secondWord = "Animal"; 


fun main() {
    comprobadorAnagrama(firstWord, secondWord); 
}
