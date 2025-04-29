// Last updated: 29/04/2025, 18:40:44
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}