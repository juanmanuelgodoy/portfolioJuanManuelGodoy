import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { LogoArgProgramaComponent } from './componentes/logo-arg-programa/logo-arg-programa.component';
import { SocialesComponent } from './componentes/sociales/sociales.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { AcercaDeComponent } from './componentes/acerca-de/acerca-de.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoArgProgramaComponent,
    SocialesComponent,
    BannerComponent,
    AcercaDeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
