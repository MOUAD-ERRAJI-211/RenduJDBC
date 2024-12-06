package RENDUJDBC.Models;


public class TerrainBuilder {
    private int id_terrain;
    private String nom_terrain;
    private String type;

    public TerrainBuilder id_terrain(int id_terrain) {
        this.id_terrain = id_terrain;
        return this;
    }

    public TerrainBuilder nom_terrain(String nom_terrain) {
        this.nom_terrain = nom_terrain;
        return this;
    }

    public TerrainBuilder type(String type) {
        this.type = type;
        return this;
    }

    public Terrain build() {
        return new Terrain(id_terrain, nom_terrain, type);
    }
}

