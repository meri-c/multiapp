DROP TABLE IF EXISTS stuff;

CREATE TABLE stuff (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  value VARCHAR(250) NOT NULL,
);

INSERT INTO stuff (value) VALUES
  ('Dangote'),
  ('Gates'),
  ('Alakija');