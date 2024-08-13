/*
    DDL : ������ ���Ǿ�
    
    ��ü�� ����(CREATE), ����(ALTER), ����(DROP)�ϴ� ����
    
    <ALTER>
    ��ü�� �����ϴ� ����
    
    [ǥ����]
    ALTER TABLE ���̺�� ������ ����
    
    *������ ����
    1) �÷� �߰�/����/����
    2) �������� �߰�/���� -> ������ �Ұ�
    3) �÷���/ �������Ǹ�/ ���̺�� ����

*/

--1) �÷� �߰� ���� ����
--DEPT_TABLE�� CNAME�÷� �߰�
SELECT * FROM DEPT_TABLE;
ALTER TABLE DEPT_TABLE ADD CNAME VARCHAR2(20);

--LNAME �÷� �߰�(�⺻�� -> �ѱ�)
ALTER TABLE DEPT_TABLE ADD LNAME VARCHAR2(20) DEFAULT '�ѱ�';
SELECT * FROM DEPT_TABLE;

--1_2) �÷� ����(MODIY)
--������Ÿ�� ���� : MODIFY �÷��� �ٲٰ��� �ϴ� ������ Ÿ��
--DEFAULT�� ���� : MODIFY �÷��� DEFAULT �����ұ⺻��

ALTER TABLE DEPT_TABLE MODIFY DEPT_ID CHAR(5);
--ALTER TABLE DEPT_TABLE MODIFY DEPT_ID NUMBER; -- ���� ������ �߻�

--DEPT_TITLE �÷��� VARCHAR2(40)
ALTER TABLE DEPT_TABLE MODIFY DEPT_TITLE VARCHAR2(40);
--LNAME �÷��� �⺻���� '�̱�'���� ����
ALTER TABLE DEPT_TABLE MODIFY LNAME DEFAULT '�̱�';
SELECT * FROM DEPT_TABLE;

--���ߺ��� ����
ALTER TABLE DEPT_TABLE 
    MODIFY DEPT_TITLE VARCHAR2(40)
    MODIFY LNAME DEFAULT '�̱�';
    
--1_3) �÷� ���� (DROP COLUMN) :DROP COLUMN �����ϰ����ϴ� �÷�
CREATE TABLE DEPT_COPY
AS (SELECT * FROM DEPT_TABLE);

SELECT * FROM DEPT_COPY;
 
 ALTER TABLE DEPT_COPY DROP COLUMN DEPT_ID;
  ALTER TABLE DEPT_COPY DROP COLUMN DEPT_TITLE;
   ALTER TABLE DEPT_COPY DROP COLUMN LOCATION_ID;
    ALTER TABLE DEPT_COPY DROP COLUMN CNAME;
    


