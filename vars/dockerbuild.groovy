def call(Map config =[:]){
  docker build -t paras0999/addressbook:${config.tag} .
}
