package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class News20181 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News20181 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC37_0 = new HashMap<>();
    headersUC37_0.put("accept", "*/*");
    headersUC37_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC37_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC37_0.put("content-type", "text/plain");
    headersUC37_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC37_0.put("priority", "u=1, i");
    headersUC37_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC37_0.put("sec-ch-ua-mobile", "?0");
    headersUC37_0.put("sec-ch-ua-platform", "Linux");
    headersUC37_0.put("sec-fetch-dest", "empty");
    headersUC37_0.put("sec-fetch-mode", "cors");
    headersUC37_0.put("sec-fetch-site", "cross-site");
    headersUC37_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC37_1 = new HashMap<>();
    headersUC37_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC37_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC37_1.put("sec-ch-ua-mobile", "?0");
    headersUC37_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC37_14 = new HashMap<>();
    headersUC37_14.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC37_14.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC37_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC37_14.put("priority", "u=0, i");
    headersUC37_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC37_14.put("sec-ch-ua-mobile", "?0");
    headersUC37_14.put("sec-ch-ua-platform", "Linux");
    headersUC37_14.put("sec-fetch-dest", "document");
    headersUC37_14.put("sec-fetch-mode", "navigate");
    headersUC37_14.put("sec-fetch-site", "same-origin");
    headersUC37_14.put("sec-fetch-user", "?1");
    headersUC37_14.put("upgrade-insecure-requests", "1");
    headersUC37_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC37_29 = new HashMap<>();
    headersUC37_29.put("Upgrade-Insecure-Requests", "1");
    headersUC37_29.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC37_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC37_29.put("sec-ch-ua-mobile", "?0");
    headersUC37_29.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC37_30 = new HashMap<>();
    headersUC37_30.put("accept", "*/*");
    headersUC37_30.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC37_30.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC37_30.put("origin", "https://shtab.opmoscow.ru");
    headersUC37_30.put("priority", "u=1, i");
    headersUC37_30.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC37_30.put("sec-ch-ua-mobile", "?0");
    headersUC37_30.put("sec-ch-ua-platform", "Linux");
    headersUC37_30.put("sec-fetch-dest", "empty");
    headersUC37_30.put("sec-fetch-mode", "cors");
    headersUC37_30.put("sec-fetch-site", "cross-site");
    headersUC37_30.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC37_32 = new HashMap<>();
    headersUC37_32.put("accept", "*/*");
    headersUC37_32.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC37_32.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC37_32.put("origin", "https://shtab.opmoscow.ru");
    headersUC37_32.put("priority", "u=4, i");
    headersUC37_32.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC37_32.put("sec-ch-ua-mobile", "?0");
    headersUC37_32.put("sec-ch-ua-platform", "Linux");
    headersUC37_32.put("sec-fetch-dest", "empty");
    headersUC37_32.put("sec-fetch-mode", "no-cors");
    headersUC37_32.put("sec-fetch-site", "cross-site");
    headersUC37_32.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC37 = scenario("Archive.News20181")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=5&wv-type=7&wmode=0&wv-hit=823493627&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fkonstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-&rn=670749817&browser-info=we%3A1%3Aet%3A1724483083%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824120443%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483083&t=gdpr(14)ti(1)")
          .headers(headersUC37_0)
          .body(RawFileBody("news20181/0000_request.gif"))
          .resources(
            http("request_1")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC37_1),
            http("request_2")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC37_1),
            http("request_3")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC37_1),
            http("request_4")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC37_1),
            http("request_5")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC37_1),
            http("request_6")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC37_1),
            http("request_7")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC37_1),
            http("request_8")
              .get(uri2 + "/uploads/media/default/0001/17/4bd9b9fe185a7be5441247e5d48c32d33bbd3e7e.png")
              .headers(headersUC37_1),
            http("request_9")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC37_1),
            http("request_10")
              .get("/metrika/tag.js")
              .headers(headersUC37_1),
            http("request_11")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_12")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_13")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_14")
              .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2018/news/view/konstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-")
              .headers(headersUC37_14),
            http("request_15")
              .get(uri2 + "/uploads/media/default/0001/13/12f5bc97bf8d9321e7c56cf24935c23f2d8d61eb.jpeg")
              .headers(headersUC37_1),
            http("request_16")
              .get(uri2 + "/uploads/media/default/0001/13/714a0bbfdc6c523163eab4f8296fef1fa2d63b25.jpeg")
              .headers(headersUC37_1),
            http("request_17")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC37_1),
            http("request_18")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC37_1),
            http("request_19")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC37_1),
            http("request_20")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC37_1),
            http("request_21")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC37_1),
            http("request_22")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC37_1),
            http("request_23")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC37_1),
            http("request_24")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC37_1),
            http("request_25")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC37_1),
            http("request_26")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC37_1),
            http("request_27")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC37_1),
            http("request_28")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC37_1),
            http("request_29")
              .get("/metrika/metrika_match.html")
              .headers(headersUC37_29),
            http("request_30")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fkonstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A313913233%3Az%3A300%3Ai%3A20240824120444%3Aet%3A1724483085%3Ac%3A1%3Arn%3A169391289%3Arqn%3A179%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C425%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483084081%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483085%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC37_30),
            http("request_31")
              .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fkonstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A313913233%3Az%3A300%3Ai%3A20240824120444%3Aet%3A1724483085%3Ac%3A1%3Arn%3A366779033%3Arqn%3A99%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A580%3Awv%3A2%3Ads%3A0%2C0%2C425%2C242%2C1%2C0%2C%2C68%2C%2C%2C%2C%2C739%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483084081%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483085%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC37_30),
            http("request_32")
              .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fkonstantin-remchukov-korpusu-nablyudateley-obshchestvennoy-palaty-goroda-moskvy-udalos-obespechit-monitoring-prakticheski-na-vseh-izbiratelnyh-uchastkah-stolicy-snachala-eto-kazalos-nevozmozhnym-&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724483085_e2990ecd18d694b43b5007da5ec7c902269258500983baeb82db231644b7a37d&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A313913233%3Az%3A300%3Ai%3A20240824120445%3Aet%3A1724483085%3Ac%3A1%3Arn%3A378978882%3Arqn%3A100%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C15%2C767%2C767%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724483084081%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483085&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC37_32)
          )
      );

	  setUp(scnUC37.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News20181);
  }
}
