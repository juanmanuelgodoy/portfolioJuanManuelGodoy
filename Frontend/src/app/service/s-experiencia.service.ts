import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Experiencia } from '../model/experiencia';

@Injectable({
  providedIn: 'root'
})
export class SExperienciaService {
  
  expURL = 'http://localhost:8080/explab/'

  constructor(private hhtpClient: HttpClient) { }

  public lista(): Observable<Experiencia[]>{
    return this.hhtpClient.get<Experiencia[]>(this.expURL + 'lista');
  }

  public detail(id: string): Observable<Experiencia>{
    return this.hhtpClient.get<Experiencia>(this.expURL +'detail/${id}');
  }

  public save(experiencia: Experiencia): Observable<any>{
    return this.hhtpClient.post<any>(this.expURL + 'create', experiencia);
  }

  public update(id: string, experiencia: Experiencia): Observable<any>{
    return this.hhtpClient.put<any>(this.expURL + 'update/${id', experiencia);
  }

  public delete(id: string): Observable<any>{
    return this.hhtpClient.delete<any>(this.expURL + 'delete/${id}');
  }

}

