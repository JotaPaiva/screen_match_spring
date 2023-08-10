package br.com.alura.screenmatch.domain.filme;

import jakarta.persistence.*;


@Entity
@Table (name="filmes")
public class Filme {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;

    public Filme(DadosCadastraFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public Filme() {}

    @Override
    public String toString() {
        return "Filme {" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamento=" + anoLancamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public Long getId() {
        return id;
    }

}
