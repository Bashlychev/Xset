package Projects.voteGD.com;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MgdIzbiratUchastki extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://votegd.com")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_0.put("accept-language", "ru-RU,ru;q=0.9");
    headers_0.put("priority", "u=0, i");
    headers_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    headers_0.put("sec-fetch-dest", "document");
    headers_0.put("sec-fetch-mode", "navigate");
    headers_0.put("sec-fetch-site", "same-origin");
    headers_0.put("sec-fetch-user", "?1");
    headers_0.put("upgrade-insecure-requests", "1");
    headers_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    headers_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_6 = new HashMap<>();
    headers_6.put("accept", "*/*");
    headers_6.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_6.put("accept-language", "ru-RU,ru;q=0.9");
    headers_6.put("origin", "https://votegd.com");
    headers_6.put("priority", "u=1, i");
    headers_6.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_6.put("sec-ch-ua-mobile", "?0");
    headers_6.put("sec-ch-ua-platform", "Linux");
    headers_6.put("sec-fetch-dest", "empty");
    headers_6.put("sec-fetch-mode", "cors");
    headers_6.put("sec-fetch-site", "cross-site");
    headers_6.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("Origin", "https://yandex.ru");
    headers_7.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    headers_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_7.put("sec-ch-ua-mobile", "?0");
    headers_7.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("Upgrade-Insecure-Requests", "1");
    headers_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    headers_10.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_10.put("sec-ch-ua-mobile", "?0");
    headers_10.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_11 = new HashMap<>();
    headers_11.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_11.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_11.put("accept-language", "ru-RU,ru;q=0.9");
    headers_11.put("priority", "u=0, i");
    headers_11.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_11.put("sec-ch-ua-mobile", "?0");
    headers_11.put("sec-ch-ua-platform", "Linux");
    headers_11.put("sec-fetch-dest", "iframe");
    headers_11.put("sec-fetch-mode", "navigate");
    headers_11.put("sec-fetch-site", "cross-site");
    headers_11.put("upgrade-insecure-requests", "1");
    headers_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_29 = new HashMap<>();
    headers_29.put("accept", "*/*");
    headers_29.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_29.put("accept-language", "ru-RU,ru;q=0.9");
    headers_29.put("origin", "https://yandex.ru");
    headers_29.put("priority", "u=1, i");
    headers_29.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_29.put("sec-ch-ua-mobile", "?0");
    headers_29.put("sec-ch-ua-platform", "Linux");
    headers_29.put("sec-fetch-dest", "empty");
    headers_29.put("sec-fetch-mode", "cors");
    headers_29.put("sec-fetch-site", "same-site");
    headers_29.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_31 = new HashMap<>();
    headers_31.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_63 = new HashMap<>();
    headers_63.put("accept", "*/*");
    headers_63.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_63.put("accept-language", "ru-RU,ru;q=0.9");
    headers_63.put("origin", "https://votegd.com");
    headers_63.put("priority", "u=1, i");
    headers_63.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_63.put("sec-ch-ua-mobile", "?0");
    headers_63.put("sec-ch-ua-platform", "Linux");
    headers_63.put("sec-fetch-dest", "empty");
    headers_63.put("sec-fetch-mode", "no-cors");
    headers_63.put("sec-fetch-site", "cross-site");
    headers_63.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    String uri2 = "https://yandex.ru/map-widget/v1";
    
    String uri3 = "https://core-renderer-tiles.maps.yandex.net";
    
    String uri4 = "https://fonts.gstatic.com/s/montserrat/v26";
    
    String uri5 = "https://yastatic.net";
    
    String uri6 = "https://www.google-analytics.com/g/collect";
    
    String uri7 = "https://mc.yandex.ru";

    ScenarioBuilder scn = scenario("Projects.voteGD.com.MgdIzbiratUchastki")
      .exec(
        http("request_0")
          .get("/mgd/2024/izbiratelnye-uchastki/")
          .headers(headers_0)
          .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0000_response.html")))
          .resources(
            http("request_1")
              .get(uri7 + "/metrika/tag.js")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0001_response.js"))),
            http("request_2")
              .get(uri4 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
            http("request_3")
              .get(uri4 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
            http("request_4")
              .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
            http("request_5")
              .get("/layout/fonts/Linearicons.ttf"),
            http("request_6")
              .get(uri7 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fizbiratelnye-uchastki%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fdistrict%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A488701907%3Az%3A300%3Ai%3A20240817145028%3Aet%3A1723888229%3Ac%3A1%3Arn%3A492107975%3Arqn%3A106%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C90%2C1%2C3%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723888228467%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723888229%3At%3A%D0%98%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B8%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B%20%D0%B8%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%2C%20%D0%BD%D0%B0%D0%B9%D1%82%D0%B8%20%D0%B8%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BE%D0%BA%20%D0%BF%D0%BE%20%D0%B0%D0%B4%D1%80%D0%B5%D1%81%D1%83%20%7C%20VoteGD&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
              .headers(headers_6),
            http("request_7")
              .get(uri5 + "/react/18.2.0/react-with-dom.min.js")
              .headers(headers_7)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0007_response.js"))),
            http("request_8")
              .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/map-widget-base/b7997d09cf76c84ddb30.yandex.ru.js")
              .headers(headers_7)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0008_response.js"))),
            http("request_9")
              .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/map-widget-app/53973c938b1b5e99d06b.yandex.ru.js")
              .headers(headers_7)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0009_response.js"))),
            http("request_10")
              .get(uri7 + "/metrika/metrika_match.html")
              .headers(headers_10),
            http("request_11")
              .get(uri2 + "/?lang=ru_RU&scroll=true&source=constructor-api&um=constructor%3A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0")
              .headers(headers_11)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0011_response.html"))),
            http("request_12")
              .get("/favicon.ico")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0012_response.ico"))),
            http("request_13")
              .get(uri7 + "/metrika/tag_turbo.js")
              .headers(headers_7)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0013_response.js"))),
            http("request_14")
              .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps/e78769675abf0f02e6ea.css")
              .headers(headers_7)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0014_response.css"))),
            http("request_15")
              .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps/183d1189d7d05a8929fc.yandex.ru.js")
              .headers(headers_7)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0015_response.js"))),
            http("request_16")
              .get(uri7 + "/metrika/advert.gif")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0016_response.gif"))),
            http("request_17")
              .get(uri5 + "/s3/front-maps-static/maps-front-maps/build/client/map-widget/chunks/ymaps-vector/ee842efbec35c2934006.yandex.ru.js")
              .headers(headers_7)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0017_response.js"))),
            http("request_18")
              .get(uri5 + "/s3/front-maps-static/maps-front-maps/static/v48/icons/core/logo-24.svg")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0018_response.svg"))),
            http("request_19")
              .get(uri5 + "/s3/front-maps-static/maps-front-maps/_/fd161c881e6392111418a1036fe1188e.svg")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0019_response.svg"))),
            http("request_20")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=309&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0020_response.png"))),
            http("request_21")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=308&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0021_response.png"))),
            http("request_22")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=309&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0022_response.png"))),
            http("request_23")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=308&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0023_response.png"))),
            http("request_24")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=309&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0024_response.png"))),
            http("request_25")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=310&y=161&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0025_response.png"))),
            http("request_26")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=308&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0026_response.png"))),
            http("request_27")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=310&y=160&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0027_response.png"))),
            http("request_28")
              .get(uri3 + "/tiles?l=map&v=24.08.14-3-b240606123130&x=310&y=162&z=9&scale=1&lang=ru_RU&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp&ads=enabled")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0028_response.png"))),
            http("request_29")
              .get(uri7 + "/watch/44120344?wmode=7&page-url=https%3A%2F%2Fyandex.ru%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&page-ref=https%3A%2F%2Fvotegd.com%2F&nohit=1&charset=utf-8&ut=noindex&browser-info=pv%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1396948963104%3Ahid%3A583198923%3Az%3A300%3Ai%3A20240817145029%3Aet%3A1723888229%3Ac%3A1%3Arn%3A983645160%3Au%3A172388805013444438%3Aw%3A500x400%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Arqnl%3A1%3Ast%3A1723888229%3At%3Amap%20frame&t=gdpr(8-0)mc(h-1)cdl(na)eco(25632)ti(2)")
              .headers(headers_29),
            http("request_30")
              .get(uri7 + "/watch/44120344?page-url=https%3A%2F%2Fyandex.ru%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&page-ref=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&ut=noindex&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Aar%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1396948963104%3Ahid%3A583198923%3Az%3A300%3Ai%3A20240817145029%3Aet%3A1723888229%3Ac%3A1%3Arn%3A159854778%3Arqn%3A2%3Au%3A172388805013444438%3Aw%3A500x400%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Afp%3A454%3Ads%3A0%2C0%2C120%2C356%2C2%2C0%2C%2C8%2C0%2C510%2C511%2C0%2C510%3Arqnl%3A1%3Ast%3A1723888230%3At%3Amap%20frame&t=gdpr(8-0)mc(h-1)cdl(na)eco(25632)ti(2)")
              .headers(headers_29),
            http("request_31")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=154&y=81&z=8&zmin=9&zmax=9&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0031_response.dat"))),
            http("request_32")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=155&y=81&z=8&zmin=9&zmax=9&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0032_response.dat"))),
            http("request_33")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=155&y=80&z=8&zmin=9&zmax=9&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0033_response.dat"))),
            http("request_34")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=76&y=40&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0034_response.dat"))),
            http("request_35")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=76&y=39&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0035_response.dat"))),
            http("request_36")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=78&y=39&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0036_response.dat"))),
            http("request_37")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=76&y=41&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0037_response.dat"))),
            http("request_38")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=77&y=41&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0038_response.dat"))),
            http("request_39")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=78&y=41&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0039_response.dat"))),
            http("request_40")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=78&y=40&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0040_response.dat"))),
            http("request_41")
              .get(uri3 + "/vmap2/tiles?lang=ru_RU&x=77&y=39&z=7&zmin=8&zmax=8&v=24.08.14-3-b240606123130&ads=enabled&client_id=yandex-web-maps&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0041_response.dat"))),
            http("request_42")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0042_response.dat"))),
            http("request_43")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=384,512&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0043_response.dat"))),
            http("request_44")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=915f3cad32f446e5df58ef8e63b6041edf0768ad~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0044_response.dat"))),
            http("request_45")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0045_response.dat"))),
            http("request_46")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0046_response.dat"))),
            http("request_47")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=87931be60dd7d1ced983a8030b11bd153c5e45ed~~3&range=128,256&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0047_response.dat"))),
            http("request_48")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=9f08a647bf335ac646f57a03dbb3a12bd8cab4d0~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0048_response.dat"))),
            http("request_49")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=512,640&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0049_response.dat"))),
            http("request_50")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0050_response.dat"))),
            http("request_51")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=8db20f4aff1fcc33f4eebad812e55d403dfaa7ad~~3&range=128,256&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0051_response.dat"))),
            http("request_52")
              .get(uri7 + "/watch/44120344/1?page-url=https%3A%2F%2Fyandex.ru%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&page-ref=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&ut=noindex&uah=chu%0A%22Not%29A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not%29A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Aar%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1396948963104%3Ahid%3A583198923%3Az%3A300%3Ai%3A20240817145029%3Aet%3A1723888229%3Ac%3A1%3Arn%3A159854778%3Arqn%3A2%3Au%3A172388805013444438%3Aw%3A500x400%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Afp%3A454%3Ads%3A0%2C0%2C120%2C356%2C2%2C0%2C%2C8%2C0%2C510%2C511%2C0%2C510%3Arqnl%3A1%3Ast%3A1723888230%3At%3Amap%20frame&t=gdpr%288-0%29mc%28h-1%29cdl%28na%29eco%2825632%29ti%282%29&redirnss=1")
              .headers(headers_29)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0052_response.gif"))),
            http("request_53")
              .get(uri3 + "/vmap2/glyphs?lang=ru_RU&font_id=9f08a647bf335ac646f57a03dbb3a12bd8cab4d0~~3&range=0,128&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0053_response.dat"))),
            http("request_54")
              .get(uri3 + "/vmap2/icons?id=35KY2RCBV5UN&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0054_response.png"))),
            http("request_55")
              .get(uri3 + "/vmap2/icons?id=3MDHL74NGZ6I&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0055_response.png"))),
            http("request_56")
              .get(uri3 + "/vmap2/icons?id=MYAME2F7IXSA&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0056_response.png"))),
            http("request_57")
              .get(uri3 + "/vmap2/icons?id=5OUVCBDHHTMI&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0057_response.png"))),
            http("request_58")
              .get(uri3 + "/vmap2/icons?id=WC7UI5W5A2ES&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0058_response.png"))),
            http("request_59")
              .get(uri3 + "/vmap2/icons?id=5MSS5TIZMCJG&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0059_response.png"))),
            http("request_60")
              .get(uri3 + "/vmap2/icons?id=FS6W7IMVXR26&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0060_response.png"))),
            http("request_61")
              .get(uri3 + "/vmap2/icons?id=RBNVYF5LUL4O&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0061_response.png"))),
            http("request_62")
              .get(uri3 + "/vmap2/icons?id=BXMZY45DINKS&scale=1&experimental_ranking_mode_name=default-web-ranking&experimental_pers_poi=social_subscriptions&experimental_pers_poi=&experimental_data_hd=vegetation_model_exp")
              .headers(headers_31)
              .check(bodyBytes().is(RawFileBody("mgdizbiratuchastki/0062_response.png")))
          )
      )
      .pause(3)
      .exec(
        http("request_63")
          .post(uri6 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723888228573&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=1736459249.1723885632&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&sid=1723885632&sct=1&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fizbiratelnye-uchastki%2F&dr=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fdistrict%2F&dt=%D0%98%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B8%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B%20%D0%B8%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%2C%20%D0%BD%D0%B0%D0%B9%D1%82%D0%B8%20%D0%B8%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BE%D0%BA%20%D0%BF%D0%BE%20%D0%B0%D0%B4%D1%80%D0%B5%D1%81%D1%83%20%7C%20VoteGD&en=page_view&_ee=1&tfd=5180")
          .headers(headers_63)
      )
      .pause(10)
      .exec(
        http("request_64")
          .get(uri7 + "/watch/44120344?page-url=%2Fmap-widget%2Fv1%2F%3Flang%3Dru_RU%26scroll%3Dtrue%26source%3Dconstructor-api%26um%3Dconstructor%253A174a1dc6fd94994d2d678bdaf68a6995b2ee8570350e21dcfdf7d34dfa265ca0&charset=utf-8&ut=noindex&hittoken=1723888229_0bfeff3b505aec53fc1c92f05674f3f6bf5e6d2391b56ea6cf459a80941801e2&browser-info=nb%3A1%3Acl%3A945%3Aar%3A1%3Avf%3A51ws7ei066ityj92vuvd23adxu%3Afu%3A3%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1396948963104%3Ahid%3A583198923%3Aphid%3A488701907%3Az%3A300%3Ai%3A20240817145044%3Aet%3A1723888244%3Ac%3A1%3Arn%3A719927935%3Arqn%3A3%3Au%3A172388805013444438%3Aw%3A500x400%3As%3A1920x1080x24%3Ask%3A1%3Aifr%3A1%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723888244&t=gdpr(8-0)mc(h-1)cdl(na)eco(25632)dss(2)ti(2)")
          .headers(headers_29)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
