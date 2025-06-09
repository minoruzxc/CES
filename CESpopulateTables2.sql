use ces;

insert into acesso(nivel,comentario) values
('admin','Gerente principal de contas e produtos'),
('user','Controle de produtos no estoque'),
('guest','Apenas visualização');

insert into usuario(nome,acesso_id,senha) values
('andre', 1, 'admin'),
('leo', 2, ''),
('Visitante', 3, '');

insert into produto(nomeproduto, descricao, quantidade) values
('Atum solido em óleo', '', 1),
('Sardinhas com óleo', '', 1),
('Sal refinado iodado', 'val indet', 1),
('Sal refinado extra iodado', 'val indet', 1),
('Achocolatado em pó', '', 1),
('Leite condensado semidesnatado', '', 1),
('Milho em conserva', '', 1),
('Seleta em conserva', '', 1);

