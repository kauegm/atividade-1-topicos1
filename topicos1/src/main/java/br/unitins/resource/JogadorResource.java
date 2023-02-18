package br.unitins.resource;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import br.unitins.model.Jogador;

public class JogadorResource {
    
    @GET
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
    public Jogador test(){

        Jogador p = new Jogador();

        p.setNome("Messi");
        p.setIdade(35);
        p.setAltura(1.70);
        p.setClube("PSG");
        p.setNacionalidade("Argentino");

        return p;
    }

    @GET
    @Path("/test")
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)

    public List<Jogador> getLista(){

        List<Jogador> lista = new ArrayList<Jogador>();
        Jogador l = new Jogador();

        l.setNome("Neymar");
        l.setIdade(30);
        l.setAltura(1.75);
        l.setClube("PSG");
        l.setNacionalidade("Brasileiro");

        lista.add(l);

        return lista;
    }

    @POST
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional

    @Path("/addJogador")
    public Jogador insert(Jogador j){

        return j;
    }
    @GET
    @Path("/menu")
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)

    public List<Jogador> getJogador(){

        return Jogador.findAll().list();

    }
}
