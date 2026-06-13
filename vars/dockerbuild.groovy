def call(Map config =[:]){
  echo "Building Docker image"
  docker build -t paras0999/addressbook:${config.tag} .
  echo "Building image success"
}
