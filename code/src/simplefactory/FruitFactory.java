package simplefactory;

/**
 * 根据需求创建水果对象
 *
 * @author jianghao.zhang
 */
public class FruitFactory {

    /**
     * 创建一种水果
     *
     * @param type 水果类型
     * @return 实际的水果
     */
    Fruit create(String type) {
        switch (type) {
            case "apple":
                return new Apple();
            case "lemon":
                return new Lemon();
            default:
                throw new IllegalArgumentException("Fruit not exist");
        }
    }
}
