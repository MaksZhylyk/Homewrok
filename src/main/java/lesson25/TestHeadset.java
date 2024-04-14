package lesson25;

public class TestHeadset {
    public static void main(String[] args) {
        AppleHeadset appleHeadset = new AppleHeadset(true, "white",ConnectionType.WIRELESS,
                "Apple", Size.SMALL, 50, true, ChargedType.TYPE_C, "Apple" );
    SamsungHeadsetExperimental samsungHeadsetExperimental = new SamsungHeadsetExperimental(true, "white",ConnectionType.WIRELESS,
            "Samsung", Size.SMALL, 50, true, ChargedType.TYPE_C, true, 200);
        System.out.println(samsungHeadsetExperimental.getBrand());
        System.out.println(samsungHeadsetExperimental);
    }

}
