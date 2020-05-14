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
	(3, 17, 19), -- France
	(3, 14, 12), -- Spain
	(3, 30, 10), -- Netherlands
	(3, 2, 26), -- Germany
	(3, 23, 16), -- Italy
	(3, 33, 9) -- United Kingdom
	
insert into galaparticipant (gala_id, participant_id, performanceorder) values -- ganadores 1st semifinal
	(3, 29, 21), -- Norway
	(3, 39, 15), -- Sweden
	(3, 25, 2), -- Lithuania
	(3, 36, 8), -- Russia 
	(3, 7, 5), -- Belgium
	(3, 6, 4), -- Azerbaijan
	(3, 20, 1), -- Ireland
	(3, 41, 11), -- Ukraine
	(3, 35, 20), -- Romania
	(3, 10, 3) -- Cyprus
	
insert into galaparticipant (gala_id, participant_id, performanceorder) values -- ganadores 2st semifinal 
	(3, 34, 25), -- Checz Republique
	(3, 1, 6), -- Albania
	(3, 12, 22), -- Denmark
	(3, 38, 7), -- Serbia
	(3, 24, 23), -- Latvia
	(3, 21, 13), -- Iceland
	(2, 40, 14), -- Switzerland
	(3, 5, 17), -- Austria
	(3, 3, 18), -- Armenia
	(3, 37, 24) -- San Marino 
	

