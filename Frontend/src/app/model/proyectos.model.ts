export class proyectos{
    id?: String;
    titulo: String;
    descripcion: String;
    url: String;

    constructor (titulo: String, descripcion: String, url: String){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }
}