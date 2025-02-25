use caixatotem2;

insert into conta(nome, login, senha, pontos) values
	("Viktor","slippinjimmy@gmail.com",md5("D&M22157"),100),
    ("Raiam","RaiBritto@gmail.com",md5("2069@"),0),
    ("Giselle","KimMcgill@gmail.com",md5("S&C332@"),400);
    
insert into lanche(nome, ingredientes, valor) values
	("X-Burger","Pão brioche, hambúrger de carne, queijo prato e maionese especial",21.90),
    ("X-Bacon","Pão brioche, hambúrger de carne, queijo prato, bacon, cebola carabelizada e maionese especial",23.90),
    ("X-Salada","Pão brioche, hambúrger de carne, queijo prato, alface, tomate e maionese especial",22.90),
    ("X-BBQ","Pão brioche, hambúrger de carne especial de churrasco, queijo prato, molho barbecue, cebola caramelizada e maionese especial",25.90),
    ("X-Jonas","Pão Australiano, dois hambúrgeres de carne, queijo prato extra, alface, bacon, cebola caramelizada e maionese especial",28.90);
    
insert into bebida(nome, quantidade, valor) values
	("Coca-Cola",700,7.90),
    ("Guaraná Antártica",700,7.90),
    ("Fanta Laranja",700,7.90),
    ("Fanta Uva",700,7.90),
    ("Schweppes",700,7.90);
    
insert into acompanhamento(nome,valor) values
	("Batata Frita",8.90),
    ("Batata com cheddar e bacon",11.90),
    ("Onion Rings",9.90),
    ("Palitos de queijo",10.90),
    ("Cubinhos de frango",10.90);
    
insert into sobremesa(nome,sabor,valor) values
	("Casquinha","Baunilha",2.90),
    ("Sundae","Chocolate",5.90),
    ("Milkshake","Morango",10.90),
    ("Tortinha","Maçã",7.90),
    ("Tortinha","Banana",7.90);