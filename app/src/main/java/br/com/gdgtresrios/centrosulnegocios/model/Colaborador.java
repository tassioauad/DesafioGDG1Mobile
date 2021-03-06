package br.com.gdgtresrios.centrosulnegocios.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Colaborador implements Parcelable {
    private Long id;
    private String nome;
    private String descricao;
    private String logo;
    private String descricaoDetalhada;
    private String enderecoVirtual;
    private String email;
    private String telefone;
    private String endereco;
    private Boolean patrocinador;
    private Boolean palestrante;
    private Boolean expositor;
    private CategoriaColaborador categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public String getEnderecoVirtual() {
        return enderecoVirtual;
    }

    public void setEnderecoVirtual(String enderecoVirtual) {
        this.enderecoVirtual = enderecoVirtual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Boolean patrocinador) {
        this.patrocinador = patrocinador;
    }

    public Boolean getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Boolean palestrante) {
        this.palestrante = palestrante;
    }

    public Boolean getExpositor() {
        return expositor;
    }

    public void setExpositor(Boolean expositor) {
        this.expositor = expositor;
    }

    public CategoriaColaborador getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaColaborador categoria) {
        this.categoria = categoria;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.nome);
        dest.writeString(this.descricao);
        dest.writeString(this.logo);
        dest.writeString(this.descricaoDetalhada);
        dest.writeString(this.enderecoVirtual);
        dest.writeString(this.email);
        dest.writeString(this.telefone);
        dest.writeString(this.endereco);
        dest.writeValue(this.patrocinador);
        dest.writeValue(this.palestrante);
        dest.writeValue(this.expositor);
        dest.writeParcelable(this.categoria, flags);
    }

    public Colaborador() {
    }

    private Colaborador(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.nome = in.readString();
        this.descricao = in.readString();
        this.logo = in.readString();
        this.descricaoDetalhada = in.readString();
        this.enderecoVirtual = in.readString();
        this.email = in.readString();
        this.telefone = in.readString();
        this.endereco = in.readString();
        this.patrocinador = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.palestrante = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.expositor = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.categoria = in.readParcelable(CategoriaColaborador.class.getClassLoader());
    }

    public static final Parcelable.Creator<Colaborador> CREATOR = new Parcelable.Creator<Colaborador>() {
        public Colaborador createFromParcel(Parcel source) {
            return new Colaborador(source);
        }

        public Colaborador[] newArray(int size) {
            return new Colaborador[size];
        }
    };
}
