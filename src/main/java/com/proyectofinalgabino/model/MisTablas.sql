create table artista (idArtista integer primary key
                auto_increment,
                nombre varchar(80),
		genero varchar(80));

create table album (idAlbum integer primary key
            	auto_increment,
	   	idArtista integer,
            	nombre varchar(80),
		año integer,
            	foreign key (idArtista) references artista(idArtista));

create table precio (idPrecio integer primary key
            	auto_increment,
		idAlbum integer,
            	precio float,
            	foreign key (idAlbum) references album(idAlbum));

