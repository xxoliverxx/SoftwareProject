<%@page pageEncoding="utf-8" import="dao.empdao,java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>home Emp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								2018/7/6
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#">ELO</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						欢迎使用ELO排名匹配算法
					</h1>
					<form action="add" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<p>
									<input type="submit" class="button" value="个人比赛排名" />
								</p>
							</tr>
							<tr>
								<p>
									<input type="submit" class="button" value="联赛匹配排名" />
								</p>
								
							</tr>
							
						</table>
						
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					欢迎使用ELO排名!
				</div>
			</div>
		</div>
	</body>
</html>

