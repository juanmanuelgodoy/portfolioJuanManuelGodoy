export class sociales{
    id?: String;
    nombre: String;
    url: String;
    fotourl: String;

    constructor(nombre: String, url: String, fotourl: String){
        this.nombre = nombre;
        this.url = url;
        this.fotourl = fotourl;
    }
}