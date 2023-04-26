def call(String var_email) {
    println("var_email: ${var_email}")
    println("Current login user: ${env.USER}")
    println("Current job name: ${env.JOB_NAME}")
}
