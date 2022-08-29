export class educacion{
    id?: String;
    titulo: String;
    fechafin: Date;
    institucion: String;
    institucionurl: String;
    fotourl: String;

    constructor (titulo: String, fechafin: Date, institucion: String, institucionurl: String, fotourl: String){
        this.titulo = titulo;
        this.fechafin = fechafin;
        this.institucion = institucion;
        this.institucionurl = institucionurl;
        this.fotourl = fotourl;
    }

}