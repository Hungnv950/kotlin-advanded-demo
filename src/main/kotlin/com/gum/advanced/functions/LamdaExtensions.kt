package com.gum.advanced.functions

class Request(val method: String, val query: String, val contentType: String)
class Responne(var content: String, var status: Status) {
    fun status(status: Status.() -> Unit) {}
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val responne: Responne) {
    var executeNext = false
    fun next() {
        executeNext = true
    }
}

fun respone(responne: Responne.() -> Unit) {}
fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {
    routeHandler("/index.html") {
        if (request.query != "") {

        }
        respone {
            status {
                code = 404
                description = "Not found"
            }
        }
    }
}
