package com.farmsplan.ocrcamera.settings;


public final class Size {
    private final int zane;
    private final int zanf;

    public Size(int var1, int var2) {
        this.zane = var1;
        this.zanf = var2;
    }

    public final int getWidth() {
        return this.zane;
    }

    public final int getHeight() {
        return this.zanf;
    }

    public final boolean equals(Object var1) {
        if (var1 == null) {
            return false;
        } else if (this == var1) {
            return true;
        } else if (var1 instanceof Size) {
            Size var2 = (Size)var1;
            return this.zane == var2.zane && this.zanf == var2.zanf;
        } else {
            return false;
        }
    }

    public final String toString() {
        int var1 = this.zane;
        int var2 = this.zanf;
        return (new StringBuilder(23)).append(var1).append("x").append(var2).toString();
    }

    private static NumberFormatException zah(String var0) {
        throw new NumberFormatException((new StringBuilder(16 + String.valueOf(var0).length())).append("Invalid Size: \"").append(var0).append("\"").toString());
    }

    public static Size parseSize(String var0) throws NumberFormatException {
        if (var0 == null) {
            throw new IllegalArgumentException("string must not be null");
        } else {
            int var1;
            if ((var1 = var0.indexOf(42)) < 0) {
                var1 = var0.indexOf(120);
            }

            if (var1 < 0) {
                throw zah(var0);
            } else {
                try {
                    return new Size(Integer.parseInt(var0.substring(0, var1)), Integer.parseInt(var0.substring(var1 + 1)));
                } catch (NumberFormatException var2) {
                    throw zah(var0);
                }
            }
        }
    }

    public final int hashCode() {
        return this.zanf ^ (this.zane << 16 | this.zane >>> 16);
    }
}
