import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ItensProdutosComponent } from './itens-produtos.component';

describe('ItensProdutosComponent', () => {
  let component: ItensProdutosComponent;
  let fixture: ComponentFixture<ItensProdutosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ItensProdutosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ItensProdutosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
