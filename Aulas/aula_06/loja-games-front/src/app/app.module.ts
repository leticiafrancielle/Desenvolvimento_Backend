import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardComponent } from './components/shared/card/card.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/views/home/home.component';
import { CadastroComponent } from './components/views/cadastro/cadastro.component';
import { FormsModule } from '@angular/forms';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { ModalExclusaoComponent } from './components/shared/modal-exclusao/modal-exclusao.component'

@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    HomeComponent,
    CadastroComponent,
    NavbarComponent,
    ModalExclusaoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
