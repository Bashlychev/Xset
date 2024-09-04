package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2016 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2016 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC42_0 = new HashMap<>();
    headersUC42_0.put("accept", "*/*");
    headersUC42_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC42_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC42_0.put("content-type", "text/plain");
    headersUC42_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC42_0.put("priority", "u=1, i");
    headersUC42_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC42_0.put("sec-ch-ua-mobile", "?0");
    headersUC42_0.put("sec-ch-ua-platform", "Linux");
    headersUC42_0.put("sec-fetch-dest", "empty");
    headersUC42_0.put("sec-fetch-mode", "cors");
    headersUC42_0.put("sec-fetch-site", "cross-site");
    headersUC42_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headerUC42s_2 = new HashMap<>();
    headerUC42s_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headerUC42s_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headerUC42s_2.put("sec-ch-ua-mobile", "?0");
    headerUC42s_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC42_33 = new HashMap<>();
    headersUC42_33.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC42_33.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC42_33.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC42_33.put("priority", "u=0, i");
    headersUC42_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC42_33.put("sec-ch-ua-mobile", "?0");
    headersUC42_33.put("sec-ch-ua-platform", "Linux");
    headersUC42_33.put("sec-fetch-dest", "document");
    headersUC42_33.put("sec-fetch-mode", "navigate");
    headersUC42_33.put("sec-fetch-site", "same-origin");
    headersUC42_33.put("sec-fetch-user", "?1");
    headersUC42_33.put("upgrade-insecure-requests", "1");
    headersUC42_33.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC42_42 = new HashMap<>();
    headersUC42_42.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC42_42.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC42_42.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC42_42.put("priority", "i");
    headersUC42_42.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC42_42.put("sec-ch-ua-mobile", "?0");
    headersUC42_42.put("sec-ch-ua-platform", "Linux");
    headersUC42_42.put("sec-fetch-dest", "image");
    headersUC42_42.put("sec-fetch-mode", "no-cors");
    headersUC42_42.put("sec-fetch-site", "same-origin");
    headersUC42_42.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC42_43 = new HashMap<>();
    headersUC42_43.put("accept", "*/*");
    headersUC42_43.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC42_43.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC42_43.put("origin", "https://shtab.opmoscow.ru");
    headersUC42_43.put("priority", "u=1, i");
    headersUC42_43.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC42_43.put("sec-ch-ua-mobile", "?0");
    headersUC42_43.put("sec-ch-ua-platform", "Linux");
    headersUC42_43.put("sec-fetch-dest", "empty");
    headersUC42_43.put("sec-fetch-mode", "cors");
    headersUC42_43.put("sec-fetch-site", "cross-site");
    headersUC42_43.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC42_46 = new HashMap<>();
    headersUC42_46.put("Upgrade-Insecure-Requests", "1");
    headersUC42_46.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC42_46.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC42_46.put("sec-ch-ua-mobile", "?0");
    headersUC42_46.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC42_55 = new HashMap<>();
    headersUC42_55.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC42_55.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC42_55.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC42_55.put("priority", "i");
    headersUC42_55.put("range", "bytes=11624-11624");
    headersUC42_55.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC42_55.put("sec-ch-ua-mobile", "?0");
    headersUC42_55.put("sec-ch-ua-platform", "Linux");
    headersUC42_55.put("sec-fetch-dest", "image");
    headersUC42_55.put("sec-fetch-mode", "no-cors");
    headersUC42_55.put("sec-fetch-site", "same-origin");
    headersUC42_55.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC42_60 = new HashMap<>();
    headersUC42_60.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC42_60.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC42_60.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC42_60.put("priority", "i");
    headersUC42_60.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC42_60.put("sec-ch-ua-mobile", "?0");
    headersUC42_60.put("sec-ch-ua-platform", "Linux");
    headersUC42_60.put("sec-fetch-dest", "image");
    headersUC42_60.put("sec-fetch-mode", "no-cors");
    headersUC42_60.put("sec-fetch-site", "cross-site");
    headersUC42_60.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC42_60.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    String uri2 = "https://shtab.opmoscow.ru";
    
    String uri3 = "https://i.ytimg.com/vi";

    ScenarioBuilder scnUC42 = scenario("Archive.MainPage2016")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=741423605&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2016&rn=620942567&browser-info=we%3A1%3Aet%3A1724484253%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824122412%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724484253&t=gdpr(14)ti(1)")
          .headers(headersUC42_0)
          .body(RawFileBody("mainpage2016/0000_request.gif"))
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=3&wv-type=7&wmode=0&wv-hit=741423605&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2016&rn=890537736&browser-info=we%3A1%3Aet%3A1724484255%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824122414%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724484255&t=gdpr(14)ti(1)")
              .headers(headersUC42_0)
              .body(RawFileBody("mainpage2016/0001_request.gif")),
            http("request_2")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headerUC42s_2),
            http("request_3")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headerUC42s_2),
            http("request_4")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headerUC42s_2),
            http("request_5")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headerUC42s_2),
            http("request_6")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headerUC42s_2),
            http("request_7")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headerUC42s_2),
            http("request_8")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headerUC42s_2),
            http("request_9")
              .get(uri2 + "/uploads/media/default/0001/17/3510b056520b45843a72c71d35ea5d69f2149caf.png")
              .headers(headerUC42s_2),
            http("request_10")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headerUC42s_2),
            http("request_11")
              .get(uri2 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
              .headers(headerUC42s_2),
            http("request_12")
              .get(uri2 + "/cache/0/6/7/4/c/0674cb551940a2b3517fed859062de9f80a85eb4.jpeg")
              .headers(headerUC42s_2),
            http("request_13")
              .get(uri2 + "/cache/2/a/e/d/7/2aed74619e97da0bdc2987954df66fdd80ac13ef.jpeg")
              .headers(headerUC42s_2),
            http("request_14")
              .get(uri2 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
              .headers(headerUC42s_2),
            http("request_15")
              .get(uri2 + "/cache/9/c/0/5/7/9c0579092da48f670e8f09bb2464a2adca4f016c.jpeg")
              .headers(headerUC42s_2),
            http("request_16")
              .get(uri2 + "/cache/c/4/d/8/c/c4d8c812ccc352c2c7de68eb2549ab042a5bdfef.jpeg")
              .headers(headerUC42s_2),
            http("request_17")
              .get(uri2 + "/cache/f/1/4/5/0/f145041afcbb34b843d7f7f42ff87f0c58280eb6.jpeg")
              .headers(headerUC42s_2),
            http("request_18")
              .get(uri2 + "/cache/e/a/0/d/f/ea0dff986d38d4fde789c16e7ccc9f5d784f570f.jpeg")
              .headers(headerUC42s_2),
            http("request_19")
              .get(uri2 + "/cache/c/0/b/4/2/c0b42ed564857d29771776adfe9f5004c366890f.jpeg")
              .headers(headerUC42s_2),
            http("request_20")
              .get(uri2 + "/cache/6/4/f/8/7/64f873aeec3fe8f808a39164cd36029c2e8cbd11.jpeg")
              .headers(headerUC42s_2),
            http("request_21")
              .get(uri2 + "/cache/4/9/f/d/5/49fd588d87ca2f2994daaac19972f96b3cddd67f.jpeg")
              .headers(headerUC42s_2),
            http("request_22")
              .get(uri2 + "/cache/e/c/f/7/c/ecf7cb2d9114fdb3e43613c2a592d110aaabef43.jpeg")
              .headers(headerUC42s_2),
            http("request_23")
              .get(uri2 + "/cache/7/a/2/3/e/7a23e7d8fb04202a4c5a14b19d5e2fea9322415b.jpeg")
              .headers(headerUC42s_2),
            http("request_24")
              .get(uri2 + "/cache/1/c/0/5/6/1c056c291a0ab490787ab146c21287346281f94e.jpeg")
              .headers(headerUC42s_2),
            http("request_25")
              .get(uri2 + "/cache/c/1/1/2/4/c11246b14a31b8b15c8b90ab8aa40c655a1f0120.jpeg")
              .headers(headerUC42s_2),
            http("request_26")
              .get("/metrika/tag.js")
              .headers(headerUC42s_2),
            http("request_27")
              .get(uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_28")
              .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_29")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_30")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_31")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_32")
              .get(uri2 + "/build/images/opmoscow/loading.svg")
              .headers(headerUC42s_2),
            http("request_33")
              .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2016")
              .headers(headersUC42_33),
            http("request_34")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headerUC42s_2),
            http("request_35")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headerUC42s_2),
            http("request_36")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headerUC42s_2),
            http("request_37")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headerUC42s_2),
            http("request_38")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headerUC42s_2),
            http("request_39")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headerUC42s_2),
            http("request_40")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headerUC42s_2),
            http("request_41")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headerUC42s_2),
            http("request_42")
              .get(uri2 + "/cache/9/0/b/7/c/90b7c62588fb350aa8d13df3d61a9d8ef266e0d2.jpeg")
              .headers(headersUC42_42),
            http("request_43")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2016&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A950311731%3Az%3A300%3Ai%3A20240824122415%3Aet%3A1724484256%3Ac%3A1%3Arn%3A702785325%3Arqn%3A218%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C2020%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724484253648%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724484256%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%93%D0%BE%D1%81%D0%B4%D1%83%D0%BC%D1%83%20%D0%A0%D0%A4%202016&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC42_43),
            http("request_44")
              .get(uri2 + "/cache/3/7/4/a/d/374ad4fd6559461481a108ff4080464297c23d50.jpeg")
              .headers(headersUC42_42),
            http("request_45")
              .get(uri2 + "/cache/4/8/6/e/4/486e4d0b0f2ecf1f92ea5f32aff5504fe9829367.jpeg")
              .headers(headersUC42_42),
            http("request_46")
              .get("/metrika/metrika_match.html")
              .headers(headersUC42_46),
            http("request_47")
              .get(uri2 + "/cache/7/9/a/8/5/79a851bb3cc30c1ad9a9204942669478a9b1c7ea.png")
              .headers(headersUC42_42),
            http("request_48")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headerUC42s_2),
            http("request_49")
              .get(uri2 + "/cache/0/3/6/0/4/036047f59276be6b96849ed11654f27ada5da54d.jpeg")
              .headers(headersUC42_42),
            http("request_50")
              .get(uri2 + "/cache/5/7/c/5/d/57c5d31a814d6945f9ae1bc4394a6d3588ed8523.jpeg")
              .headers(headersUC42_42),
            http("request_51")
              .get(uri2 + "/cache/0/0/f/e/d/00fed00a44f36809c1da566305558cb71cbd122a.png")
              .headers(headersUC42_42),
            http("request_52")
              .get(uri2 + "/uploads/media/default/0001/13/b71863ce68434497eaf42267cb42ea4e7323a1c1.jpeg")
              .headers(headersUC42_42),
            http("request_53")
              .get(uri2 + "/uploads/media/default/0001/13/6db4e06eb15dcc2d9b0ecc49d30b3290c7440435.jpeg")
              .headers(headersUC42_42),
            http("request_54")
              .get(uri2 + "/uploads/media/default/0001/13/9d143a45c7f7452e73e86f63efbf4c7c9baf21b9.jpeg")
              .headers(headersUC42_42),
            http("request_55")
              .get(uri2 + "/cache/9/8/6/e/0/986e0c8582208d863f451702742137856a17d926.png")
              .headers(headersUC42_55),
            http("request_56")
              .get(uri2 + "/uploads/media/default/0001/13/51bfcee3449abc5babf9aec5e255561bd3514e24.jpeg")
              .headers(headersUC42_42),
            http("request_57")
              .get(uri2 + "/uploads/media/default/0001/13/308c060f2d6f539d9c91edcbb0663dce593250fd.jpeg")
              .headers(headersUC42_42),
            http("request_58")
              .get(uri2 + "/build/images/mCSB_buttons.5b35a39c.png")
              .headers(headerUC42s_2),
            http("request_59")
              .get(uri2 + "/cache/9/c/3/5/3/9c353c3c73246b96f023763eff17093ee68ca743.jpeg")
              .headers(headerUC42s_2),
            http("request_60")
              .get(uri3 + "/9tiSt3UyJiQ/hqdefault.jpg")
              .headers(headersUC42_60),
            http("request_61")
              .get(uri3 + "/303yE9iTkrs/hqdefault.jpg")
              .headers(headersUC42_60),
            http("request_62")
              .get(uri2 + "/uploads/media/default/0001/13/d19267b1cea82b4fad45123dd7fb4b279ee57d9c.jpeg")
              .headers(headersUC42_42),
            http("request_63")
              .get(uri3 + "/Fxm5Rj6zbdI/hqdefault.jpg")
              .headers(headersUC42_60),
            http("request_64")
              .get(uri2 + "/uploads/media/default/0001/13/1c875ba756c2b3f86f8b98e3231adc89f50d1180.jpeg")
              .headers(headersUC42_42),
            http("request_65")
              .get(uri2 + "/uploads/media/default/0001/13/32e75c49b4a2890e94b6a429beaedb9e4d322801.jpeg")
              .headers(headersUC42_42),
            http("request_66")
              .get(uri2 + "/uploads/media/default/0001/13/16ba0d2452bc9176cdb2b259bed63bdff126b285.jpeg")
              .headers(headersUC42_42),
            http("request_67")
              .get(uri2 + "/uploads/media/default/0001/13/ecf51ac6707a4c9df091bc9221036668e04fbda8.jpeg")
              .headers(headersUC42_42),
            http("request_68")
              .get(uri2 + "/uploads/media/default/0001/13/ebde767c205a0e55d05aaa648f8fd15d0fcfa1ad.jpeg")
              .headers(headersUC42_42),
            http("request_69")
              .get(uri2 + "/uploads/media/default/0001/13/6ed721e42001b5871803ca4386318a4bf0274028.jpeg")
              .headers(headersUC42_42),
            http("request_70")
              .get(uri2 + "/cache/e/a/1/4/c/ea14c3bc147e0dadc90d664fb9549b43f27c2674.jpeg")
              .headers(headersUC42_42),
            http("request_71")
              .get(uri2 + "/cache/5/2/f/e/e/52fee56cfe58e85620164a2eac9a81020c4460e7.jpeg")
              .headers(headersUC42_42),
            http("request_72")
              .get(uri2 + "/cache/0/a/6/e/4/0a6e4c396f7e5e63c8188464426abc6d9834a851.jpeg")
              .headers(headersUC42_42),
            http("request_73")
              .get(uri2 + "/cache/a/a/e/c/c/aaeccd5e5e21b35c8a855dc4b36651c93ef28307.jpeg")
              .headers(headersUC42_42),
            http("request_74")
              .get(uri2 + "/cache/8/e/b/5/3/8eb53d13ec7e472095f5d5a34bc3a586ba220fbd.jpeg")
              .headers(headersUC42_42),
            http("request_75")
              .get(uri2 + "/cache/8/e/1/5/9/8e15936ebad540c0ac6d5053476f9b3aca9a20e0.jpeg")
              .headers(headersUC42_42),
            http("request_76")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC42_42)
          )
      );

	  setUp(scnUC42.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2016);
  }
}
