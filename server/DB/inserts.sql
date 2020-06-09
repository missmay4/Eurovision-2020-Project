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
	('MK', 'Macedonia'),
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
	((select id from country where name = 'Albania'), 'Arilena Ara', 'Fall From The Sky', 2020, 'https://youtu.be/vXpCWFIY6YE', 'Inglés'),
	((select id from country where name = 'Alemania'), 'Ben Dolic', 'Violent Thing', 2020, 'https://youtu.be/hAobDQ9GbT4', 'Inglés'),
	((select id from country where name = 'Armenia'), '	Athena Manoukian', 'Chains on You', 2020, 'https://youtu.be/XpQHGMM8c5U', 'Inglés'),
	((select id from country where name = 'Australia'), 'Montaigne', 'Don’t Break Me', 2020, 'https://youtu.be/gr-wWxu4974', 'Inglés'),
	((select id from country where name = 'Austria'), 'Vicent Bueno', 'Alive', 2020, 'https://youtu.be/cOuiTJlBC50', 'Inglés'),
	((select id from country where name = 'Azerbaiyán'), 'Efendi', 'Cleopatra', 2020, 'https://youtu.be/I0VzBCvO1Wk', 'Inglés y Japonés'),
	((select id from country where name = 'Bélgica'), 'Hooverphonic', 'Release Me', 2020, 'https://youtu.be/lAqjksxc4iA', 'Inglés'),
	((select id from country where name = 'Bielorrusia'), 'VAL', 'Da Vidna', 2020, 'https://youtu.be/F0wfxz5zq04', 'Bielorruso'),
	((select id from country where name = 'Bulgaria'), 'Victoria Georgieva', 'Tears Getting Sober', 2020, 'https://youtu.be/V_hgYnwZR8I', 'Inglés'),
	((select id from country where name = 'Chipre'), 'Sandro Nicolas', 'Running', 2020, 'https://youtu.be/Jl_qEw_4OK0', 'Inglés'),
	((select id from country where name = 'Croacia'), 'Damir Kedžo', 'Divlji vjetre', 2020, 'https://youtu.be/2rOwScdxjJU', 'Croata'),
	((select id from country where name = 'Dinamarca'), 'Ben & Tan', 'YES', 2020, 'https://youtu.be/XQ5tMhQIp1E', 'Inglés'),
	((select id from country where name = 'Eslovenia'), 'Ana Soklič', 'Voda', 2020, 'https://youtu.be/weLeotNwexg', 'Esloveno'),
	((select id from country where name = 'España'), 'Blas Cantó', 'Universo', 2020, 'https://youtu.be/zuDdex1st-Y', 'Español'),
	((select id from country where name = 'Estonia'), 'Uku Suviste', 'What Love Is', 2020, 'https://youtu.be/3EIQ6U039ms', 'Inglés'),
	((select id from country where name = 'Finlandia'), 'Aksel Kankaanranta', 'Looking Back', 2020, 'https://youtu.be/EgONBKFQpxE', 'Inglés'),
	((select id from country where name = 'Francia'), 'Tom Leeb', 'Mon Alliée (The Best in Me)', 2020, 'https://youtu.be/J5SOdhXjYko', 'Francés e Inglés'),
	((select id from country where name = 'Georgia'), 'Tornike Kipiani', 'Take Me As I Am', 2020, 'https://youtu.be/LjNK4Xywjc4', 'Inglés, Italiano, Español, Francés & Alemán'),
	((select id from country where name = 'Grecia'), 'Stefania Liberakakis', 'Superg!rl', 2020, 'https://youtu.be/dJxCINWp_j0', 'Inglés'),
	((select id from country where name = 'Irlanda'), 'Lesley Roy', 'Story Of My Life', 2020, 'https://youtu.be/HLgE0Ayl5Hc', 'Inglés'),
	((select id from country where name = 'Islandia'), 'Daði & Gagnamagnið', 'Think About Things', 2020, 'https://youtu.be/1HU7ocv3S2o', 'Inglés'),
	((select id from country where name = 'Israel'), 'Eden Alene', 'Feker Libi', 2020, 'https://youtu.be/YjzyZZ-oidc', 'Inglés, Amhárico, Hebreo, Árabe & Lengua construida africana'),
	((select id from country where name = 'Italia'), 'Diodato', 'Fai Rumore', 2020, 'https://youtu.be/TA57rugucwk', 'Italiano'),
	((select id from country where name = 'Letonia'), 'Samanta Tīna', 'Still Breathing', 2020, 'https://youtu.be/ELr6U2fOrnE', 'Inglés'),
	((select id from country where name = 'Lituania'), 'The Roop', 'On Fire', 2020, 'https://youtu.be/FxPm-Wz8qpY', 'Inglés'),
	((select id from country where name = 'Macedonia'), 'Vasil Garvanliev', 'You', 2020, 'https://youtu.be/xPZumQQExQc', 'Inglés'),
	((select id from country where name = 'Malta'), 'Destiny Chukunyere', 'All Of My Love', 2020, 'https://youtu.be/CFCn_8oViRw', 'Inglés'),
	((select id from country where name = 'Moldavia'), 'Natalia Gordienco', 'Prison', 2020, 'https://youtu.be/RnD1ApDo5_k', 'Inglés'),
	((select id from country where name = 'Noruega'), 'Ulrikke Brandstorp', 'Attention', 2020, 'https://youtu.be/o9atJbnqhJU', 'Inglés'),
	((select id from country where name = 'Países Bajos'), 'Jeangu Macrooy', 'Grow', 2020, 'https://youtu.be/sMcxWB90TTY', 'Inglés'),
	((select id from country where name = 'Polonia'), 'Alicja Szemplińska', 'Empires', 2020, 'https://youtu.be/s_Y7mMka4SQ', 'Inglés'),
	((select id from country where name = 'Portugal'), 'Elisa Silva', 'Medo de Sentir', 2020, 'https://youtu.be/eIZ48w4epng', 'Portugués'),
	((select id from country where name = 'Reino Unido'), 'James Newman', 'My Last Breath', 2020, 'https://youtu.be/6iS-lV909T4', 'Inglés'),
	((select id from country where name = 'República Checa'), 'Benny Cristo', 'Kemama', 2020, 'https://youtu.be/wROqCHLnbko', 'Inglés'),
	((select id from country where name = 'Rumania'), 'Roxen', 'Alcohol You', 2020, 'https://youtu.be/TmqSU3v_Mtw', 'Inglés'),
	((select id from country where name = 'Rusia'), 'Little Big', 'UNO', 2020, 'https://youtu.be/L_dWvTCdDQ4', 'Inglés y Español'),
	((select id from country where name = 'San Marino'), 'Senhit', 'Freaky!', 2020, 'https://youtu.be/c6ZNo_hVA6E', 'English'),	
	((select id from country where name = 'Serbia'), 'Hurricane', 'Hasta La Vista', 2020, 'https://youtu.be/7fqZevYLUMs', 'Serbio, Español e Inglés'),
	((select id from country where name = 'Suecia'), 'The Mamas', 'Move', 2020, 'https://youtu.be/7EpSBDPlZn4', 'Inglés'),
	((select id from country where name = 'Suiza'), 'Gjons Tears', 'Répondez-mo', 2020, 'https://youtu.be/O9GAfFHZE-E', 'Francés'),
	((select id from country where name = 'Ucrania'), 'Go_A', 'Solovey', 2020, 'https://youtu.be/zNetXPSld50', 'Ucraniano')

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
	
insert into galaparticipant (gala_id, participant_id, performanceorder) values -- 'ganadores' 1st semifinal
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
	
insert into galaparticipant (gala_id, participant_id, performanceorder) values -- 'ganadores' 2st semifinal 
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