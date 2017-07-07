package zukkey.gothic.api.response

/**
 * Created by YUTARO SUZUKI on 2017/07/07.
 * Base response from api
 */

open class BaseResponse {
  var result = "unknown"
}

// app config
class AppConfigResponse : BaseResponse() {
  var app: App? = null

  class App {
    var id = 0
    var name = ""
    var settings: Settings? = null
  }

  class Settings {
    var latestAndroidVersion = "0"
    var isMaintenanced = "0"
    var ngWords = ""
  }
}
