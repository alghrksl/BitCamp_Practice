DROP TABLE phoneinfo_basic;
DROP TABLE phoneinfo_univ;
DROP TABLE phoneinfo_com;


CREATE TABLE phoneinfo_basic(
idx NUMBER(6) CONSTRAINT phoneinfo_basic_idx_pk PRIMARY KEY,
fr_name VARCHAR2(20) NOT NULL,
fr_phonenumber VARCHAR2(20) NOT NULL,
fr_email VARCHAR2(20),
fr_address VARCHAR2(20),
fr_regdate DATE DEFAULT sysdate
);

CREATE TABLE  phoneinfo_univ(
idx NUMBER(6) CONSTRAINT phoneinfo_univ_idx_pk PRIMARY KEY,
fr_u_major VARCHAR2(20) DEFAULT 'N' 
                        NOT NULL,
fr_u_year NUMBER(1) DEFAULT '1' 
                    NOT NULL 
                    CONSTRAINT phoneinfo_univ_year_check CHECK(0 < fr_u_year AND fr_u_year < 5),
fr_ref NUMBER(7) CONSTRAINT phoneinfo_univ_ref_fk REFERENCES phoneinfo_basic(idx) 
                 NOT NULL
);

CREATE TABLE phoneInfo_com(
idx NUMBER(6) CONSTRAINT phoneInfo_com_idx_pk PRIMARY KEY,
fr_c_company VARCHAR2(20) DEFAULT 'N' 
                          NOT NULL,
fr_ref NUMBER(6) CONSTRAINT phoneInfo_com_ref_fk REFERENCES phoneinfo_basic(idx) NOT NULL
);


