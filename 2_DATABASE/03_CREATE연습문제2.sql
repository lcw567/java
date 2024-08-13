DROP TABLE MEM;
DROP TABLE MEM_CHECK;
DROP TABLE MEM_GRADE;
DROP TABLE MEM_NOTNULL;
DROP TABLE MEM_PRI;
DROP TABLE MEM_PRI2;
DROP TABLE MEM_UNIQUE;
DROP TABLE TB_MEMBER;


--�ǽ����� --
--�������� ���α׷��� ����� ���� ���̺�� �����--
--�̶�, �������ǿ� �̸��� �ο��� ��
--   �� �÷��� �ּ��ޱ�

DROP TABLE TB_MEMBER;
DROP TABLE TB_BOOK;
DROP TABLE TB_PUBLISHER;

/*
    1. ���ǻ�鿡 ���� �����͸� ������� ���ǻ� ���̺�(TB_PUBLISHER)
    �÷� : PUB_NO(���ǻ� ��ȣ) - �⺻Ű(PUBLISHER_PK)
          PUB_NAME(���ǻ��) -- NOT NULL(PUBLISHER_NN)
          PHONE(���ǻ���ȭ��ȣ) -- �������Ǿ���
*/

--���� 3������ ����
CREATE TABLE TB_PUBLISHER(
PUB_NO NUMBER CONSTRAINT PUBLISHER_PK PRIMARY KEY,
PUB_NAME VARCHAR2(30) NOT NULL,
PHONE VARCHAR2(30)
);
COMMENT ON COLUMN TB_PUBLISHER.PUB_NO IS '���ǻ� ��ȣ';
COMMENT ON COLUMN TB_PUBLISHER.PUB_NAME IS '���ǻ��';
COMMENT ON COLUMN TB_PUBLISHER.PHONE IS '���ǻ���ȭ��ȣ';

INSERT INTO TB_PUBLISHER VALUES(1,'�Ѻ���ī����','010-1111-1111' );
INSERT INTO TB_PUBLISHER VALUES(2, '������ȭ��','010-2222-2222');
INSERT INTO TB_PUBLISHER VALUES(3, '�������ۺ���', '010-3333-3333');
/*
    2. �����鿡 ���� �����͸� ������� ���� ���̺�(TB_BOOK)
    �÷� : BK_NO(������ȣ)--�⺻Ű(BOOK_PK)
          BK_TITLE(������)--NOT NULL(BOOK__NN_TITLE)
          BK_AUTHOR(���ڸ�)--NOT NULL(BOOK__NN_AUTHOR)
          BK_PRICE(����)-- �������Ǿ���
          BK_PUB_NO(���ǻ� ��ȣ)--�ܷ�Ű(BOOK_FK)(TB_PUBLISHER���̺��� ����)
                                �̶� �����ϰ� �ִ� �θ����� ������ �ڽĵ����͵� ���� �ǵ��� �ɼ�����
                                
*/
CREATE TABLE TB_BOOK(
    BK_NO NUMBER CONSTRAINT BOOK_PK PRIMARY KEY,
    BK_TITLE VARCHAR2(30) CONSTRAINT BOOK__NN_TITLE NOT NULL,
    BK_AUTHOR VARCHAR2(30) CONSTRAINT BOOK__NN_AUTHOR NOT NULL,
    BK_PRICE NUMBER,
    BK_PUB_NO NUMBER,
    CONSTRAINT BOOK_FK FOREIGN KEY (BK_PUB_NO) REFERENCES TB_PUBLISHER(PUB_NO) ON DELETE CASCADE
);
INSERT INTO TB_BOOK VALUES(1,'������׿���','�����ó�',17820, 1 );
INSERT INTO TB_BOOK VALUES(2,'�Һ��ǹ�Ģ','���',22500,1 );
INSERT INTO TB_BOOK VALUES(3,'���ӴϺ�','�佺',19800, 2 );
INSERT INTO TB_BOOK VALUES(4,'��ۼ���','����',16200,2 );
INSERT INTO TB_BOOK VALUES(5,'���ǽɸ���','�ſ���',19800,3 );
--5�� ������ ���� ������ �߰��ϱ�


/*
    3. ȸ���� ���� �����͸� ������� ȸ�� ���̺�(TB_MEMBER)
    �÷��� : MEMBER_NO(ȸ����ȣ) -- �⺻Ű(MEMBER_PK)
            MEMBER_ID(���̵�) -- �ߺ�����(MEMBER_UQ_ID)
            MEMBER_PWD(��й�ȣ) -- NOT NULL(MEMBER_NN_PWD)
            MEMBER_NAME(ȸ����) -- NOT NULL(MEMBER_NN_NAME)
            GENDER(����) -- M�Ǵ� F�� �Էµǵ��� ����(MEMBER_CK_GEN)
            ADDRESS(�ּ�) -- �������Ǿ���
            PHONE(����ó)-- �������Ǿ���
            STATUS(Ż�𿩺�) -- �⺻���� N���� ����, �׸��� N�Ǵ� Y�� �Էµǵ��� �������� ����(MEMBER_CK_STA)
            ENROLL_DATE(������) -- �⺻������ SYSDATE, NOT NULL ��������(MEMBER_NN_EN)
*/
CREATE TABLE TB_MEMBER(
    MEMBER_NO NUMBER CONSTRAINT MEMBER_PK PRIMARY KEY,
    MEMBER_ID VARCHAR2(30) CONSTRAINT MEMBER_UQ_ID UNIQUE NOT NULL,
    MEMBER_PWD VARCHAR2(30) CONSTRAINT MEMBER_NN_PWD NOT NULL,
    MEMBER_NAME VARCHAR2(30) CONSTRAINT MEMBER_NN_NAME NOT NULL,
    GENDER CHAR(1) CONSTRAINT MEMBER_CK_GEN CHECK(GENDER IN ('M','F')),
    ADDRESS VARCHAR2(50),
    PHONE CHAR(13),
    STATUS CHAR(1) DEFAULT 'N' CONSTRAINT MEMBER_CK_STA CHECK(STATUS IN ('N','Y')),
    ENROLL_DATE DATE DEFAULT SYSDATE CONSTRAINT MEMBER_NN_EN NOT NULL
);
INSERT INTO TB_MEMBER VALUES(200, 'USER01','PASS01', '������', 'M', NULL, NULL, DEFAULT, DEFAULT);
INSERT INTO TB_MEMBER VALUES(201, 'USER02','PASS02', '������', 'F', NULL, NULL, DEFAULT, DEFAULT);
INSERT INTO TB_MEMBER VALUES(202, 'USER03','PASS03', '�̻��', 'F', NULL, NULL, DEFAULT, DEFAULT);
INSERT INTO TB_MEMBER VALUES(203, 'USER04','PASS04', '�����', 'M', NULL, NULL, DEFAULT, DEFAULT);
INSERT INTO TB_MEMBER VALUES(204, 'USER05','PASS05', '�ѿ���', 'M', NULL, NULL, DEFAULT, DEFAULT);
--5�� ������ ���� ������ �߰��ϱ�

/*
    4.� ȸ���� � ������ �뿩�ߴ����� ���� �뿩��� ���̺�(TB_RENT)
    �÷��� : RENT_NO(�뿩��ȣ)-- �⺻Ű(RENT_PK)
            RENT_MEM_NO(�뿩ȸ����ȣ)-- �ܷ�Ű(RENT_FK_MEM) TB_MEMBER�� �����ϵ���
                                        �̶� �θ� ������ ������ �ڽĵ����� ���� NULL�� �ǵ��� ����
            RENT_BOOK_NO(�뿩������ȣ)-- �ܷ�Ű(RENT_FK_BOOK) TB_BOOK�� �����ϵ���
                                        �̶� �θ� ������ ������ �ڽĵ����� ���� NULL�� �ǵ��� ����
            RENT_DATE(�뿩��) -- �⺻�� SYSDATE
*/
CREATE TABLE TB_RENT(
RENT_NO NUMBER CONSTRAINT RENT_PK PRIMARY KEY,
RENT_MEM_NO NUMBER,
RENT_BOOK_NO NUMBER,
RENT_DATE DATE DEFAULT SYSDATE,
CONSTRAINT RENT_FK_MEM FOREIGN KEY (RENT_MEM_NO) REFERENCES TB_MEMBER ON DELETE SET NULL,
CONSTRAINT RENT_FK_BOOK FOREIGN KEY (RENT_BOOK_NO) REFERENCES TB_BOOK ON DELETE SET NULL
);
INSERT INTO TB_RENT VALUES(300, 200, 1, DEFAULT);
INSERT INTO TB_RENT VALUES(301, 201, 2, DEFAULT);
INSERT INTO TB_RENT VALUES(302, 202, 3, DEFAULT);
SELECT * FROM TB_RENT;
--3�� ������ ���� ������ �߰��ϱ�



