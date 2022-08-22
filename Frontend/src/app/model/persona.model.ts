export class persona{

    id?: string;
    nombre: string;
    apellido: string;
    acerca: string;

    constructor (nombre: string, apellido: string, acerca: string) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.acerca = acerca;
        
    }
}