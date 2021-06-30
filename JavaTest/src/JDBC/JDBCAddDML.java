package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCAddDML {
public static void main(String[] args) {
		
		// 연결 객체 : 연결 정보를 가진다.
		Connection conn = null;
		// sql을 실행 할  메소드 제공
		Statement stmt = null;
		// executeQuery() 반환타입 -> select의 결과(표)를 담는 객체 
		ResultSet rs = null;
		//Statement -> PreparedStatement  : 성능개선
		PreparedStatement pstmt = null;
		
		
		Scanner s = new Scanner(System.in);
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공!");
			
			// 2. 연결
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "admin";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("데이터베이스 연결 성공!!!");
			
			System.out.println("부서 정보 입력을 시작합니다.");
			System.out.println("부서 이름을 입력해주세요");
			String DNAME = s.nextLine();
			System.out.println("부서 위치");
			String LOC = s.nextLine();
			
			
			// 3. sql 처리
			stmt = conn.createStatement();
			
			int dno = 10;
			String otype = "deptno";
			
			String sqlSelect = 
					"select * from dept where deptno = "+dno+" order by " + otype;
					
			rs = stmt.executeQuery(sqlSelect);
			
			// rs.next() -> 다음행의 존재 유무 확인
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				System.out.print(deptno + "\t");
				String dname = rs.getString("dname");
				System.out.print(dname + "\t");
				String loc = rs.getString("loc");
				System.out.println(loc + "\t");
			}
			
			/////////////////////////////////////////////
			// PreparedStatement -> Sql 먼저 등록 -> 매개변수처럼 ?를 이용해서 나중에 변수를 바인딩
			
			System.out.println("PrepqredStatement 사용");
			System.out.println("=========================================");
			
			String sqlSelect2 = "select * from dept where deptno = ? ";
			pstmt = conn.prepareStatement(sqlSelect2);
			// ? 변수에 데이터 바인딩
			pstmt.setInt(1, 10);
			
			rs = pstmt.executeQuery();
		
			// 3. 사용자에게 정보를 받아 데이터를 처리 해보자 (DB 데이터 입력)
			
			String sql = "INSERT INTO dept01 VALUES (DEPT_DEPTNO_SEQ.nextval, ? ,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, DNAME);
			pstmt.setString(2, LOC);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("입력됨");
			} else {
				System.out.println("입력실패");
			}
			
			
			
			
			
			conn.commit();
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 찾지못함!!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패!!!");
			e.printStackTrace();
		} finally {
			
			// 4. close
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
