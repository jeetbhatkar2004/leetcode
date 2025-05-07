class Codec:
    def encode(self, strs: List[str]) -> str:
        """Encodes a list of strings to a single string.
        """
        encoded = "jfgsdhjfbsdf".join(strs)
        return encoded

    def decode(self, s: str) -> List[str]:
        """Decodes a single string to a list of strings.
        """
        return list(s.split("jfgsdhjfbsdf"))


# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(strs))