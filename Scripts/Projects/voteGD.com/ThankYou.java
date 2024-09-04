package Projects.voteGD.com;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class ThankYou extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate, br")
      .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
      .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("origin", "https://votegd.com");
    headers_0.put("pragma", "no-cache");
    headers_0.put("priority", "u=4, i");
    headers_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    headers_0.put("sec-fetch-dest", "empty");
    headers_0.put("sec-fetch-mode", "no-cors");
    headers_0.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_1.put("origin", "https://votegd.com");
    headers_1.put("pragma", "no-cache");
    headers_1.put("priority", "u=0, i");
    headers_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Linux");
    headers_1.put("sec-fetch-dest", "document");
    headers_1.put("sec-fetch-mode", "navigate");
    headers_1.put("sec-fetch-site", "same-origin");
    headers_1.put("sec-fetch-user", "?1");
    headers_1.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("origin", "https://votegd.com");
    headers_2.put("pragma", "no-cache");
    headers_2.put("priority", "u=1, i");
    headers_2.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "Linux");
    headers_2.put("sec-fetch-dest", "empty");
    headers_2.put("sec-fetch-mode", "cors");
    headers_2.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("accept", "text/css,*/*;q=0.1");
    headers_3.put("pragma", "no-cache");
    headers_3.put("priority", "u=0");
    headers_3.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Linux");
    headers_3.put("sec-fetch-dest", "style");
    headers_3.put("sec-fetch-mode", "no-cors");
    headers_3.put("sec-fetch-site", "cross-site");
    headers_3.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlKHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("pragma", "no-cache");
    headers_4.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_4.put("sec-ch-ua-mobile", "?0");
    headers_4.put("sec-ch-ua-platform", "Linux");
    headers_4.put("sec-fetch-dest", "script");
    headers_4.put("sec-fetch-mode", "no-cors");
    headers_4.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("origin", "https://votegd.com");
    headers_7.put("pragma", "no-cache");
    headers_7.put("priority", "u=0");
    headers_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_7.put("sec-ch-ua-mobile", "?0");
    headers_7.put("sec-ch-ua-platform", "Linux");
    headers_7.put("sec-fetch-dest", "font");
    headers_7.put("sec-fetch-mode", "cors");
    headers_7.put("sec-fetch-site", "cross-site");
    headers_7.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlKHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_9.put("pragma", "no-cache");
    headers_9.put("priority", "u=0, i");
    headers_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_9.put("sec-ch-ua-mobile", "?0");
    headers_9.put("sec-ch-ua-platform", "Linux");
    headers_9.put("sec-fetch-dest", "iframe");
    headers_9.put("sec-fetch-mode", "navigate");
    headers_9.put("sec-fetch-site", "cross-site");
    headers_9.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("accept", "text/css,*/*;q=0.1");
    headers_10.put("pragma", "no-cache");
    headers_10.put("priority", "u=0");
    headers_10.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_10.put("sec-ch-ua-mobile", "?0");
    headers_10.put("sec-ch-ua-platform", "Linux");
    headers_10.put("sec-fetch-dest", "style");
    headers_10.put("sec-fetch-mode", "no-cors");
    headers_10.put("sec-fetch-site", "same-origin");
    
    Map<CharSequence, String> headers_12 = new HashMap<>();
    headers_12.put("pragma", "no-cache");
    headers_12.put("priority", "u=1");
    headers_12.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_12.put("sec-ch-ua-mobile", "?0");
    headers_12.put("sec-ch-ua-platform", "Linux");
    headers_12.put("sec-fetch-dest", "script");
    headers_12.put("sec-fetch-mode", "no-cors");
    headers_12.put("sec-fetch-site", "same-origin");
    
    Map<CharSequence, String> headers_13 = new HashMap<>();
    headers_13.put("pragma", "no-cache");
    headers_13.put("priority", "u=2");
    headers_13.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_13.put("sec-ch-ua-mobile", "?0");
    headers_13.put("sec-ch-ua-platform", "Linux");
    headers_13.put("sec-fetch-dest", "script");
    headers_13.put("sec-fetch-mode", "no-cors");
    headers_13.put("sec-fetch-site", "same-origin");
    
    Map<CharSequence, String> headers_15 = new HashMap<>();
    headers_15.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_15.put("pragma", "no-cache");
    headers_15.put("priority", "i");
    headers_15.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_15.put("sec-ch-ua-mobile", "?0");
    headers_15.put("sec-ch-ua-platform", "Linux");
    headers_15.put("sec-fetch-dest", "image");
    headers_15.put("sec-fetch-mode", "no-cors");
    headers_15.put("sec-fetch-site", "same-origin");
    
    Map<CharSequence, String> headers_17 = new HashMap<>();
    headers_17.put("origin", "https://votegd.com");
    headers_17.put("pragma", "no-cache");
    headers_17.put("priority", "u=0");
    headers_17.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_17.put("sec-ch-ua-mobile", "?0");
    headers_17.put("sec-ch-ua-platform", "Linux");
    headers_17.put("sec-fetch-dest", "font");
    headers_17.put("sec-fetch-mode", "cors");
    headers_17.put("sec-fetch-site", "same-origin");
    
    Map<CharSequence, String> headers_18 = new HashMap<>();
    headers_18.put("origin", "https://votegd.com");
    headers_18.put("pragma", "no-cache");
    headers_18.put("priority", "u=1, i");
    headers_18.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_18.put("sec-ch-ua-mobile", "?0");
    headers_18.put("sec-ch-ua-platform", "Linux");
    headers_18.put("sec-fetch-dest", "empty");
    headers_18.put("sec-fetch-mode", "no-cors");
    headers_18.put("sec-fetch-site", "cross-site");
    
    String uri1 = "https://votegd.com";
    
    String uri2 = "https://www.googletagmanager.com/gtag/js";
    
    String uri3 = "https://fonts.gstatic.com/s/montserrat/v26";
    
    String uri4 = "https://fonts.googleapis.com/css2";
    
    String uri5 = "https://www.google-analytics.com/g/collect";

    ScenarioBuilder scn = scenario("Projects.voteGD.com.ThankYou")
      .exec(
        http("request_0")
          .post("/watch/78422502/1?page-url=form%3A%2F%2Fvotegd.com%2F%3Fi%3Dw0%26p%3DFAAA%25C2%2584A&page-ref=https%3A%2F%2Fvotegd.com%2Fmessage%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1723969246_dd2d6f10911ae954873356593e6d8256d1fe1ee8b76e2653a726e6d8ad95255b&browser-info=ar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A3%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1611288404515%3Ahid%3A533944847%3Az%3A300%3Ai%3A20240818132106%3Aet%3A1723969266%3Ac%3A1%3Arn%3A224116031%3Arqn%3A72%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1723969246190%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1723969266%3At%3A%D0%9D%D0%B0%D0%BF%D0%B8%D1%81%D0%B0%D1%82%D1%8C%20%D0%BD%D0%B0%D0%BC%20%7C%20Vote%D0%93%D0%94&t=gdpr(14)clc(5-776-710)rqnt(3)aw(1)rcm(1)cdl(na)eco(21037568)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ite%22%3A1%7D%7D")
          .headers(headers_0)
          .resources(
            http("request_1")
              .post(uri1 + "/message/")
              .headers(headers_1)
              .formParam("_csrf", "5BxBixxo28b9-47OSomCb6eRLlf-yIFpkJwqOK066iKIKnPpcS2J9Ki-6L0A8_U_nsVXAY_x4xjC-R8L2gqdTA==")
              .formParam("Feedback[contact]", "NameTest")
              .formParam("Feedback[message]", "MessageTest")
              .formParam("Feedback[captcha]", "unpvoaj"),
            http("request_2")
              .get("/clmap/78422502?page-url=https%3A%2F%2Fvotegd.com%2Fmessage%2F&pointer-click=rn%3A201365201%3Ax%3A33444%3Ay%3A3389%3At%3A199%3Ap%3A%3FFAAA%C2%84A%3AX%3A954%3AY%3A916&browser-info=u%3A1723808625578809752%3Av%3A1410%3Avf%3Acstsejpczyib8nf716ce02r1en%3Arqnl%3A1%3Ast%3A1723969266&t=gdpr(14)ti(1)")
              .headers(headers_2),
            http("request_3")
              .get(uri4 + "?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap")
              .headers(headers_3),
            http("request_4")
              .get("/metrika/tag.js")
              .headers(headers_4),
            http("request_5")
              .get(uri2 + "?id=G-126E14W1P6")
              .headers(headers_4),
            http("request_6")
              .get("/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fthank-you%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmessage%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1611288404515%3Ahid%3A72126281%3Az%3A300%3Ai%3A20240818132106%3Aet%3A1723969267%3Ac%3A1%3Arn%3A282279506%3Arqn%3A73%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C99%2C2%2C118%2C116%2C1%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723969266480%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723969267%3At%3A&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037568)ti(1)")
              .headers(headers_2),
            http("request_7")
              .get(uri3 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
              .headers(headers_7),
            http("request_8")
              .get(uri3 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
              .headers(headers_7),
            http("request_9")
              .get("/metrika/metrika_match.html")
              .headers(headers_9),
            http("request_10")
              .get(uri1 + "/layout/css/bootstrap.css")
              .headers(headers_10),
            http("request_11")
              .get(uri1 + "/layout/css/style.css")
              .headers(headers_10),
            http("request_12")
              .get(uri1 + "/assets/777cc481/jquery.js")
              .headers(headers_12),
            http("request_13")
              .get(uri1 + "/assets/8f4a1b0a/yii.js")
              .headers(headers_13),
            http("request_14")
              .get(uri1 + "/layout/js/core.min.js")
              .headers(headers_13),
            http("request_15")
              .get(uri1 + "/layout/images/minilogo.png")
              .headers(headers_15),
            http("request_16")
              .get(uri1 + "/layout/js/script.js")
              .headers(headers_13),
            http("request_17")
              .get(uri1 + "/layout/fonts/fontawesome-webfont.woff2?v=4.7.0")
              .headers(headers_17)
          )
      )
      .pause(4)
      .exec(
        http("request_18")
          .post(uri5 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723969266712&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=334390374.1723808625&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&sid=1723968393&sct=6&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fthank-you%2F&dr=https%3A%2F%2Fvotegd.com%2Fmessage%2F&dt=&en=page_view&_ee=1&tfd=5436")
          .headers(headers_18)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
