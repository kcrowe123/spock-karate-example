function fn() {
  karate.configure('connectTimeout', 10000);
  karate.configure('readTimeout', 10000);
  karate.configure('ssl', true);

  var config = {
    localUrl: 'http://localhost:' + java.lang.System.getProperty('server.port'),
  };
  print('localUrl::::::::::', config.localUrl);
  return config;
}
