package me.dio.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user") //Indica que a classe é uma entidade. Ou seja, a classe será mapeada para uma tabela do bd
public class User {

    @Id //Chave primária da identidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Define como o valor do identificador sera gerado. GenerationType permite que o jpa escolha a estratégia de geração mais apropriada
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL) //Relação de um para um no banco de dados
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

}