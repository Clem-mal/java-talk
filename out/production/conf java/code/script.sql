CREATE TABLE USER (
    id integer,
    name VARCHAR(100),
    email VARCHAR(200),
    mot_de_passe VARCHAR(500),
    total_bouteille integer,
);

CREATE TABLE BOTTLE (
                      id integer,
                      name VARCHAR(100),
                      region_viticole VARCHAR(100),
                      nom_proprietaire VARCHAR(100),
                      nature_du_vin VARCHAR(100),
                      cepage VARCHAR(100),
                      couleur_du_vin VARCHAR(100),
                      type_de_sol VARCHAR(100),
                      type_de_recolte VARCHAR(100),
                      climat VARCHAR(100),
                      annee integer,
);