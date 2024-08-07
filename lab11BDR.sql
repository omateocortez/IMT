drop database dbpedidos;
create database dbpedidos;
use dbpedidos;
create table fabricantes (idFabricante integer not null primary key,
descricaoFabricante char(80) not null ) ;
insert into fabricantes (idFabricante, descricaoFabricante) values
(10, 'Acer'),
(20, 'Adata'),
(30, 'Asus'),
(40, 'Corsair'),
(50, 'Dell'),
(60,'Intel'),
(70,'HP'),
(80,'Logitech'),
(90, 'Samsung'),
(100, 'Seagate'),
(110, 'Western Digital'),
(120, 'Xiaomi');
select * from fabricantes;
create table vendedores (idVendedor integer not null primary key,
nomeVendedor char(80) not null, cpfVendedor char(14) not null unique,
quotaVendas decimal(8,2) not null);
insert into vendedores (idVendedor, nomeVendedor, cpfVendedor,
quotaVendas) values
(1000, "Paulo de Souza Alves", "234.876.855-10", 10000.00),
(1001, "Ana da Silva", "666.876.855-10", 5600.00),
(1002, "Pedro Candido", "444.876.855-10", 6800.00),
(1010, "Antonio Alves", "269.876.855-45", 9875.00),
(1021, "Henrique Souza Alves", "903.876.855-42", 24000.00),
(1032, "Beatriz Silva Santos", "084.457.123-42", 6800.90),
(1034, "Fernando Xavier Santos", "991.670.120-77", 9980.80),
(1045, "Pedro Diógenes Santos", "042.668.234-22", 5670.70),
(1056, "Sandro Gimenez", "816.803.129-33", 3670.50),
(1067, "Carlos Eduardo Bognar", "775.662.127-33", 2300.00),
(1068, "Mauro Favoretto", "225.662.127-33", 6780.00),
(1078, "Maria Aparecida Flores", "388.800.120-49", 23700.80),
(1081, "Saulo de Souza", "691.389.114-91", 10790.50),
(1098, "Ivo de Alcantara", "892.339.966-66", 12876.40),
(1099, "Carlos Alberto de Macedo", "447.100.590-19", 7654.00),
(1101, "Renato Carioca", "778.124.801-17", 20780.50);
select * from vendedores;
create table clientes (idcliente integer not null primary key, nomeCliente
char(80) not null, cpfCliente char(14) not null unique, foneCliente
char(20) null);
insert into clientes (idCliente, nomeCliente, cpfCliente, foneCliente)
values
(9000, "Pedro de Souza Alves", "666.876.855-10", "011 9 6546-0099"),
(9010, "Beatriz Souza", "124.871.855-10", "011 9 6790-0356"),
(9020, "Carlos Bognar Xavier", "098.876.855-10", "011 9 1234-8711"),
(9025, "Marcelo Alves", "230.876.855-45", "011 9 2356-0976"),
(9026, "Silvio Matheus Alves", "120.876.855-42", "011 9 3456-9855"),
(9028, "Carolina Silva Santos", "665.457.123-42", "011 9 3377-0978"),
(9030, "Ricardo Xavier Santos", "092.670.120-77", "011 9 2256-8872"),
(9035, "Paulo Freitas Silas", "873.668.234-22", "011 9 0987-1233"),
(9040, "Carla Andrade", "129.803.129-33", "011 9 9988-4780"),
(9041, "Benedito Silva Bognar", "270.662.127-33", "011 9 8870-2344"),
(9042, "Silton Favoretto", "309.662.127-33", "011 9 9866-9988"),
(9043, "Sueli Candida Flores", "129.800.120-49", "011 9 9990-5567"),
(9050, "Silas de Andrade", "855.389.114-91", "011 9 9888-3455"),
(9060, "Renato de Savio", "669.339.966-66", "011 9 9984-3481"),
(9065, "Adelsi Alberto de Macedo", "113.100.590-19", "011 9 8722-0981"),
(9070, "Karen Andrade", "008.124.801-17", "011 9 9000-3466");
select * from clientes;
create table pedidos (idPedido integer not null primary key, dataPedido
date not null, valorPedido decimal (8,2) not null, idCliente integer not
null, idVendedor integer not null,
foreign key(idCliente) references clientes(idCliente) ,
foreign key(idVendedor) references vendedores(idVendedor));
insert into pedidos (idPedido, dataPedido, valorPedido, idCliente,
idVendedor) values
(10, '2020-10-10', 23000.60, 9000, 1056),
(20, '2019-11-01', 1200.60, 9010, 1000),
(30, '2018-12-02', 134.60, 9010, 1001),
(40, '1017-01-03', 500.60, 9010, 1002),
(50, '2020-02-04', 4569.00, 9020, 1002),
(60, '2020-03-05', 23000.60, 9025, 1021),
(70, '2020-03-06', 6000.60, 9028, 1032),
(80, '2020-04-07', 8800.60, 9035, 1032),
(90, '2020-04-08', 7650.60, 9035, 1032),
(100, '2020-05-09', 9875.30, 9040, 1034),
(110, '2020-05-11', 1230.60, 9040, 1045),
(120, '2020-06-11', 9876.60, 9040, 1056),
(130, '2020-06-12', 8765.60, 9041, 1067),
(140, '2020-07-13', 5432.60, 9042, 1068),
(150, '2020-08-14', 3210.60, 9042, 1078),
(160, '2020-09-15', 2109.60, 9043, 1081),
(170, '2020-10-16', 8765.60, 9050, 1098),
(180, '2020-10-17', 6543.60, 9050, 1099),
(190, '2020-11-20', 4321.80, 9060, 1099),
(200, '2020-12-25', 8631.00, 9060, 1099);
select * from pedidos;
create table produtos (idProduto integer not null primary key,
descProduto char(80) not null, idFabricante integer not null,
foreign key(idFabricante) references fabricantes(idFabricante) );
insert into produtos (idProduto, descProduto, idFabricante) values
(200, 'Monitor', 90),
(201, 'Caixa de Som', 80),
(202, 'Placa de Vídeo', 40),
(203, 'Placa de Vídeo', 20),
(204, 'Notebook', 10),
(205, 'Notebook', 30),
(206, 'Notebook', 90),
(207, 'Teclado', 40),
(208, 'Teclado', 80),
(209, 'Teclado', 70),
(210, 'Impressora', 70),
(211, 'Fone de Ouvido', 70),
(212, 'Fone de Ouvido', 120),
(213, 'Fone de Ouvido', 40),
(214, 'Headset', 40),
(215, 'Headset', 70),
(216, 'Headset', 80),
(217, 'Cooler', 40),
(218, 'Disco Rígigo', 40),
(219, 'Disco Rígido', 100),
(220, 'Computador Gamer', 10),
(221 ,'Computador Gamer', 50),
(222, 'Computador Gamer', 70);
select * from produtos;
create table itensPedidos (idPedido integer not null, idProduto
integer not null, qtdePedida integer not null,
primary key(idPedido, idProduto, qtdePedida),
foreign key(idPedido) references pedidos(idPedido),
foreign key(idProduto) references produtos(idProduto) );
insert into itensPedidos (idPedido, idProduto, qtdePedida) values
(10, 200, 10),
(10, 210, 5),
(10, 207, 2),
(20, 207, 10),
(20, 208, 40),
(30, 214, 60),
(30, 215, 40),
(40, 220, 5),
(50, 200, 10),
(50, 201, 4),
(60, 212, 50),
(60, 214, 7),
(70, 219, 10),
(80, 218, 5),
(80, 221, 60),
(90, 215, 10),
(90, 216, 16),
(100, 220,10),
(100, 221, 40),
(110, 215, 7),
(110, 209, 12),
(120, 204, 10),
(120, 205, 6),
(120, 206, 8),
(130, 211, 30),
(140, 212, 60),
(140, 213, 6),
(140, 200, 10),
(140, 201, 20),
(150, 218, 40),
(160, 218, 50),
(170, 205, 10),
(170, 206, 40),
(180, 208, 50),
(190, 209, 30),
(200, 202, 10),
(200, 203, 40);
select * from itensPedidos;
-- exercício 1
select idPedido, dataPedido, valorPedido from Pedidos join Clientes on Pedidos.idCliente = Clientes.idCliente where nomeCliente = "Pedro de Souza Alves";
-- exercício 2
select idPedido, descProduto from itensPedidos join Produtos on itensPedidos.idProduto = Produtos.idProduto where idPedido = 10;
-- exercício 3
select p.idPedido, v.nomeVendedor from Pedidos p join Vendedores v on p.idVendedor = v.idVendedor;
-- exercício 4
select p.idPedido, c.nomeCliente from Clientes c left join Pedidos p on p.idCliente = c.idCliente;
-- exercício 5
select p.idPedido, p.dataPedido, p.valorPedido, v.nomeVendedor from Pedidos p
inner join Clientes c on p.idCliente = c.idCliente
inner join Vendedores v on p.idVendedor = v.idVendedor
where c.nomeCliente = "Pedro de Souza Alves" and v.nomeVendedor like "S%";
-- exercício 6
select p.idPedido, p.dataPedido, p.valorPedido, c.nomeCliente, f.descricaoFabricante from Pedidos p 
join Clientes c on p.idCliente = c.idCliente
join itensPedidos i on i.idPedido = i.idPedido
join Produtos pr on i.idProduto = pr.idProduto
join Fabricantes f on f.idFabricante = pr.idFabricante
where c.nomeCliente = "Beatriz Souza" and f.descricaoFabricante in ("HP", "Acer", "Corsair");
-- exercício 7
select p.idPedido, v.nomeVendedor, c.nomeCliente from Pedidos p
join Vendedores v on p.idVendedor = v.idVendedor
join Clientes c on p.idCliente = c.idCliente;
-- exercício 8
select idPedido, dataPedido, valorPedido from Pedidos where valorPedido > ( select AVG(valorPedido) from Pedidos);
-- exercício 8A
select p.idPedido, c.nomeCliente, f.descricaoFabricante from Clientes c
join Pedidos p on p.idCliente = c.idCliente
join itensPedidos i on i.idPedido = p.idPedido
join Produtos pr on pr.idProduto = i.idProduto
join Fabricantes f on f.idFabricante = pr.idFabricante
where f.descricaoFabricante in ("Acer", "Xiaomi");
-- exercício 8B
select p.idPedido, v.nomeVendedor, c.nomeCliente from Pedidos p
right join Vendedores v on p.idVendedor = v.idVendedor 
right join Clientes c on p.idCliente = c.idCliente;
-- exercício 9
select pr.descProduto, c.nomeCliente, v.nomeVendedor from Pedidos p
join Clientes c on p.idCliente = c.idCliente
join Vendedores v on p.idVendedor = v.idVendedor
join itensPedidos ip on p.idPedido = ip.idPedido
join Produtos pr on ip.idProduto = pr.idProduto
where c.nomeCliente like '%Silva' or c.nomeCliente like '%Souza'
and v.nomeVendedor like'%Silva' or v.nomeVendedor like '%Souza' or v.nomeVendedor like '%Santos';
-- exercício 10
select p.idPedido, p.dataPedido, p.valorPedido from Pedidos p
inner join Clientes c on p.idCliente = c.idCliente
inner join Vendedores v on p.idVendedor = v.idVendedor
where c.nomeCliente = "Pedro de Souza Alves" and v.quotaVendas > 10.000;
-- exercício 11: DESCONSIDERADO
-- exercício 12
select p.idPedido, v.nomeVendedor, pr.descProduto, f.descricaoFabricante from Pedidos p
join Vendedores v on v.idVendedor = p.idVendedor 
join itensPedidos i on i.idPedido = p.idPedido
join Produtos pr on pr.idProduto = i.idProduto
join Fabricantes f on f.idFabricante = pr.idFabricante
where descProduto like "%Computador%" and f.descricaoFabricante in ("Acer", "Dell");
-- exercício 13
select descProduto from Produtos pr
join itensPedidos i on i.idProduto = pr.idProduto
join Pedidos p on i.idPedido = p.idPedido
join Clientes c on c.idCliente = p.idCliente
where c.nomeCliente = "Pedro de Souza Alves" and qtdePedida > 2;
-- exercício 14
select idPedido, dataPedido, valorPedido, c.nomeCliente, v.quotaVendas from Pedidos p
join Clientes c on c.idCliente = p.idCliente
join Vendedores v on v.idVendedor = p.idVendedor
where c.nomeCliente like "%Andrade" and v.quotaVendas < 10000;