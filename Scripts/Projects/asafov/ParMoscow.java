package Projects.asafov;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class ParMoscow extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://asafov.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headers_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Origin", "https://asafov.ru");
    headers_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headers_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_27 = new HashMap<>();
    headers_27.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_27.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_27.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headers_27.put("priority", "u=0, i");
    headers_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_27.put("sec-ch-ua-mobile", "?0");
    headers_27.put("sec-ch-ua-platform", "Linux");
    headers_27.put("sec-fetch-dest", "document");
    headers_27.put("sec-fetch-mode", "navigate");
    headers_27.put("sec-fetch-site", "cross-site");
    headers_27.put("sec-fetch-user", "?1");
    headers_27.put("upgrade-insecure-requests", "1");
    headers_27.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_78 = new HashMap<>();
    headers_78.put("accept", "*/*");
    headers_78.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_78.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headers_78.put("origin", "https://asafov.ru");
    headers_78.put("priority", "u=1, i");
    headers_78.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_78.put("sec-ch-ua-mobile", "?0");
    headers_78.put("sec-ch-ua-platform", "Linux");
    headers_78.put("sec-fetch-dest", "empty");
    headers_78.put("sec-fetch-mode", "cors");
    headers_78.put("sec-fetch-site", "cross-site");
    headers_78.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_79 = new HashMap<>();
    headers_79.put("Upgrade-Insecure-Requests", "1");
    headers_79.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headers_79.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_79.put("sec-ch-ua-mobile", "?0");
    headers_79.put("sec-ch-ua-platform", "Linux");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scn = scenario("Projects.asafov.ParMoscow")
      .exec(
        http("request_0")
          .get("/build/assets/app-C22gTps0.css")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get("/build/assets/element-BvquaXif.css")
              .headers(headers_0),
            http("request_2")
              .get("/build/assets/app-CIZP6loT.css")
              .headers(headers_0),
            http("request_3")
              .get("/build/assets/app-DfRqwiiA.js")
              .headers(headers_3),
            http("request_4")
              .get("/build/assets/element-zM6ahEp_.js")
              .headers(headers_3),
            http("request_5")
              .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
              .headers(headers_3),
            http("request_6")
              .get("/assets/css/cookies.css")
              .headers(headers_0),
            http("request_7")
              .get("/assets/header/images/btn-burger.svg")
              .headers(headers_0),
            http("request_8")
              .get("/assets/header/images/logos/mobile-logo.svg")
              .headers(headers_0),
            http("request_9")
              .get("/assets/header/images/btn-search-white.svg")
              .headers(headers_0),
            http("request_10")
              .get("/assets/header/images/logos/telegram-sm.svg")
              .headers(headers_0),
            http("request_11")
              .get("/assets/header/images/logos/vk-sm.svg")
              .headers(headers_0),
            http("request_12")
              .get("/assets/header/images/logos/dzen-sm.svg")
              .headers(headers_0),
            http("request_13")
              .get("/assets/header/images/icons/x-mark.svg")
              .headers(headers_0),
            http("request_14")
              .get("/assets/header/images/icons/quote.svg")
              .headers(headers_0),
            http("request_15")
              .get("/assets/header/images/logos/telegram-xs.svg")
              .headers(headers_0),
            http("request_16")
              .get("/assets/header/images/logos/vk-xs.svg")
              .headers(headers_0),
            http("request_17")
              .get("/assets/header/images/logos/dzen-xs.svg")
              .headers(headers_0),
            http("request_18")
              .get("/assets/header/images/logos/logo-asafov.svg")
              .headers(headers_0),
            http("request_19")
              .get("/assets/header/images/logos/certificate.svg")
              .headers(headers_0),
            http("request_20")
              .get("/assets/header/images/btn-search-black.svg")
              .headers(headers_0),
            http("request_21")
              .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
            http("request_22")
              .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
            http("request_23")
              .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
            http("request_24")
              .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
            http("request_25")
              .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
            http("request_26")
              .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
            http("request_27")
              .get("/parliament/moskva")
              .headers(headers_27),
            http("request_28")
              .get("/storage/people/532/artemiev-oleg-532.webp")
              .headers(headers_0),
            http("request_29")
              .get("/storage/people/819/batisheva-tatiana-819.webp")
              .headers(headers_0),
            http("request_30")
              .get("/storage/people/1353/buskin-igor-1353.webp")
              .headers(headers_0),
            http("request_31")
              .get("/storage/people/1955/gerasimov-evgeniy-1955.webp")
              .headers(headers_0),
            http("request_32")
              .get("/storage/people/2415/guseva-liudmila-2415.webp")
              .headers(headers_0),
            http("request_33")
              .get("/storage/people/3789/kartavtseva-larisa-3789.webp")
              .headers(headers_0),
            http("request_34")
              .get("/storage/people/3824/katz-elena-3824.webp")
              .headers(headers_0),
            http("request_35")
              .get("/storage/people/4087/kozlov-aleksandr-4087.webp")
              .headers(headers_0),
            http("request_36")
              .get("/storage/people/5557/melnikova-olga-5557.webp")
              .headers(headers_0),
            http("request_37")
              .get("/storage/people/6336/orlov-stepan-6336.webp")
              .headers(headers_0),
            http("request_38")
              .get("/storage/people/6549/perfilova-nadezhda-6549.webp")
              .headers(headers_0),
            http("request_39")
              .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
            http("request_40")
              .get("/storage/people/7230/rusetskaya-margarita-7230.webp")
              .headers(headers_0),
            http("request_41")
              .get("/storage/people/7421/samishina-elena-7421.webp")
              .headers(headers_0),
            http("request_42")
              .get("/storage/people/7495/sviatenko-inna-7495.webp")
              .headers(headers_0),
            http("request_43")
              .get("/storage/people/7541/semennikov-aleksandr-7541.webp")
              .headers(headers_0),
            http("request_44")
              .get("/storage/people/8005/stebenkova-liudmila-8005.webp")
              .headers(headers_0),
            http("request_45")
              .get("/storage/people/8313/titov-andrey-8313.webp")
              .headers(headers_0),
            http("request_46")
              .get("/storage/people/9267/shaposhnikov-aleksey-9267.webp")
              .headers(headers_0),
            http("request_47")
              .get("/storage/people/9275/sharapova-olga-9275.webp")
              .headers(headers_0),
            http("request_48")
              .get("/storage/people/9583/shitov-kirill-9583.webp")
              .headers(headers_0),
            http("request_49")
              .get("/storage/people/2898/engalicheva-ekaterina-2898.webp")
              .headers(headers_0),
            http("request_50")
              .get("/storage/people/3325/zubrilin-nikolay-3325.webp")
              .headers(headers_0),
            http("request_51")
              .get("/storage/people/3351/zyuganov-leonid-3351.webp")
              .headers(headers_0),
            http("request_52")
              .get("/storage/people/5271/maksimov-viktor-5271.webp")
              .headers(headers_0),
            http("request_53")
              .get("/storage/people/6094/nikitina-liubov-6094.webp")
              .headers(headers_0),
            http("request_54")
              .get("/storage/people/7340/savostyanov-sergey-7340.webp")
              .headers(headers_0),
            http("request_55")
              .get("/storage/people/8215/tarasov-pavel-8215.webp")
              .headers(headers_0),
            http("request_56")
              .get("/storage/people/9506/shuvalova-elena-9506.webp")
              .headers(headers_0),
            http("request_57")
              .get("/storage/people/9716/yanchuk-elena-9716.webp")
              .headers(headers_0),
            http("request_58")
              .get("/storage/people/625/babayan-roman-625.webp")
              .headers(headers_0),
            http("request_59")
              .get("/storage/people/2071/golovchenko-valeriy-2071.webp")
              .headers(headers_0),
            http("request_60")
              .get("/storage/people/3921/kiseleva-maria-3921.webp")
              .headers(headers_0),
            http("request_61")
              .get("/storage/people/5594/metlina-natalia-5594.webp")
              .headers(headers_0),
            http("request_62")
              .get("/storage/people/6117/nikolaeva-elena-6117.webp")
              .headers(headers_0),
            http("request_63")
              .get("/storage/people/975/besedina-darya-975.webp")
              .headers(headers_0),
            http("request_64")
              .get("/storage/people/1313/bunimovich-evgeniy-1313.webp")
              .headers(headers_0),
            http("request_65")
              .get("/storage/people/4528/kruglov-maksim-4528.webp")
              .headers(headers_0),
            http("request_66")
              .get("/storage/people/5683/mitrohin-sergey-5683.webp")
              .headers(headers_0),
            http("request_67")
              .get("/storage/people/5088/loktev-dmitry-5088.webp")
              .headers(headers_0),
            http("request_68")
              .get("/storage/people/5504/medvedev-andrey-5504.webp")
              .headers(headers_0),
            http("request_69")
              .get("/storage/people/8079/stupin-evgeny-8079.webp")
              .headers(headers_0),
            http("request_70")
              .get("/storage/people/7911/soloviev-alexandr-7911.webp")
              .headers(headers_0),
            http("request_71")
              .get("/storage/people/8286/timonov-mihail-8286.webp")
              .headers(headers_0),
            http("request_72")
              .get("/storage/people/9702/yandiev-magomet-isaevich-9702.webp")
              .headers(headers_0),
            http("request_73")
              .get("/assets/img/logos/certificate-footer.svg")
              .headers(headers_0),
            http("request_74")
              .get(uri1 + "/metrika/tag.js")
              .headers(headers_0),
            http("request_75")
              .get("/assets/js/front/cookies.js")
              .headers(headers_3),
            http("request_76")
              .get("/assets/js/front/header.js")
              .headers(headers_3),
            http("request_77")
              .get("/static/favicon.ico")
              .headers(headers_0),
            http("request_78")
              .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fparliament%2Fmoskva&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A5695134%3Az%3A300%3Ai%3A20240827092412%3Aet%3A1724732652%3Ac%3A1%3Arn%3A154911233%3Arqn%3A145%3Au%3A1724676906572442126%3Aw%3A1905x959%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1480%2C101%2C1%2C0%2C%2C42%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724732650713%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724732652%3At%3A%D0%9C%D0%BE%D1%81%D0%BA%D0%BE%D0%B2%D1%81%D0%BA%D0%B0%D1%8F%20%D0%B3%D0%BE%D1%80%D0%BE%D0%B4%D1%81%D0%BA%D0%B0%D1%8F%20%D0%94%D1%83%D0%BC%D0%B0%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
              .headers(headers_78),
            http("request_79")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headers_79)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
