CREATE TABLE PROFILE(
                        ID INTEGER PRIMARY KEY,
                        NAME VARCHAR(16) NOT NULL,
                        EMAIL VARCHAR(20) NOT NULL,
                        PASSWORD VARCHAR(20) NOT NULL
);

CREATE TABLE POST(
                     POST_ID INTEGER PRIMARY KEY,
                     POST_CONTENT VARCHAR(64) NOT NULL ,
                     POST_DATE DATE,
                     POST_COMMENT VARCHAR(64)
);

CREATE TABLE GROUPS(
                       GROUP_ID INTEGER PRIMARY KEY,
                       GROUP_SIZE INTEGER NOT NULL
);