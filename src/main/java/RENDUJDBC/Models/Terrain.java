package RENDUJDBC.Models;

public class Terrain {
    private int id_terrain;
    private String nom_terrain;
    private String type;

    public Terrain() {
    }

    public Terrain(int id_terrain, String nom_terrain, String type) {
        this.id_terrain = id_terrain;
        this.nom_terrain = nom_terrain;
        this.type = type;
    }

    public int getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(int id_terrain) {
        this.id_terrain = id_terrain;
    }

    public String getNom_terrain() {
        return nom_terrain;
    }

    public void setNom_terrain(String nom_terrain) {
        this.nom_terrain = nom_terrain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "id_terrain=" + id_terrain +
                ", nom_terrain='" + nom_terrain + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

