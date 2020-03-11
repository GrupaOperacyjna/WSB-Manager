PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;

CREATE TABLE IF NOT EXISTS "Authors" (
	"author_id" INTEGER PRIMARY KEY AUTOINCREMENT, -- private typ authorID
	"author_surname" VARCHAR(45) NOT NULL, -- private typ surname
	"author_firstname" VARCHAR(45) NOT NULL, -- private typ firstname
	"author_born" DATE NULL -- private typ born 
	-- PRIMARY KEY ("author_id")
);


CREATE TABLE IF NOT EXISTS "Books" (
	"book_id" INTEGER PRIMARY KEY AUTOINCREMENT, -- private typ boookID;
	"author_id" INTEGER NOT NULL, -- private typ authorID;
	"book_title" VARCHAR(100) NOT NULL, --private typ bookName;
	"book_date" DATE NULL, -- private typ bookRelaseDate;
	"book_cover" VARCHAR(45) NULL, -- private typ bookCover;
	-- PRIMARY KEY ("book_id"),
	FOREIGN KEY("author_id") REFERENCES "Authors" ("author_id") ON UPDATE RESTRICT ON DELETE RESTRICT
);

CREATE TABLE "Users" (
	"user_id" INTEGER PRIMARY KEY AUTOINCREMENT, 
	"user_surname" VARCHAR(45) NOT NULL, 
	"user_firstname" VARCHAR(45) NOT NULL, 
	"user_login" VARCHAR(45) NOT NULL,
	"user_password" VARCHAR(45) NOT NULL,
)

INSERT INTO Users (user_surname, user_firstname, user_login, user_password) VALUES ("admin", "Admin", "admin", "admin")