-- Countries Insert 
insert into country (code, name) values 
	('AL', 'Albania'),
	('AM', 'Armenia'),
	('AU', 'Australia'),
	('AT', 'Austria'),
	('AZ', 'Azerbaiyán'),
	('BY', 'Bielorrusia'),
	('BE', 'Bélgica'),
	('BG', 'Bulgaria'),
	('HR', 'Croacia'),
	('CY', 'Chipre'),
	('CZ', 'República Checa'),
	('DK', 'Dinamarca'),
	('EE', 'Estonia'),
	('FI', 'Finlandia'),
	('FR', 'Francia'),
	('GE', 'Georgia'),
	('DE', 'Alemania'),
	('GR', 'Grecia'),
	('HU', 'Hungría'),
	('IS', 'Islandia'),
	('IE', 'Irlanda'),
	('IL', 'Israel'),
	('IT', 'Italia'),
	('LV', 'Letonia'),
	('LT', 'Lituania'),
	('MK', 'Macedonia del Norte'),
	('MT', 'Malta'),
	('MD', 'Moldavia'),
	('ME', 'Montenegro'),
	('NL', 'Países Bajos'),
	('NO', 'Noruega'),
	('PL', 'Polonia'),
	('PT', 'Portugal'),
	('RO', 'Rumania'),
	('RU', 'Rusia'),
	('SM', 'San Marino'),
	('RS', 'Serbia'),
	('SI', 'Eslovenia'),
	('ES', 'España'),
	('SE', 'Suecia'),
	('CH', 'Suiza'),
	('UA', 'Ucrania'),
	('GB', 'Reino Unido')

-- Participants Insert 

insert into participant (country_id, name, song, year, song_link, language) values
	((select id from country where name = 'Albania'), 'Arilena Ara', 'Fall From The Sky', 2020, 'https://youtu.be/p-E-kIFPrsY', 'English'),
	((select id from country where name = 'Alemania'), 'Ben Dolic', 'Violent Thing', 2020, 'https://youtu.be/hAobDQ9GbT4', 'English'),
	((select id from country where name = 'Armenia'), '	Athena Manoukian', 'Chains on You', 2020, 'https://youtu.be/XpQHGMM8c5U', 'English'),
	((select id from country where name = 'Australia'), 'Montaigne', 'Don’t Break Me', 2020, 'https://youtu.be/gr-wWxu4974', 'English'),
	((select id from country where name = 'Austria'), 'Vicent Bueno', 'Alive', 2020, 'https://youtu.be/cOuiTJlBC50', 'English'),
	((select id from country where name = 'Azerbaiyán'), 'Efendi', 'Cleopatra', 2020, 'https://youtu.be/I0VzBCvO1Wk', 'English & Japanese'),
	((select id from country where name = 'Bélgica'), 'Hooverphonic', 'Release Me', 2020, 'https://youtu.be/lAqjksxc4iA', 'English'),
	((select id from country where name = 'Bielorrusia'), 'VAL', 'Da Vidna', 2020, 'https://youtu.be/F0wfxz5zq04', 'Belarusian'),
	((select id from country where name = 'Bulgaria'), 'Victoria Georgieva', 'Tears Getting Sober', 2020, 'https://youtu.be/V_hgYnwZR8I', 'English'),
	((select id from country where name = 'Chipre'), 'Sandro Nicolas', 'Running', 2020, 'https://youtu.be/Jl_qEw_4OK0', 'English'),
	((select id from country where name = 'Croacia'), 'Damir Kedžo', 'Divlji vjetre', 2020, 'https://youtu.be/2rOwScdxjJU', 'Croatian'),
	((select id from country where name = 'Dinamarca'), 'Ben & Tan', 'YES', 2020, 'https://youtu.be/XQ5tMhQIp1E', 'English'),
	((select id from country where name = 'Eslovenia'), 'Ana Soklič', 'Voda', 2020, 'https://youtu.be/weLeotNwexg', 'Slovene'),
	((select id from country where name = 'España'), 'Blas Cantó', 'Universo', 2020, 'https://youtu.be/zuDdex1st-Y', 'Spanish'),
	((select id from country where name = 'Estonia'), 'Uku Suviste', 'What Love Is', 2020, 'https://youtu.be/3EIQ6U039ms', 'English'),
	((select id from country where name = 'Finlandia'), '	Aksel Kankaanranta', 'Looking Back', 2020, 'https://youtu.be/EgONBKFQpxE', 'English'),
	((select id from country where name = 'Francia'), 'Tom Leeb', 'Mon Alliée (The Best in Me)', 2020, 'https://youtu.be/J5SOdhXjYko', 'French & English'),
	((select id from country where name = 'Georgia'), 'Tornike Kipiani', 'Take Me As I Am', 2020, 'https://youtu.be/LjNK4Xywjc4', 'English, Italian, Spanish, Frecnh & German'),
	((select id from country where name = 'Grecia'), 'Stefania Liberakakis', 'Superg!rl', 2020, 'https://youtu.be/dJxCINWp_j0', 'English'),
	((select id from country where name = 'Irlanda'), 'Lesley Roy', 'Story Of My Life', 2020, 'https://youtu.be/HLgE0Ayl5Hc', 'English'),
	((select id from country where name = 'Islandia'), 'Daði & Gagnamagnið', 'Think About Things', 2020, 'https://youtu.be/1HU7ocv3S2o', 'English'),
	((select id from country where name = 'Israel'), 'Eden Alene', 'Feker Libi', 2020, 'https://youtu.be/YjzyZZ-oidc', 'English, Amharic, Hebrew, Arabic & African constructed language'),
	((select id from country where name = 'Italia'), 'Diodato', 'Fai Rumore', 2020, 'https://youtu.be/TA57rugucwk', 'Italian'),
	((select id from country where name = 'Letonia'), 'Samanta Tīna', 'Still Breathing', 2020, 'https://youtu.be/ELr6U2fOrnE', 'English'),
	((select id from country where name = 'Lituania'), 'The Roop', 'On Fire', 2020, 'https://youtu.be/FxPm-Wz8qpY', 'English'),
	((select id from country where name = 'Macedonia del Norte'), 'Vasil Garvanliev', 'You', 2020, 'https://youtu.be/xPZumQQExQc', 'English'),
	((select id from country where name = 'Malta'), 'Destiny Chukunyere', 'All Of My Love', 2020, 'https://youtu.be/CFCn_8oViRw', 'English'),
	((select id from country where name = 'Moldavia'), 'Natalia Gordienco', 'Prison', 2020, 'https://youtu.be/RnD1ApDo5_k', 'English'),
	((select id from country where name = 'Noruega'), 'Ulrikke Brandstorp', 'Attention', 2020, 'https://youtu.be/o9atJbnqhJU', 'English'),
	((select id from country where name = 'Países Bajos'), 'Jeangu Macrooy', 'Grow', 2020, 'https://youtu.be/sMcxWB90TTY', 'English'),
	((select id from country where name = 'Polonia'), 'Alicja Szemplińska', 'Empires', 2020, 'https://youtu.be/s_Y7mMka4SQ', 'English'),
	((select id from country where name = 'Portugal'), 'Elisa Silva', 'Medo de Sentir', 2020, 'https://youtu.be/eIZ48w4epng', 'Portuguese'),
	((select id from country where name = 'Reino Unido'), 'James Newman', 'My Last Breath', 2020, 'https://youtu.be/6iS-lV909T4', 'English'),
	((select id from country where name = 'República Checa'), 'Benny Cristo', 'Kemama', 2020, 'https://youtu.be/wROqCHLnbko', 'English'),
	((select id from country where name = 'Rumania'), 'Roxen', 'Alcohol You', 2020, 'https://youtu.be/TmqSU3v_Mtw', 'English'),
	((select id from country where name = 'Rusia'), 'Little Big', 'UNO', 2020, 'https://youtu.be/L_dWvTCdDQ4', 'English & Spanish'),
	((select id from country where name = 'San Marino'), 'Senhit', 'Freaky!', 2020, 'https://youtu.be/c6ZNo_hVA6E', 'English'),	
	((select id from country where name = 'Serbia'), 'Hurricane', 'Hasta La Vista', 2020, 'https://youtu.be/7fqZevYLUMs', 'Serbian, Spanish & English'),
	((select id from country where name = 'Suecia'), 'The Mamas', 'Move', 2020, 'https://youtu.be/7EpSBDPlZn4', 'English'),
	((select id from country where name = 'Suiza'), 'Gjons Tears', 'Répondez-mo', 2020, 'https://youtu.be/O9GAfFHZE-E', 'French'),
	((select id from country where name = 'Ucrania'), 'Go_A', 'Solovey', 2020, 'https://youtu.be/zNetXPSld50', 'Ukrainian')

-- Gala Insert
insert into gala (type, date) values
	('Semifinal', '2020-05-12'),
	('Semifinal', '2020-05-14'),
	('Final', '2020-05-16')
	
-- galaParticipant Insert 
-- 1st Semifinal 12/5/2020
insert into galaparticipant (gala_id, participant_id, performanceorder) values	
	(1, 26, 4), -- Macedonia
	(1, 8, 2), -- Belarus
	(1, 25, 6), -- Lithuania
	(1, 39, 1), -- Sweden
	(1, 13, 5), -- Slovenia
	(1, 4, 3), -- Australia
	(1, 20, 7), -- Ireland
	(1, 36, 8), -- Russia 
	(1, 29, 14), -- Norway
	(1, 10, 13), -- Cyprus
	(1, 11, 11), -- Croatia
	(1, 6, 12), -- Azerbaijan
	(1, 27, 10), -- Malta
	(1, 22, 15), -- Israel
	(1, 41, 17), -- Ukraine
	(1, 35, 16), -- Romania
	(1, 7, 9) -- Belgium

-- 2nd Semifinal 14/5/2020
insert into galaparticipant (gala_id, participant_id, performanceorder) values	
	(2, 5, 3), -- Austria
	(2, 28, 4), -- Moldova
	(2, 31, 8), -- Poland
	(2, 37, 5), -- San Marino 
	(2, 38, 7), -- Serbia
	(2, 21, 9), -- Iceland
	(2, 34, 6), -- Checz Republique
	(2, 19, 1), -- Greece
	(2, 15, 2), -- Estonia
	(2, 12, 11), -- Denmark
	(2, 9, 17), -- Bulgaria
	(2, 40, 10), -- Switzerland
	(2, 16, 13), -- Finland
	(2, 3, 14), -- Armenia
	(2, 24, 18), -- Latvia
	(2, 18, 16), -- Georgia
	(2, 32, 15), -- Portugal
	(2, 1, 12) -- Albania

-- Final
insert into galaparticipant (gala_id, participant_id, performanceorder) values
	(3, 17, 3), -- France
	(3, 14, 12), -- Spain
	(3, 30, 26), -- Netherlands
	(3, 2, 21), -- Germany
	(3, 23, 24), -- Italy
	(3, 33, 9) -- United Kingdom
	
insert into galaparticipant (gala_id, participant_id, performanceorder) values -- ganadores 1st semifinal
	(3, 29, 1), -- Norway
	(3, 39, 6), -- Sweden
	(3, 25, 5), -- Lithuania
	(3, 36, 2), -- Russia 
	(3, 7, 8), -- Belgium
	(3, 6, 4), -- Azerbaijan
	(3, 20, 14), -- Ireland
	(3, 41, 22), -- Ukraine
	(3, 35, 20), -- Romania
	(3, 10, 19) -- Cyprus
	
insert into galaparticipant (gala_id, participant_id, performanceorder) values -- ganadores 2st semifinal 
	(3, 34, 18), -- Checz Republique
	(3, 1, 13), -- Albania
	(3, 12, 23), -- Denmark
	(3, 38, 11), -- Serbia
	(3, 24, 7), -- Latvia
	(3, 21, 17), -- Iceland
	(3, 40, 10), -- Switzerland
	(3, 5, 15), -- Austria
	(3, 3, 25), -- Armenia
	(3, 37, 16) -- San Marino 

-- Inserts datos de prueba, usuarios, votos y favoritos

-- Insert usuarios votos
insert into user_ (id, "name") values 
	(1, 'Ian'),
	(2, 'Beatrice'),
	(3, 'Claudia'),
	(4, 'Angela'),
	(5, 'Javier')

-- Insert votos usuarios 
insert into vote (id, participant_id, user_id, item_order, gala_id, date_vote) values 
	(1, 36, 1, 0, 1, '2020-06-03 23:43:58.583'),
	(2, 6, 1, 1, 1, '2020-06-03 23:43:58.583'),
	(3, 20, 1, 2, 1, '2020-06-03 23:43:58.583'),
	(7, 39, 2, 0, 1, '2020-06-05 19:00:53.398'),
	(8, 22, 2, 1, 1, '2020-06-05 19:00:53.398'),
	(9, 6, 2, 2, 1, '2020-06-05 19:00:53.398'),
	(10, 39, 3, 0, 1, '2020-06-05 19:01:52.814'),
	(11, 27, 3, 1, 1, '2020-06-05 19:01:52.814'),
	(12, 6, 3, 2, 1, '2020-06-05 19:01:52.814'),
	(13, 21, 4, 0, 2, '2020-06-05 23:18:19.087'),
	(14, 12, 4, 1, 2, '2020-06-05 23:18:19.087'),
	(15, 37, 4, 2, 2, '2020-06-05 23:18:19.087'),
	(16, 3, 5, 0, 2, '2020-06-05 23:20:00.115'),
	(17, 12, 5, 1, 2, '2020-06-05 23:20:00.115'),
	(18, 34, 5, 2, 2, '2020-06-05 23:20:00.115')

-- Inserts usuarios con favoritos
insert into user_favorites (id, user_name, user_country) values 
	(1, 'Ian', 'IT'),
	(2, 'Angela', 'ES'), 
	(3, 'Raquel', 'ES'),
	(4, 'Claudia', 'ES'),
	(5, 'Beatrice', 'ES')
	
-- Inserts favoritos de usuarios con favoritos
insert into favorites (id, participant_id, user_id) values 
	(1, 6, 1),
	(2, 36, 1),
	(3, 14, 1),
	(4, 41, 1),
	(5, 21, 1),
	(6, 20, 1),
	(7, 25, 1),
	(8, 8, 1),
	(9, 12, 1),
	(10, 29, 1),
	(11, 14, 2),
	(12, 6, 2),
	(13, 36, 2),
	(14, 21, 2),
	(15, 22, 2),
	(16, 25, 2),
	(17, 37, 2),
	(18, 12, 2),
	(19, 38, 2),
	(20, 39, 2),
	(21, 6, 3),
	(22, 10, 3),
	(23, 21, 3),
	(24, 25, 3),
	(25, 27, 3),
	(26, 37, 3),
	(27, 36, 3),
	(28, 14, 3),
	(29, 2, 3),
	(30, 12, 3),
	(31, 25, 4),
	(32, 39, 4),
	(33, 20, 4),
	(34, 27, 4),
	(35, 6, 4),
	(36, 29, 4),
	(37, 2, 4),
	(38, 32, 4),
	(39, 12, 4),
	(40, 5, 4),
	(41, 39, 5),
	(42, 25, 5),
	(43, 20, 5),
	(44, 36, 5),
	(45, 27, 5),
	(46, 6, 5),
	(47, 29, 5),
	(48, 22, 5),
	(49, 23, 5),
	(50, 14, 5)
	
