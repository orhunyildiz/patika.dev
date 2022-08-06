/*
1- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE,
    email VARCHAR(100)
);

2- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (name, birthday, email) values ('Nance Lepper', '1930-10-20', 'nlepper0@freewebs.com');
insert into employee (name, birthday, email) values ('Carlita Duffin', '1972-10-30', null);
insert into employee (name, birthday, email) values ('Ray Draycott', '1962-11-07', 'rdraycott2@pbs.org');
insert into employee (name, birthday, email) values ('Elmer Carah', '1968-07-02', 'ecarah3@nifty.com');
insert into employee (name, birthday, email) values ('Arluene Wyllcocks', '1990-05-30', 'awyllcocks4@pinterest.com');
insert into employee (name, birthday, email) values ('Rem Trehearne', '1984-09-18', 'rtrehearne5@yolasite.com');
insert into employee (name, birthday, email) values ('Chad Chetwind', null, 'cchetwind6@sitemeter.com');
insert into employee (name, birthday, email) values ('Dasya Larkby', '1936-03-04', 'dlarkby7@paypal.com');
insert into employee (name, birthday, email) values ('Donica Frantzen', '1966-02-15', null);
insert into employee (name, birthday, email) values ('Huntley Purshouse', '1907-09-09', 'hpurshouse9@devhub.com');
insert into employee (name, birthday, email) values ('Terrance McNeil', '1996-08-15', null);
insert into employee (name, birthday, email) values ('Aili McGaw', '1944-01-13', 'amcgawb@cdc.gov');
insert into employee (name, birthday, email) values ('Morna Lysaght', '1912-03-04', 'mlysaghtc@over-blog.com');
insert into employee (name, birthday, email) values ('Warner Blaksland', null, 'wblakslandd@mac.com');
insert into employee (name, birthday, email) values ('Trudie Vink', null, 'tvinke@rambler.ru');
insert into employee (name, birthday, email) values ('Devondra Rickell', '1906-03-13', 'drickellf@exblog.jp');
insert into employee (name, birthday, email) values ('Alexine Koppens', '1927-08-22', 'akoppensg@e-recht24.de');
insert into employee (name, birthday, email) values ('Emile Gres', '1916-01-12', 'egresh@chronoengine.com');
insert into employee (name, birthday, email) values ('Stoddard Rupp', '1918-03-14', null);
insert into employee (name, birthday, email) values ('Kirsteni Paddon', '1932-04-29', 'kpaddonj@issuu.com');
insert into employee (name, birthday, email) values ('Sara Bainton', '1984-02-06', 'sbaintonk@ihg.com');
insert into employee (name, birthday, email) values ('Daffy De Blasio', null, 'ddel@1und1.de');
insert into employee (name, birthday, email) values ('Rubetta Train', '1958-11-06', 'rtrainm@wikimedia.org');
insert into employee (name, birthday, email) values ('Corby Garvagh', '1994-11-12', 'cgarvaghn@thetimes.co.uk');
insert into employee (name, birthday, email) values ('Tristam Winram', '1964-09-17', 'twinramo@shareasale.com');
insert into employee (name, birthday, email) values ('Monte Frarey', '1910-03-02', 'mfrareyp@washington.edu');
insert into employee (name, birthday, email) values ('Thorstein Tourot', '1956-04-29', 'ttourotq@printfriendly.com');
insert into employee (name, birthday, email) values ('Dniren Frenchum', '1940-02-12', 'dfrenchumr@wiley.com');
insert into employee (name, birthday, email) values ('Carr Hark', '1948-03-04', 'charks@comcast.net');
insert into employee (name, birthday, email) values ('Rollie Vango', '1944-07-20', 'rvangot@plala.or.jp');
insert into employee (name, birthday, email) values ('Neely Hender', '1984-05-24', 'nhenderu@ebay.co.uk');
insert into employee (name, birthday, email) values ('Kiel Vickarman', '1948-02-17', 'kvickarmanv@histats.com');
insert into employee (name, birthday, email) values ('Audi Colls', null, 'acollsw@ifeng.com');
insert into employee (name, birthday, email) values ('Vinson Panniers', '1974-01-18', 'vpanniersx@sourceforge.net');
insert into employee (name, birthday, email) values ('Katrina Neasham', '1922-01-26', 'kneashamy@comcast.net');
insert into employee (name, birthday, email) values ('Consuela Gaiford', '1938-04-01', 'cgaifordz@google.nl');
insert into employee (name, birthday, email) values ('Halimeda Grotty', '1922-04-29', 'hgrotty10@microsoft.com');
insert into employee (name, birthday, email) values ('Inga Boodle', '1927-04-15', 'iboodle11@blogspot.com');
insert into employee (name, birthday, email) values ('Bartram Mac Giolla Pheadair', '1966-09-14', 'bmac12@shutterfly.com');
insert into employee (name, birthday, email) values ('Leisha Kolakowski', '1987-03-05', 'lkolakowski13@gizmodo.com');
insert into employee (name, birthday, email) values ('Daisy Gallagher', '1901-01-07', 'dgallagher14@privacy.gov.au');
insert into employee (name, birthday, email) values ('Leeanne Craigmyle', '1943-08-29', null);
insert into employee (name, birthday, email) values ('Nestor Garbett', '1956-04-26', 'ngarbett16@msu.edu');
insert into employee (name, birthday, email) values ('Alis Brettel', '1913-05-31', 'abrettel17@desdev.cn');
insert into employee (name, birthday, email) values ('Dolores Shotter', '1935-06-05', null);
insert into employee (name, birthday, email) values ('Shelbi Liccardo', '1932-12-30', 'sliccardo19@gov.uk');
insert into employee (name, birthday, email) values ('Arturo Lorincz', '1916-06-15', null);
insert into employee (name, birthday, email) values ('Giavani Manifould', null, 'gmanifould1b@qq.com');
insert into employee (name, birthday, email) values ('Mireielle Westhoff', '1917-01-12', 'mwesthoff1c@dagondesign.com');
insert into employee (name, birthday, email) values ('Ernie Davidowsky', '1909-01-31', 'edavidowsky1d@vk.com');

3- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET id = 58,
    name = 'Orhun YILDIZ',
    email = 'orhunyildiz@patika.dev'
WHERE id = 17
RETURNING *;
UPDATE employee
SET name = 'Employee X'
WHERE id > 44
RETURNING *;
UPDATE employee
SET name = 'Qualified Employee X'
WHERE name ILIKE '%x' AND birthday < '1980-01-01'
RETURNING *;
UPDATE employee
SET name = 'Apprentice Employee X',
    email = 'employee1@company.com'
WHERE email LIKE '%devhub.com'
RETURNING *;
UPDATE employee
SET name = 'Employee Y'
WHERE id BETWEEN 15 AND 20
RETURNING *;

4- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id = 12
RETURNING *;
DELETE FROM employee
WHERE id BETWEEN 37 AND 40
RETURNING *;
DELETE FROM employee
WHERE email ILIKE '%X%'
RETURNING *;
DELETE FROM employee
WHERE name LIKE '%Y'
RETURNING *;
DELETE FROM employee
WHERE birthday > '01-01-1999'
RETURNING *;
*/