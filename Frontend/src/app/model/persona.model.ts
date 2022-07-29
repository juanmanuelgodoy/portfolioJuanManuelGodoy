export class persona{

    id?: String;
    nombre: String;
    apellido: String;
    email: String;
    titulo: String;
    telefono: String;
    ubicacion: String;
    acerca: String;
    fotourl: String;
    coverurl: String;
    username: String;
    password: String;

    constructor (nombre: String, apellido: String, email: String, titulo: String, telefono: String,
        ubicacion: String, acerca: String, fotourl: String, coverurl: String, username: String, password: String) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.titulo = titulo;
            this.telefono = telefono;
            this.ubicacion = ubicacion;
            this.acerca = acerca;
            this.fotourl = fotourl;
            this.coverurl = coverurl;
            this.username = username;
            this.password = password;            
    }
}