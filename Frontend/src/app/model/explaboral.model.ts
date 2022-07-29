export class explaboral{
    id?: String;
    puesto: String;
    descripcion: String;
    empresa: String;
    fechainicio: Date;
    fechafin: Date;
    fotourl: String;

    constructor(puesto: String, descripcion: String, empresa: String, fechainicio: Date, fechafin: Date, fotourl: String){
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.fotourl = fotourl;
    }

}