def call(String step, String message){
    slackSend channel: 'test', message: "${step}: ${message}"
}