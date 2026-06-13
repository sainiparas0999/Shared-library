def call(Map config =[:]){
  sh 'docker build -t paras0999/addressbook:${config.tag} . '
}
