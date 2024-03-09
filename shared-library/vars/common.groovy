def compile() {
    if (env.codetype == "maven") {
        print 'Maven'
    }

    if (env.codetype == "nodejs") {
        print 'NodeJS'
    }

    if (env.codetype == "python") {
        print 'python'
    }

    if (env.codetype == "static") {
        print 'static'
    }
}
