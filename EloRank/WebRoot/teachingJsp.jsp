<%@page pageEncoding="utf-8" import="dao.users,java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p> 
							2018/04/08 
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">个人排名查看</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1> 
						欢迎!&nbsp;</h1>
					<table class="table" width="770" height="333">
						<tr class="table_header">
							<td>
								id
							</td>
							<td>
								用户名
							</td>
							<td>
								rank分
							</td>
							<td>
								段位
							</td>
							
						</tr>
						<%
                        ArrayList<users> emps=(ArrayList<users>)request.getAttribute("eps");
						for(int i=0;i<emps.size();i++)
						{
							users emp=emps.get(i);
						%>
						<tr class="row">
							<td>
								<%out.print(emp.id);%>
							</td>
							<td> 
								<%out.print(emp.name); %>
							</td>
							<td>
								<%out.print(emp.rank); %>
							</td>
							<td>
								<%out.print(emp.score); %>
							</td>
							
						</tr>
						<%}
						 %>
					</table>
					<p>
					
					</p>	
						
					<p>
						<input type="submit" class="button" value="匹配" />
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				欢迎使用ELO匹配
				</div>
			</div>
		</div>
	</body>
</html>