export class Jogo {
    public id!: number;
    public nome!: string;
    public descricao!: string;
    public preco!: number;
    public imagem!: string;

    constructor(id: number, nome: string, descricao:string, preco:number, imagem:string ){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    
      }
}
