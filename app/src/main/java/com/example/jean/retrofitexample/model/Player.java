package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("id")
    private String id;

    @SerializedName("nama")
    private String nama;

    @SerializedName("age")
    private String age;

    @SerializedName("ikon")
    private String ikon;

    @SerializedName("team")
    private String team;

    @SerializedName("posisi")
    private String posisi;

    @SerializedName("negara")
    private String negara;

    @SerializedName("gambar")
    private String gambar;

    @SerializedName("deskripsi")
    private String deskripsi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIkon() {
        return ikon;
    }

    public void setIkon(String ikon) {
        this.ikon = ikon;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public String toString(){
        return
                "Player{" +
                        ",id = '" + id + '\'' +
                        ",nama = '" + nama + '\'' +
                        ",age = '" + age + '\'' +
                        ",ikon = '" + ikon + '\'' +
                        ",team = '" + team + '\'' +
                        ",posisi = '" + posisi + '\'' +
                        ",negara = '" + negara + '\'' +
                        ",gambar = '" + gambar + '\'' +
                        ",deskripsi = '" + deskripsi + '\'' +
                        "}";
    }
}
