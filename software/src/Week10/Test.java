package Week10;

interface Vault_110 {
    public void charge();
}

interface Vault_220 {
    public void charge();
}

class JapanCharge implements Vault_110{
    @Override
    public void charge() {
        System.out.println("일본은 110볼트로 충전합니다.");
    }
}

class KoreaCharge implements Vault_220{
    @Override
    public void charge() {
        System.out.println("한국은 220볼트로 충전합니다.");
    }
}

class JapanAdapter implements Vault_110{
    Vault_220 korea;

    public JapanAdapter(Vault_220 korea) {
        this.korea = korea;
    }

    @Override
    public void charge() {
        System.out.println("일본에 여행가서 110볼트 어댑터를 통해 충전합니다.");
    }
}
public class Test {
    public static void main(String[] args) {
        Vault_110 japan = new JapanCharge();
        Vault_220 korea = new KoreaCharge();
        Vault_110 japanAdapter = new JapanAdapter(korea);

        japan.charge();
        korea.charge();

        System.out.println("testCharge 사용");
        testCharge(japan);
        testCharge(japanAdapter);

    }

    static void testCharge(Vault_110 vault){
        vault.charge();
    }
}
