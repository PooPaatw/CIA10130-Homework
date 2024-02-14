-- 1. 顯示所有員工的最高、最低、總和及平均薪資,依序將表頭命名為 Maximum, Minimum, Sum
-- 和 Average,請將結果顯示為四捨五入的整數。
SELECT  ROUND(MAX(sal),0) 'Maximum', ROUND(MIN(sal),0) 'Minimum', ROUND(SUM(sal),0) 'Sum', ROUND(AVG(sal),0) 'Average'
FROM emp;
-- 2. 顯示每種職稱的最低、最高、總和及平均薪水。
SELECT job, MAX(sal), MIN(sal), SUM(sal), AVG(sal)
FROM emp
GROUP BY job ;
-- 3. 顯示每種職稱的人數。
SELECT job , COUNT(*)
FROM emp
GROUP BY job
ORDER BY COUNT(* ) DESC;
-- 4. 顯示資料項命名為Number of Managers來表示擔任主管的人數。
SELECT COUNT(DISTINCT MGR) 'Number of Managers'
FROM emp;
-- 5. 顯示資料項命名為DIFFERENCE的資料來表示公司中最高和最低薪水間的差額。
SELECT (MAX(sal) - MIN(sal)) 'DIFFERENCE'
FROM emp;
-- 6. 顯示每位主管的員工編號及該主管下屬員工最低的薪資,排除沒有主管和下屬員工最低薪資 少於1000的主管,並以下屬員工最低薪資作降冪排列。
SELECT  mgr, min(sal) 
FROM emp 
WHERE mgr IS NOT NULL group by mgr having min(sal) > 1000 order by min(sal) DESC;
-- 7. 顯示在2011及2013年進公司的員工數量,並給該資料項一個合適的名稱。
SELECT LEFT(hiredate,4) AS '入職日期', count(LEFT(hiredate,4)) AS '老員工' 
FROM emp 
WHERE (LEFT(hiredate,4) = 2011 or LEFT(hiredate,4) = 2013) group by LEFT(hiredate,4);