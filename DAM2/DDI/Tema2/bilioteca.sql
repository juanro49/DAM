CREATE DATABASE biblioteca;
USE biblioteca;


CREATE TABLE socios (    
    nif VARCHAR(9) PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    apellido VARCHAR(25),  
    edad INT NOT NULL,
    profesion VARCHAR(50) NOT NULL,    
    correo VARCHAR(50),
);

CREATE TABLE libros (        
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,  
    ISBN VARCHAR(9) PRIMARY KEY,  
    numEjemplares INT NOT NULL,   
);

CREATE TABLE prestamos (
    socio VARCHAR(9),    
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    libro VARCHAR(9),
    fecha DATE,
    constraint primary key pk_prestamos (socio, libro, fecha),
    FOREIGN KEY (socio) REFERENCES socios(nif),
    FOREIGN KEY (libro) REFERENCES libros(ISBN)
);

insert into socios(nif,nombre, apellido, edad, profesion, correo) values
('22222222z','Jesus', 'avila', '20', 'estudiante', ''),
('33333333x','Alberto', 'cantero', '20', 'estudiante', ''),
('44444444c','Javier', 'cespedes', '23', 'estudiante', ''),
('77777777y','juan jesus', 'gil', '23', 'estudiante', ''),
('121212121W','Sergio', 'sanchez', '24', 'estudiante', ''),
('36877887t','Ana', 'Hernandez', '28', 'abogado', ''),
('55555555t','Jesus', 'fernandez', '34', 'medico', ''),
('666666u','Juan roberto', 'garcia', '34', 'ingeniero', ''),
('56565656Z','Joaquin', 'rivero', '34', 'programador', ''),
('98989898l','Pedro', 'Jimenez', '34', 'analista', ''),
('54545454N','Alberto', 'sierra', '34', 'ingeniero', ''),
('11111111z','Maria', 'Duque', '35', 'profesor', 'mariaavanza001@mail.com'),
('99999999p','Cristian', 'guerrero', '35', 'profesor', ''),
('78787878G','David', 'ortega', '35', 'abogado', ''),
('88888888o','Diego', 'gomez', '40', 'pintor', ''),
('09090909r','Miguel angel', 'manzano', '40', 'medico', ''),
('67676767V','Jose angel', 'rey', '55', 'pintor', ''),
('76767676f','Jesus', 'hidalgo', '65', 'jubilado', ''),
('43434334V','Alberto', 'sanchez', '75', 'jubilado', '');

insert into libros(titulo, autor, ISBN, numEjemplares) values
('El arte de amar', 'Erich Fromm', '9890', '5'),
('Moby Dick', 'Herman Melville', '11111', '5'),
('El principito', 'Antoine de Saint-Exupéry', '11112', '5'),
('La Divina Comedia', 'Dante Alighieri', '11121', '5'),
('Huckleberry Finn ', 'Mark Twain', '11211', '7'),
('Inteligencia Emocional', 'Daniel Goleman', '12111', '5'),
('Hamlet', 'William Shakespeare', '12213', '5'),
('Don Quijote de la Mancha', 'Miguel de Cervantes', '12222', '10'),
('Los pilares de la tierra', 'Ken Follet', '15555', '10'),
('Middlemarch', 'George Eliot', '16666', '5'),
('Pulp', 'Charles Bukowski', '17777', '5'),
('The Hobbit', 'Tolkien', '21222', '7'),
('Cien años de soledad', 'Gabriel García Márquez', '22122', '10'),
('Diez Negritos', 'Agatha Christie', '22212', '5'),
('El diario de Ana Frank', 'Ana Frank', '22221', '5'),
('El Gran Gatsby', 'F. Scott Fitzgerald', '31333', '5'),
('En busca del tiempo perdido', 'Marcel Proust', '32321', '6'),
('El guardián entre el centeno', 'J. D. Salinger', '33133', '10'),
('Viaje al centro de la Tierra ', 'Julio Verne', '33313', '5'),
('Origen de las especies', 'Charles Darwin', '33331', '5'),
('El retrato de Dorian Gray', 'Oscar Wilde', '41444', '5'),
('El viejo y el mar', 'Ernest Hemingway', '44144', '5'),
('Crimen y castigo', 'Fiódor Dostoievski', '44414', '5'),
('El error de Descartes', 'Antonio Damasio', '44441', '5'),
('La insoportable levedad del ser', 'Milan Kudera', '45371', '6'),
('El viaje a la felicidad: Las nuevas claves cientificas', 'Eduard Punset', '45653', '3'),
('Matar un ruiseñor ', 'Harper Lee', '51555', '5'),
('Ulises', 'James Joyce', '54451', '3'),
('Los miserables ', 'Victor Hugo', '55155', '5'),
('El hombre sin atributos', 'Robert Musli', '55551', '5'),
('Madame Bovary', 'Gustave Flaubert', '55555', '5'),
('Guerra y Paz ', 'León Tolstói', '56489', '6'),
('Sueño en el Pabellón Rojo', 'Cao Xueqin', '61666', '5'),
('Lolita', 'Vladimir Nabokov', '66166', '5'),
('El proceso', 'Franz Kafka', '66616', '5'),
('Todos sobre Zanzíbar', 'John Brunner', '66661', '5'),
('El pentateuco de Isaac', 'Angel Wagenstein', '66666', '5'),
('American Gods', 'Neil Gaiman', '71777', '5'),
('Anatomía del amor', 'Helen Fisher', '76890', '3'),
('Crónicas Marcianas', 'Ray Bradbury', '77177', '5'),
('Alta fidelidad', 'Nick Hornby', '77717', '5'),
('Soy un gato', 'Natsume Soseki', '77777', '5'),
('El nombre de la rosa ', 'Umberto Eco', '78653', '5'),
('El lobo estepario', 'Hermann Hesse', '78905', '3'),
('Orgullo y prejuicio', 'Jane Austen', '78906', '5'),
('Lo que el viento se llevó', 'Margaret Mitchell', '89765', '5'),
('Robinson Crusoe', 'Daniel Defoe', '89980', '7'),
('Historia de dos ciudades ', 'Charles Dickens', '97151', '10'),
('Hábitos de la gente altamente efectiva ', 'Stephen R. Covey', '98765', '5');

insert into prestamos(socio, titulo, autor, libro, fecha) values
('44444444c', 'El proceso', 'Franz Kafka', '66616', '2019-01-31'),
('121212121W', 'El lobo estepario', 'Hermann Hesse', '78905', '2019-01-31'),
('121212121W', 'El viejo y el mar', 'Ernest Hemingway', '44144', '2019-01-31'),
('56565656Z', 'El viejo y el mar', 'Ernest Hemingway', '44144', '2019-01-31'),
('56565656Z', 'El lobo estepario', 'Hermann Hesse', '78905', '2019-01-31'),
('56565656Z', 'Lolita', 'Vladimir Nabokov', '66166', '2019-01-31'),
('54545454N', 'El viejo y el mar', 'Ernest Hemingway', '44144', '2019-01-31'),
('54545454N', 'El proceso', 'Franz Kafka', '66616', '2019-01-31'),
('11111111z', 'El viejo y el mar', 'Ernest Hemingway', '44144', '2019-01-31'),
('11111111z', 'Soy un gato', 'Natsume Soseki', '77777', '2019-01-31'),
('76767676f', 'El lobo estepario', 'Hermann Hesse', '78905', '2019-01-31'),
('76767676f', 'El viejo y el mar', 'Ernest Hemingway', '44144', '2019-01-31'),
('76767676f', 'El proceso', 'Franz Kafka', '66616', '2019-01-31');

