package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2021 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2021 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC30_0 = new HashMap<>();
    headersUC30_0.put("accept", "*/*");
    headersUC30_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC30_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC30_0.put("content-type", "text/plain");
    headersUC30_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC30_0.put("priority", "u=1, i");
    headersUC30_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC30_0.put("sec-ch-ua-mobile", "?0");
    headersUC30_0.put("sec-ch-ua-platform", "Linux");
    headersUC30_0.put("sec-fetch-dest", "empty");
    headersUC30_0.put("sec-fetch-mode", "cors");
    headersUC30_0.put("sec-fetch-site", "cross-site");
    headersUC30_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC30_3 = new HashMap<>();
    headersUC30_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC30_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC30_3.put("sec-ch-ua-mobile", "?0");
    headersUC30_3.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC30_44 = new HashMap<>();
    headersUC30_44.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC30_44.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC30_44.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC30_44.put("priority", "u=0, i");
    headersUC30_44.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC30_44.put("sec-ch-ua-mobile", "?0");
    headersUC30_44.put("sec-ch-ua-platform", "Linux");
    headersUC30_44.put("sec-fetch-dest", "document");
    headersUC30_44.put("sec-fetch-mode", "navigate");
    headersUC30_44.put("sec-fetch-site", "same-origin");
    headersUC30_44.put("sec-fetch-user", "?1");
    headersUC30_44.put("upgrade-insecure-requests", "1");
    headersUC30_44.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC30_63 = new HashMap<>();
    headersUC30_63.put("accept", "*/*");
    headersUC30_63.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC30_63.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC30_63.put("origin", "https://shtab.opmoscow.ru");
    headersUC30_63.put("priority", "u=1, i");
    headersUC30_63.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC30_63.put("sec-ch-ua-mobile", "?0");
    headersUC30_63.put("sec-ch-ua-platform", "Linux");
    headersUC30_63.put("sec-fetch-dest", "empty");
    headersUC30_63.put("sec-fetch-mode", "cors");
    headersUC30_63.put("sec-fetch-site", "cross-site");
    headersUC30_63.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC30_67 = new HashMap<>();
    headersUC30_67.put("Upgrade-Insecure-Requests", "1");
    headersUC30_67.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC30_67.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC30_67.put("sec-ch-ua-mobile", "?0");
    headersUC30_67.put("sec-ch-ua-platform", "Linux");
    
    String uri2 = "https://shtab.opmoscow.ru";
    
    String uri3 = "https://i.ytimg.com/vi";

    ScenarioBuilder scnUC30 = scenario("Archive.MainPage2021")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=512483129&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2021&rn=41669544&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724483523%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121202%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483523&t=gdpr(14)ti(1)")
          .headers(headersUC30_0)
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=512483129&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2021&rn=240001421&browser-info=we%3A1%3Aet%3A1724483523%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121203%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483523&t=gdpr(14)ti(1)")
              .headers(headersUC30_0)
              .body(RawFileBody("mainpage2021/0001_request.gif")),
            http("request_2")
              .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=512483129&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2021&rn=993347388&browser-info=we%3A1%3Aet%3A1724483524%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121204%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483524&t=gdpr(14)ti(1)")
              .headers(headersUC30_0)
              .body(RawFileBody("mainpage2021/0002_request.gif")),
            http("request_3")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC30_3),
            http("request_4")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC30_3),
            http("request_5")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC30_3),
            http("request_6")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC30_3),
            http("request_7")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC30_3),
            http("request_8")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC30_3),
            http("request_9")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC30_3),
            http("request_10")
              .get(uri2 + "/build/images/shtadopm/logo.svg")
              .headers(headersUC30_3),
            http("request_11")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC30_3),
            http("request_12")
              .get("/metrika/tag.js")
              .headers(headersUC30_3),
            http("request_13")
              .get(uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_14")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_15")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_16")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_17")
              .get(uri2 + "/cache/5/1/0/6/0/51060261c73284ac34c3bf9d9cc5e36a222380fc.jpeg")
              .headers(headersUC30_3),
            http("request_18")
              .get(uri2 + "/cache/b/0/1/8/1/b01813f0e98cd4c5e5175089c5618cbe8691fb6f.jpeg")
              .headers(headersUC30_3),
            http("request_19")
              .get(uri2 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
              .headers(headersUC30_3),
            http("request_20")
              .get(uri2 + "/cache/d/6/9/5/6/d69561d2bda805561fe75f0708cae888cb5b2b8b.jpeg")
              .headers(headersUC30_3),
            http("request_21")
              .get(uri2 + "/cache/6/d/e/6/4/6de6484b5ebc5f529d58e2f26ddf2104d91016cb.jpeg")
              .headers(headersUC30_3),
            http("request_22")
              .get(uri2 + "/cache/2/f/9/0/2/2f902259b899255024f6d9bb30477f7f76529ba2.jpeg")
              .headers(headersUC30_3),
            http("request_23")
              .get(uri2 + "/cache/a/e/e/f/e/aeefec5a2aa80990aa28f356dc93c2768b356a07.jpeg")
              .headers(headersUC30_3),
            http("request_24")
              .get(uri2 + "/cache/e/7/f/4/8/e7f4857e99246f842891e456a21e31672b30de0e.jpeg")
              .headers(headersUC30_3),
            http("request_25")
              .get(uri2 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
              .headers(headersUC30_3),
            http("request_26")
              .get(uri2 + "/cache/b/b/6/8/e/bb68e30aba1a137325a7d61236a930cd6ccb0ba8.jpeg")
              .headers(headersUC30_3),
            http("request_27")
              .get(uri2 + "/cache/4/3/f/9/3/43f9386301785d1ab836ea0c37e5c38fa81ce765.jpeg")
              .headers(headersUC30_3),
            http("request_28")
              .get(uri2 + "/cache/b/b/8/5/4/bb854687ec663e4c19824c32d3f0f29c5dea9a81.jpeg")
              .headers(headersUC30_3),
            http("request_29")
              .get(uri2 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
              .headers(headersUC30_3),
            http("request_30")
              .get(uri2 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
              .headers(headersUC30_3),
            http("request_31")
              .get(uri2 + "/cache/b/e/6/c/0/be6c0c0599be356d9e6d5b566a9bf3f96380b6f9.jpeg")
              .headers(headersUC30_3),
            http("request_32")
              .get(uri2 + "/cache/6/5/7/5/c/6575c4f5a00d4f6b7306a8bd6570320bcb50fbdd.jpeg")
              .headers(headersUC30_3),
            http("request_33")
              .get(uri2 + "/cache/d/b/6/9/4/db69402f7bafef374dee1e606909edabf7e6ffaa.jpeg")
              .headers(headersUC30_3),
            http("request_34")
              .get(uri2 + "/cache/2/8/3/7/7/283774b0b5f7b7d075e97ea311af5203629a406e.jpeg")
              .headers(headersUC30_3),
            http("request_35")
              .get(uri2 + "/cache/9/7/7/8/b/9778b29cde67066d2e62211b378e6bb797b3040a.jpeg")
              .headers(headersUC30_3),
            http("request_36")
              .get(uri2 + "/cache/a/a/4/9/b/aa49b0c3ad8491c296f37d510df2dbcf45b76d8c.jpeg")
              .headers(headersUC30_3),
            http("request_37")
              .get(uri2 + "/cache/1/c/c/e/8/1cce894ffbcde9da2a48c815556491bc85ad1a24.jpeg")
              .headers(headersUC30_3),
            http("request_38")
              .get(uri2 + "/cache/1/7/2/5/1/1725100e6a3f7292e0f7835462fc0d0a08b53462.jpeg")
              .headers(headersUC30_3),
            http("request_39")
              .get(uri2 + "/cache/a/8/b/e/7/a8be77f4a7a1b28d9e60eb393f97343948effab9.jpeg")
              .headers(headersUC30_3),
            http("request_40")
              .get(uri2 + "/cache/c/6/d/f/8/c6df89f4f9b41f2a7c4f8eec6d35d36e29db8540.jpeg")
              .headers(headersUC30_3),
            http("request_41")
              .get(uri2 + "/cache/b/5/0/3/7/b5037ea095062afd1bc7c5faf6da034ce984ccdb.jpeg")
              .headers(headersUC30_3),
            http("request_42")
              .get(uri2 + "/cache/f/8/3/5/8/f8358e4a8a1c1b12101d887f07e54f1e58152999.jpeg")
              .headers(headersUC30_3),
            http("request_43")
              .get(uri2 + "/cache/e/c/f/7/c/ecf7cb2d9114fdb3e43613c2a592d110aaabef43.jpeg")
              .headers(headersUC30_3),
            http("request_44")
              .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2021")
              .headers(headersUC30_44),
            http("request_45")
              .get(uri2 + "/cache/6/f/e/6/7/6fe67fb9e7ef037f6ca842eecd6bc75a9036ea90.jpeg")
              .headers(headersUC30_3),
            http("request_46")
              .get(uri2 + "/cache/f/f/0/d/d/ff0dd5e6429bb8120d3d532568c710146b1d58dc.jpeg")
              .headers(headersUC30_3),
            http("request_47")
              .get(uri2 + "/cache/d/5/a/2/3/d5a23df8dc58c019dae858363fe248ea47d52337.jpeg")
              .headers(headersUC30_3),
            http("request_48")
              .get(uri2 + "/cache/c/a/8/f/b/ca8fb465b2a66fb47894e5cb94759996f08b80d7.jpeg")
              .headers(headersUC30_3),
            http("request_49")
              .get(uri2 + "/cache/6/f/c/7/4/6fc7473cdd104126d64bb2a16889b448ed046506.jpeg")
              .headers(headersUC30_3),
            http("request_50")
              .get(uri2 + "/cache/c/d/9/c/b/cd9cb94afef7ee5ef657483eab2625b1247b0742.jpeg")
              .headers(headersUC30_3),
            http("request_51")
              .get(uri2 + "/cache/1/c/f/3/8/1cf3868c3b586f33254ef91143b9cdd474acb74e.jpeg")
              .headers(headersUC30_3),
            http("request_52")
              .get(uri2 + "/cache/7/b/a/a/b/7baab105bea889c0d52ddd35cf67cba1629e4f91.jpeg")
              .headers(headersUC30_3),
            http("request_53")
              .get(uri2 + "/cache/1/0/f/6/e/10f6e29a1b32dee42d5b554d0fc21da19935581c.jpeg")
              .headers(headersUC30_3),
            http("request_54")
              .get(uri2 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC30_3),
            http("request_55")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC30_3),
            http("request_56")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC30_3),
            http("request_57")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC30_3),
            http("request_58")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC30_3),
            http("request_59")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC30_3),
            http("request_60")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC30_3),
            http("request_61")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC30_3),
            http("request_62")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC30_3),
            http("request_63")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2021&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A375205747%3Az%3A300%3Ai%3A20240824121206%3Aet%3A1724483526%3Ac%3A1%3Arn%3A948334995%3Arqn%3A197%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1343%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483524696%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483526%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%B2%202021%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC30_63),
            http("request_64")
              .get(uri3 + "/GsneU_AyCFM/hqdefault.jpg")
              .headers(headersUC30_3),
            http("request_65")
              .get(uri3 + "/uPGcgn0U2kI/hqdefault.jpg")
              .headers(headersUC30_3),
            http("request_66")
              .get(uri3 + "/Ju8xliqHyAM/hqdefault.jpg")
              .headers(headersUC30_3),
            http("request_67")
              .get("/metrika/metrika_match.html")
              .headers(headersUC30_67),
            http("request_68")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC30_3),
            http("request_69")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC30_3)
          )
      );

	  setUp(scnUC30.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2021);
  }
}
