package basic_0818;

public class ShopService {
//    직접 접근 x => private
//    객체 생성 x => static

    private static ShopService shopService = new ShopService();

    private ShopService() {
    }

    public static ShopService getInstance() {
        return shopService;
    }
}
