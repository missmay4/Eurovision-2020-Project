-- Countries Insert 
insert into country (code, name) values 
	('AL', 'Albania'),
	('AM', 'Armenia'),
	('AU', 'Australia'),
	('AT', 'Austria'),
	('AZ', 'Azerbaijan'),
	('BY', 'Belarus'),
	('BE', 'Belgium'),
	('BG', 'Bulgaria'),
	('HR', 'Croatia'),
	('CY', 'Cyprus'),
	('CZ', 'Czech Republic'),
	('DK', 'Denmark'),
	('EE', 'Estonia'),
	('FI', 'Finland'),
	('FR', 'France'),
	('GE', 'Georgia'),
	('DE', 'Germany'),
	('GR', 'Greece'),
	('HU', 'Hungary'),
	('IS', 'Iceland'),
	('IE', 'Ireland'),
	('IL', 'Israel'),
	('IT', 'Italy'),
	('LV', 'Latvia'),
	('LT', 'Lithuania'),
	('MK', 'Macedonia'),
	('MT', 'Malta'),
	('MD', 'Moldova'),
	('ME', 'Montenegro'),
	('NL', 'Netherlands'),
	('NO', 'Norway'),
	('PL', 'Poland'),
	('PT', 'Portugal'),
	('RO', 'Romania'),
	('RU', 'Russia'),
	('SM', 'San Marino'),
	('RS', 'Serbia'),
	('SI', 'Slovenia'),
	('ES', 'Spain'),
	('SE', 'Sweden'),
	('CH', 'Switzerland'),
	('UA', 'Ukraine'),
	('GB', 'United Kingdom')

-- Participants Insert 

insert into participant (country_id, name, song, year, song_link, language) values
	((select id from country where name = 'Albania'), 'Arilena Ara', 'Fall From The Sky', 2020, 'https://youtu.be/p-E-kIFPrsY', 'English'),
	((select id from country where name = 'Germany'), 'Ben Dolic', 'Violent Thing', 2020, 'https://youtu.be/hAobDQ9GbT4', 'English'),
	((select id from country where name = 'Armenia'), '	Athena Manoukian', 'Chains on You', 2020, 'https://youtu.be/XpQHGMM8c5U', 'English'),
	((select id from country where name = 'Australia'), 'Montaigne', 'Don’t Break Me', 2020, 'https://youtu.be/gr-wWxu4974', 'English'),
	((select id from country where name = 'Austria'), 'Vicent Bueno', 'Alive', 2020, 'https://youtu.be/cOuiTJlBC50', 'English'),
	((select id from country where name = 'Azerbaijan'), 'Efendi', 'Cleopatra', 2020, 'https://youtu.be/I0VzBCvO1Wk', 'English & Japanese'),
	((select id from country where name = 'Belgium'), 'Hooverphonic', 'Release Me', 2020, 'https://youtu.be/lAqjksxc4iA', 'English'),
	((select id from country where name = 'Belarus'), 'Da Vidna', 'VAL', 2020, 'https://youtu.be/F0wfxz5zq04', 'Belarusian'),
	((select id from country where name = 'Bulgaria'), 'Victoria Georgieva', 'Tears Getting Sober', 2020, 'https://youtu.be/V_hgYnwZR8I', 'English'),
	((select id from country where name = 'Cyprus'), 'Sandro Nicolas', 'Running', 2020, 'https://youtu.be/Jl_qEw_4OK0', 'English'),
	((select id from country where name = 'Croatia'), 'Damir Kedžo', 'Divlji vjetre', 2020, 'https://youtu.be/2rOwScdxjJU', 'Croatian'),
	((select id from country where name = 'Denmark'), 'Ben & Tan', 'YES', 2020, 'https://youtu.be/XQ5tMhQIp1E', 'English'),
	((select id from country where name = 'Slovenia'), 'Ana Soklič', 'Voda', 2020, 'https://youtu.be/weLeotNwexg', 'Slovene'),
	((select id from country where name = 'Spain'), 'Blas Cantó', 'Universo', 2020, 'https://youtu.be/zuDdex1st-Y', 'Spanish'),
	((select id from country where name = 'Estonia'), 'Uku Suviste', 'What Love Is', 2020, 'https://youtu.be/3EIQ6U039ms', 'English'),
	((select id from country where name = 'Finland'), '	Aksel Kankaanranta', 'Looking Back', 2020, 'https://youtu.be/EgONBKFQpxE', 'English'),
	((select id from country where name = 'France'), 'Tom Leeb', 'Mon Alliée (The Best in Me)', 2020, 'https://youtu.be/D02Xlo_LfRU', 'French & English'),
	((select id from country where name = 'Georgia'), 'Tornike Kipiani', 'Take Me As I Am', 2020, 'https://youtu.be/LjNK4Xywjc4', 'English, Italian, Spanish, Frecnh & German'),
	((select id from country where name = 'Greece'), 'Stefania Liberakakis', 'Superg!rl', 2020, 'https://youtu.be/dJxCINWp_j0', 'English'),
	((select id from country where name = 'Ireland'), 'Lesley Roy', 'Story Of My Life', 2020, 'https://youtu.be/HLgE0Ayl5Hc', 'English'),
	((select id from country where name = 'Iceland'), 'Daði & Gagnamagnið', 'Think About Things', 2020, 'https://youtu.be/1HU7ocv3S2o', 'English'),
	((select id from country where name = 'Israel'), 'Eden Alene', 'Feker Libi', 2020, 'https://youtu.be/YjzyZZ-oidc', 'English, Amharic, Hebrew, Arabic & African constructed language'),
	((select id from country where name = 'Italy'), 'Diodato', 'Fai Rumore', 2020, 'https://youtu.be/TA57rugucwk', 'Italian'),
	((select id from country where name = 'Latvia'), 'Samanta Tīna', 'Still Breathing', 2020, 'https://youtu.be/ELr6U2fOrnE', 'English'),
	((select id from country where name = 'Lithuania'), 'The Roop', 'On Fire', 2020, 'https://youtu.be/FxPm-Wz8qpY', 'English'),
	((select id from country where name = 'Macedonia'), 'Vasil Garvanliev', 'You', 2020, 'https://youtu.be/xPZumQQExQc', 'English'),
	((select id from country where name = 'Malta'), 'Destiny Chukunyere', 'All Of My Love', 2020, 'https://youtu.be/CFCn_8oViRw', 'English'),
	((select id from country where name = 'Moldova'), 'Natalia Gordienco', 'Prison', 2020, 'https://youtu.be/RnD1ApDo5_k', 'English'),
	((select id from country where name = 'Norway'), 'Ulrikke Brandstorp', 'Attention', 2020, 'https://youtu.be/o9atJbnqhJU', 'English'),
	((select id from country where name = 'Netherlands'), 'Jeangu Macrooy', 'Grow', 2020, 'https://youtu.be/sMcxWB90TTY', 'English'),
	((select id from country where name = 'Poland'), 'Alicja Szemplińska', 'Empires', 2020, 'https://youtu.be/s_Y7mMka4SQ', 'English'),
	((select id from country where name = 'Portugal'), 'Elisa Silva', 'Medo de Sentir', 2020, 'https://youtu.be/eIZ48w4epng', 'Portuguese'),
	((select id from country where name = 'United Kingdom'), 'James Newman', 'My Last Breath', 2020, 'https://youtu.be/6iS-lV909T4', 'English'),
	((select id from country where name = 'Czech Republic'), 'Benny Cristo', 'Kemama', 2020, 'https://youtu.be/wROqCHLnbko', 'English'),
	((select id from country where name = 'Romania'), 'Roxen', 'Alcohol You', 2020, 'https://youtu.be/TmqSU3v_Mtw', 'English'),
	((select id from country where name = 'Russia'), 'Little Big', 'UNO', 2020, 'https://youtu.be/L_dWvTCdDQ4', 'English & Spanish'),
	((select id from country where name = 'San Marino'), 'Senhit', 'Freaky!', 2020, 'https://youtu.be/c6ZNo_hVA6E', 'English'),	
	((select id from country where name = 'Serbia'), 'Hurricane', 'Hasta La Vista', 2020, 'https://youtu.be/7fqZevYLUMs', 'Serbian, Spanish & English'),
	((select id from country where name = 'Sweden'), 'The Mamas', 'Move', 2020, 'https://youtu.be/7EpSBDPlZn4', 'English'),
	((select id from country where name = 'Switzerland'), 'Gjons Tears', 'Répondez-mo', 2020, 'https://youtu.be/O9GAfFHZE-E', 'French'),
	((select id from country where name = 'Ukraine'), 'Go_A', 'Solovey', 2020, 'https://youtu.be/zNetXPSld50', 'Ukrainian')

-- Gala Insert
insert into gala (type, date) values
	('Semifinal', '2020-05-12'),
	('Semifinal', '2020-05-14'),
	('Final', '2020-05-16')
	
-- galaParticipant Insert 
insert into galaparticipant (gala_id, participant_id) values
	(3, 17), -- France
	(3, 14), -- Spain
	(3, 30), -- Netherlands
	(3, 2), -- Germany
	(3, 23), -- Italy
	(3, 33) -- United Kingdom
	
insert into galaparticipant (gala_id, participant_id) values	
	(1, 26), -- Macedonia
	(1, 8), -- Belarus
	(1, 25), -- Lithuania
	(1, 39), -- Sweden
	(1, 13), -- Slovenia
	(1, 4), -- Australia
	(1, 20), -- Ireland
	(1, 36), -- Russia 
	(1, 29), -- Norway
	(1, 10), -- Cyprus
	(1, 11), -- Croatia
	(1, 6), -- Azerbaijan
	(1, 27), -- Malta
	(1, 22), -- Israel
	(1, 41), -- Ukraine
	(1, 35), -- Romania
	(1, 7), -- Belgium
	(2, 5), -- Austria
	(2, 28), -- Moldova
	(2, 31), -- Poland
	(2, 37), -- San Marino 
	(2, 38), -- Serbia
	(2, 21), -- Iceland
	(2, 34), -- Checz Republique
	(2, 19), -- Greece
	(2, 15), -- Estonia
	(2, 12), -- Denmark
	(2, 9), -- Bulgaria
	(2, 40), -- Switzerland
	(2, 16), -- Finland
	(2, 3), -- Armenia
	(2, 24), -- Latvia
	(2, 18), -- Georgia
	(2, 32), -- Portugal
	(2, 1) -- Albania
	
insert into galaparticipant (gala_id, participant_id) values -- ganadores 1st semifinal
	(3, 4), -- Australia
	(3, 20), -- Ireland
	(3, 36), -- Russia 
	(3, 6), -- Azerbaijan
	(3, 41), -- Ukraine
	(3, 39), -- Sweden
	(3, 26), -- Macedonia
	(3, 8), -- Belarus
	(3, 29), -- Norway
	(3, 10) -- Cyprus
	
insert into galaparticipant (gala_id, participant_id) values -- ganadores 2st semifinal 
	(3, 37), -- San Marino 
	(3, 38), -- Serbia
	(3, 21), -- Iceland
	(3, 34), -- Checz Republique
	(3, 12), -- Denmark
	(3, 5), -- Austria
	(3, 24), -- Latvia
	(3, 19), -- Greece
	(3, 3), -- Armenia
	(3, 1) -- Albania
	

