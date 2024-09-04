package Y2024;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class CandidatesER extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_CandidatesER = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC12_0 = new HashMap<>();
    headersUC12_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC12_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC12_0.put("sec-ch-ua-mobile", "?0");
    headersUC12_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC12_48 = new HashMap<>();
    headersUC12_48.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC12_48.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC12_48.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC12_48.put("priority", "u=0, i");
    headersUC12_48.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC12_48.put("sec-ch-ua-mobile", "?0");
    headersUC12_48.put("sec-ch-ua-platform", "Linux");
    headersUC12_48.put("sec-fetch-dest", "document");
    headersUC12_48.put("sec-fetch-mode", "navigate");
    headersUC12_48.put("sec-fetch-site", "same-origin");
    headersUC12_48.put("sec-fetch-user", "?1");
    headersUC12_48.put("upgrade-insecure-requests", "1");
    headersUC12_48.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC12_74 = new HashMap<>();
    headersUC12_74.put("Upgrade-Insecure-Requests", "1");
    headersUC12_74.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC12_74.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC12_74.put("sec-ch-ua-mobile", "?0");
    headersUC12_74.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC12_75 = new HashMap<>();
    headersUC12_75.put("accept", "*/*");
    headersUC12_75.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC12_75.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC12_75.put("origin", "https://shtab.opmoscow.ru");
    headersUC12_75.put("priority", "u=1, i");
    headersUC12_75.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC12_75.put("sec-ch-ua-mobile", "?0");
    headersUC12_75.put("sec-ch-ua-platform", "Linux");
    headersUC12_75.put("sec-fetch-dest", "empty");
    headersUC12_75.put("sec-fetch-mode", "cors");
    headersUC12_75.put("sec-fetch-site", "cross-site");
    headersUC12_75.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnUC12 = scenario("Y2024.CandidatesER")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC12_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC12_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC12_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC12_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC12_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC12_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC12_0),
            http("request_7")
              .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC12_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC12_0),
            http("request_9")
              .get("/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
              .headers(headersUC12_0),
            http("request_10")
              .get("/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
              .headers(headersUC12_0),
            http("request_11")
              .get("/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
              .headers(headersUC12_0),
            http("request_12")
              .get("/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
              .headers(headersUC12_0),
            http("request_13")
              .get("/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
              .headers(headersUC12_0),
            http("request_14")
              .get("/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
              .headers(headersUC12_0),
            http("request_15")
              .get("/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
              .headers(headersUC12_0),
            http("request_16")
              .get("/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
              .headers(headersUC12_0),
            http("request_17")
              .get("/cache/7/7/0/d/9/770d9fc83f16fed1980973c8efe85e61b5594c44.jpeg")
              .headers(headersUC12_0),
            http("request_18")
              .get("/cache/d/b/c/e/6/dbce6580536664696ca05ffa2f42a8591fbd6f6b.jpeg")
              .headers(headersUC12_0),
            http("request_19")
              .get("/cache/2/1/e/b/4/21eb40436dbbeda1c94a4319e521e6c1f6d2eda8.jpeg")
              .headers(headersUC12_0),
            http("request_20")
              .get("/cache/3/2/6/c/4/326c4ae6c4fa373c1c168e9ef3acfb0b3c1a41e1.jpeg")
              .headers(headersUC12_0),
            http("request_21")
              .get("/cache/8/c/b/6/6/8cb66e3a86ee809cda5272d1c99330db8c184ee8.jpeg")
              .headers(headersUC12_0),
            http("request_22")
              .get("/cache/c/e/7/4/b/ce74b1b75e622a8737f27237374d601adc286fc4.jpeg")
              .headers(headersUC12_0),
            http("request_23")
              .get("/cache/a/0/0/e/6/a00e69ff3a93b52ed19a690b4f738b44440c7ebd.jpeg")
              .headers(headersUC12_0),
            http("request_24")
              .get("/cache/8/0/f/4/c/80f4cc7693daec2150be2f5d4d1c8a17475beb91.png")
              .headers(headersUC12_0),
            http("request_25")
              .get("/cache/5/6/d/9/c/56d9c60a0c81c7dbe9344853d0466c6d14b835c6.jpeg")
              .headers(headersUC12_0),
            http("request_26")
              .get("/cache/8/1/6/7/b/8167bd55d09b1bda8e31413af63a594fd61d84e5.jpeg")
              .headers(headersUC12_0),
            http("request_27")
              .get("/cache/e/f/2/e/8/ef2e835cad41372c5637342dbf6d35c83f8065bc.png")
              .headers(headersUC12_0),
            http("request_28")
              .get("/cache/8/8/3/d/9/883d94470ccd3081598e5e2654665e845dc40672.jpeg")
              .headers(headersUC12_0),
            http("request_29")
              .get("/cache/0/2/0/b/8/020b8ed38c743ec77f2adde321713a4711343f40.jpeg")
              .headers(headersUC12_0),
            http("request_30")
              .get("/cache/c/f/d/c/0/cfdc0483309de521e14a94543008b31f689dc1a3.jpeg")
              .headers(headersUC12_0),
            http("request_31")
              .get("/cache/9/2/f/3/e/92f3e42fe1444d4cf842d4e7d8d2c1e8b212c2de.jpeg")
              .headers(headersUC12_0),
            http("request_32")
              .get("/cache/5/a/8/c/2/5a8c226f35985d4ce0cbdf2d5e984a548dcfa49f.jpeg")
              .headers(headersUC12_0),
            http("request_33")
              .get("/cache/9/5/0/0/3/9500394911ef8b8559298c203d0445e67c275b6d.jpeg")
              .headers(headersUC12_0),
            http("request_34")
              .get("/cache/8/a/b/d/e/8abde7a7e9c157cf88e84bf54af888fa80c29fc8.jpeg")
              .headers(headersUC12_0),
            http("request_35")
              .get("/cache/b/c/2/1/d/bc21de5e69cce47d141335c1a0f9d33f1c05d136.jpeg")
              .headers(headersUC12_0),
            http("request_36")
              .get("/cache/f/d/9/4/b/fd94b8fcb47518ad965e1c42f87bff34c57d8026.jpeg")
              .headers(headersUC12_0),
            http("request_37")
              .get("/cache/7/2/9/1/4/729149adbb5d139787fe5552b2686c6302dde2f8.jpeg")
              .headers(headersUC12_0),
            http("request_38")
              .get("/cache/e/a/4/5/9/ea459f9e19ba374311a376c29022c4077734464c.jpeg")
              .headers(headersUC12_0),
            http("request_39")
              .get("/cache/5/4/1/1/b/5411bca2dd5c9370edb4d068532511032510d92a.jpeg")
              .headers(headersUC12_0),
            http("request_40")
              .get("/cache/d/0/4/8/7/d0487a483794eef75b12e367ccd937b9ae58d678.jpeg")
              .headers(headersUC12_0),
            http("request_41")
              .get("/cache/f/4/a/6/d/f4a6d3af80ffd0210021e8f26dc54ebfe044c70f.jpeg")
              .headers(headersUC12_0),
            http("request_42")
              .get("/cache/5/1/6/5/4/51654203b4a2294bb6ba8da653cb28b2d924ecbd.jpeg")
              .headers(headersUC12_0),
            http("request_43")
              .get("/cache/1/b/2/3/7/1b237d4d24fd12f7e95f3b6aa9871c192b5228b2.jpeg")
              .headers(headersUC12_0),
            http("request_44")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC12_0),
            http("request_45")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_46")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_47")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_48")
              .get("/party/view/edinaya-rossiya")
              .headers(headersUC12_48),
            http("request_49")
              .get("/cache/7/5/5/9/a/7559a2ec93c71cd4dc90234552548691b1ccdcf0.jpeg")
              .headers(headersUC12_0),
            http("request_50")
              .get("/cache/9/0/5/c/f/905cf59e9534c8c96d159989f7af16f33f62118b.jpeg")
              .headers(headersUC12_0),
            http("request_51")
              .get("/cache/2/5/d/1/1/25d1101b9418d0f70316bd9e3f1d17fee96903f8.jpeg")
              .headers(headersUC12_0),
            http("request_52")
              .get("/cache/e/2/7/f/f/e27ffc7eb1f2e5377522abefd667f777244365e8.jpeg")
              .headers(headersUC12_0),
            http("request_53")
              .get("/cache/4/e/e/c/f/4eecf4bb075668788e653f0c90d77ca7cfca7c0b.jpeg")
              .headers(headersUC12_0),
            http("request_54")
              .get("/cache/9/3/a/d/c/93adce31689b303c0d0232d864de78432b856ffd.jpeg")
              .headers(headersUC12_0),
            http("request_55")
              .get("/cache/d/5/d/6/5/d5d65dc3a4c18c96e8ad6f6e76e925fbf30d82d3.jpeg")
              .headers(headersUC12_0),
            http("request_56")
              .get("/cache/8/4/4/e/3/844e348e57b6222d14fd17d41c71b06e41f2ad5a.jpeg")
              .headers(headersUC12_0),
            http("request_57")
              .get("/cache/5/e/c/b/3/5ecb3d3006cb821cd4e2a135df5bda1c83a1fcf9.jpeg")
              .headers(headersUC12_0),
            http("request_58")
              .get("/cache/8/7/0/d/7/870d74c0a93b99dfa2bc696cb199e0682ecf352e.jpeg")
              .headers(headersUC12_0),
            http("request_59")
              .get("/cache/a/7/8/9/7/a789730a10a90758634cea4a3504c6f04fe9985e.jpeg")
              .headers(headersUC12_0),
            http("request_60")
              .get("/cache/8/a/7/3/e/8a73ea9d204bf67f19cdc318fd99d4f47e8fd2ab.png")
              .headers(headersUC12_0),
            http("request_61")
              .get("/cache/8/6/8/d/2/868d22921a247d4864fbe845a48d19af40b7b27d.jpeg")
              .headers(headersUC12_0),
            http("request_62")
              .get("/cache/9/7/e/8/d/97e8d6cc27dac7286afd8668d6d5f544b371ea0a.jpeg")
              .headers(headersUC12_0),
            http("request_63")
              .get("/cache/5/b/b/c/f/5bbcf05888e729bd69d16144401a6050ba04c67e.jpeg")
              .headers(headersUC12_0),
            http("request_64")
              .get("/build/7255.871eb160.js")
              .headers(headersUC12_0),
            http("request_65")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC12_0),
            http("request_66")
              .get("/build/7729.67d87565.js")
              .headers(headersUC12_0),
            http("request_67")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC12_0),
            http("request_68")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC12_0),
            http("request_69")
              .get("/build/9154.f1370752.js")
              .headers(headersUC12_0),
            http("request_70")
              .get("/build/1676.2634f191.js")
              .headers(headersUC12_0),
            http("request_71")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC12_0),
            http("request_72")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC12_0),
            http("request_73")
              .get("/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC12_0),
            http("request_74")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC12_74),
            http("request_75")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fedinaya-rossiya&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fkandidaty&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A554287457%3Az%3A300%3Ai%3A20240823184020%3Aet%3A1724420421%3Ac%3A1%3Arn%3A307530342%3Arqn%3A54%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C559%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420420107%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420421%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%8B%2C%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%D0%B8%20%D0%9A%D1%83%D1%80%D0%BA%D0%B8%D0%BD%D0%BE%202024%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%95%D0%B4%D0%B8%D0%BD%D0%B0%D1%8F%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D1%8F&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC12_75)
          )
      );

	  setUp(scnUC12.injectOpen(atOnceUsers(1))).protocols(httpProtocol_CandidatesER);
  }
}
