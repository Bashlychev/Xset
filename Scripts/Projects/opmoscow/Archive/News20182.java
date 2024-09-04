package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class News20182 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News20182 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headerssUC380 = new HashMap<>();
    headerssUC380.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headerssUC380.put("accept-encoding", "gzip, deflate, br, zstd");
    headerssUC380.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headerssUC380.put("priority", "u=0, i");
    headerssUC380.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headerssUC380.put("sec-ch-ua-mobile", "?0");
    headerssUC380.put("sec-ch-ua-platform", "Linux");
    headerssUC380.put("sec-fetch-dest", "document");
    headerssUC380.put("sec-fetch-mode", "navigate");
    headerssUC380.put("sec-fetch-site", "same-origin");
    headerssUC380.put("sec-fetch-user", "?1");
    headerssUC380.put("upgrade-insecure-requests", "1");
    headerssUC380.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headerssUC381 = new HashMap<>();
    headerssUC381.put("accept", "*/*");
    headerssUC381.put("accept-encoding", "gzip, deflate, br, zstd");
    headerssUC381.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headerssUC381.put("content-type", "text/plain");
    headerssUC381.put("origin", "https://shtab.opmoscow.ru");
    headerssUC381.put("priority", "u=1, i");
    headerssUC381.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headerssUC381.put("sec-ch-ua-mobile", "?0");
    headerssUC381.put("sec-ch-ua-platform", "Linux");
    headerssUC381.put("sec-fetch-dest", "empty");
    headerssUC381.put("sec-fetch-mode", "cors");
    headerssUC381.put("sec-fetch-site", "cross-site");
    headerssUC381.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headerssUC382 = new HashMap<>();
    headerssUC382.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headerssUC382.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headerssUC382.put("sec-ch-ua-mobile", "?0");
    headerssUC382.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headerssUC386 = new HashMap<>();
    headerssUC386.put("Upgrade-Insecure-Requests", "1");
    headerssUC386.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headerssUC386.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headerssUC386.put("sec-ch-ua-mobile", "?0");
    headerssUC386.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headerssUC387 = new HashMap<>();
    headerssUC387.put("accept", "*/*");
    headerssUC387.put("accept-encoding", "gzip, deflate, br, zstd");
    headerssUC387.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headerssUC387.put("origin", "https://shtab.opmoscow.ru");
    headerssUC387.put("priority", "u=1, i");
    headerssUC387.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headerssUC387.put("sec-ch-ua-mobile", "?0");
    headerssUC387.put("sec-ch-ua-platform", "Linux");
    headerssUC387.put("sec-fetch-dest", "empty");
    headerssUC387.put("sec-fetch-mode", "cors");
    headerssUC387.put("sec-fetch-site", "cross-site");
    headerssUC387.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC38_10 = new HashMap<>();
    headersUC38_10.put("accept", "*/*");
    headersUC38_10.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC38_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC38_10.put("origin", "https://shtab.opmoscow.ru");
    headersUC38_10.put("priority", "u=4, i");
    headersUC38_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC38_10.put("sec-ch-ua-mobile", "?0");
    headersUC38_10.put("sec-ch-ua-platform", "Linux");
    headersUC38_10.put("sec-fetch-dest", "empty");
    headersUC38_10.put("sec-fetch-mode", "no-cors");
    headersUC38_10.put("sec-fetch-site", "cross-site");
    headersUC38_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC38 = scenario("Archive.News20182")
      .exec(
        http("request_0")
          .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2018/news/view/mobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa")
          .headers(headerssUC380)
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=6&wv-type=7&wmode=0&wv-hit=96065233&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&rn=780355716&browser-info=we%3A1%3Aet%3A1724483171%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824120610%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483171&t=gdpr(14)ti(1)")
              .headers(headerssUC381)
              .body(RawFileBody("news20182/0001_request.gif")),
            http("request_2")
              .get("/metrika/tag.js")
              .headers(headerssUC382),
            http("request_3")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_4")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_5")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_6")
              .get("/metrika/metrika_match.html")
              .headers(headerssUC386),
            http("request_7")
              .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A728613432%3Az%3A300%3Ai%3A20240824120611%3Aet%3A1724483172%3Ac%3A1%3Arn%3A710449737%3Arqn%3A103%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A639%3Awv%3A2%3Ads%3A0%2C0%2C444%2C3%2C2%2C0%2C%2C205%2C%2C%2C%2C%2C657%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483170850%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483172%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headerssUC387),
            http("request_8")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A728613432%3Az%3A300%3Ai%3A20240824120611%3Aet%3A1724483171%3Ac%3A1%3Arn%3A994582280%3Arqn%3A182%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C444%2C3%2C2%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483170850%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483171%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headerssUC387),
            http("request_9")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headerssUC382),
            http("request_10")
              .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724483171_9550e802bc4901aecf7b94ad9a00071045209cca406733c9fcc2b951124f9561&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A728613432%3Az%3A300%3Ai%3A20240824120612%3Aet%3A1724483172%3Ac%3A1%3Arn%3A928848901%3Arqn%3A104%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C13%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483170850%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483172&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC38_10)
          )
      )
      .pause(11)
      .exec(
        http("request_11")
          .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmobilnaya-gruppa-obshchestvennogo-shtaba-proverila-soobshchenie-o-prinuzhdenii-k-golosovaniyu-sotrudnikov-mosgortransa&charset=utf-8&hittoken=1724483171_9550e802bc4901aecf7b94ad9a00071045209cca406733c9fcc2b951124f9561&browser-info=nb%3A1%3Acl%3A634%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A728613432%3Az%3A300%3Ai%3A20240824120626%3Aet%3A1724483187%3Ac%3A1%3Arn%3A81577225%3Arqn%3A105%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C%2C4182%2C4182%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724483170850%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1724483187&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(3)lt(6400)aw(1)rcm(0)cdl(na)eco(16851712)dss(1)fid(190)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ct%22%3A%5B%7B%22topic%22%3A15%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A57%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A126%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%5D%7D%7D")
          .headers(headersUC38_10)
      );

	  setUp(scnUC38.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News20182);
  }
}
