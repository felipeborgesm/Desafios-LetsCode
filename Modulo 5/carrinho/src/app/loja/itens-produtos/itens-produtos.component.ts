import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-itens-produtos',
  templateUrl: './itens-produtos.component.html',
  styleUrls: ['./itens-produtos.component.css']
})
export class ItensProdutosComponent implements OnInit {

  // quantidade: FormGroup;

  constructor() { 
    
  //   this.quantidade = new FormGroup({
  //     'produto': new FormControl(this.produto,
  //     [Validators.required])
  //   })
  // }
  // submit() {
  //   const quantidade = this.quantidade.get('produto')?.value;
  }

  ngOnInit(): void {
  }

}
