<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.agora.io/sdk/release/AgoraRTCSDK-3.6.5.js"></script>
<link rel="stylesheet" type="text/css" href="./styles/styles.css"/>
</head>
<body>
	Welcome to login page!
	<h1>
        Video Call<br><small style="font-size: 14pt;">Powered by Agora.io</small>
    </h1>
    <h4>Local video</h4>
    <div id="me"></div>
    <h4>Remote video</h4>
    <div id="remote-container">
    </div>
    <script src="./scripts/script.js"></script>
	
</body>
</html>