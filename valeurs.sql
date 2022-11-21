DROP TABLE IF EXISTS watched;
DROP TABLE IF EXISTS toWatch;

DROP TABLE IF EXISTS movie;



CREATE TABLE `movie` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) UNIQUE NOT NULL,
  `director` VARCHAR(100),
  `description` VARCHAR(500) NOT NULL,
  `image` VARCHAR(500),
   PRIMARY KEY (`id`));

     
INSERT INTO `movie` (`title`, `director`, `description`, `image`) VALUES  ('Pulp Fiction',  "Quentin Tarentino", "L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent. Dans un restaurant, un couple de jeunes braqueurs, Pumpkin et Yolanda, discutent des risques que comporte leur activité. Deux truands, Jules Winnfield et son ami Vincent Vega, qui revient d'Amsterdam, ont pour mission de récupérer une mallette au contenu mystérieux et de la rapporter à Marsellus Wallace.", 'https://retourverslecinema.com/wp-content/uploads/2013/09/Pulp-fiction-1994.jpg');
INSERT INTO `movie` (`title`, `director`, `description`, `image`) VALUES ('La colline a des yeux', 'Alexandre Aja', "Pour fêter leur anniversaire de mariage et resserrer du même coup des liens familiaux qui battent de l'aile, toute la famille Carter monte en voiture. Destination : la Californie. Sur les conseils d'un pompiste pas très net, ils vont prendre un raccourci dans le désert du Nouveau-Mexique qui les conduira vers les pires cauchemars.",'https://fr.web.img5.acsta.net/medias/nmedia/18/36/20/39/18609535.jpg');

CREATE TABLE `watched`(
  `id`INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`id`),
     FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
    );
    );

  CREATE TABLE `toWatch`(
  `id`INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));

