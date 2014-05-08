class UrlMappings {

	static mappings = {
	"/admin/manage/$action?"(controller: "adminManage")
"/adminManage/$action?"(controller: "errors", action: "urlMapping")
 
"403"(controller: "errors", action: "accessDenied")
"404"(controller: "errors", action: "notFound")
"405"(controller: "errors", action: "notAllowed")
"500"(controller: "errors", action: "error")

        "/"(view:"/index")
        "500"(view:'/error')
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }



	}
}
