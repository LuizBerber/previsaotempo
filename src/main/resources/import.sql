insert into dia (id, nome) values (1, 'domingo');
insert into dia (id, nome) values (2, 'segunda');
insert into dia (id, nome) values (3, 'terça');
insert into dia (id, nome) values (4, 'quarta');
insert into dia (id, nome) values (5, 'quinta');
insert into dia (id, nome) values (6, 'sexta');
insert into dia (id, nome) values (7, 'sábado');

insert into previsao_tempo (codigo, diasemana, temperatura_minima, temperatura_maxima, humidade, descricao, latitude, longitude, data_hora) values (1, 1, 15.0, 21.0, 70.0, 'Faz frio', '22º 55´S', '22º 27´N', '02/12/1997 13h55');
insert into previsao_tempo (codigo, diasemana, temperatura_minima, temperatura_maxima, humidade, descricao, latitude, longitude, data_hora) values (2, 3, 14.0, 19.0, 30.0, 'Faz mais frio', '34º 65´S', '34º 69´N', '15/10/1999 11h11');
insert into previsao_tempo (codigo, diasemana, temperatura_minima, temperatura_maxima, humidade, descricao, latitude, longitude, data_hora) values (3, 1, 19.0, 31.0, 80.0, 'Esquentou', '29º 33´S', '29º 21´N', '08/01/2001 15h01');

insert into usuario (id, login, senha) values (1, 'luizberber', '0099');