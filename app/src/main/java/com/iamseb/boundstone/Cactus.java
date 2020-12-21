package com.iamseb.boundstone;

import android.media.Image;

//PARA HACER EL TOTAL DE LIKES SE AGREGÓ likesnum, y un id, ésto no debe estar en el constructor, pero sí generar
//getters y setters
//MODIFICAR TAMBIÉN EL ADAPTADOR DE CACTUS

public class Cactus {
    int id;
    private String nombre;
    private int foto;
    private int likes;
    private int likesnum;

    public Cactus(String nombre,int foto,int likes,int likesnum){
        this.nombre=nombre;
        this.foto=foto;
        this.likes=likes;
        this.likesnum=likesnum;
    }
    public Cactus(String nombre,int foto){
        this.nombre=nombre;
        this.foto=foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikesnum() {
        return likesnum;
    }

    public void setLikesnum(int likesnum) {
        this.likesnum = likesnum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}


