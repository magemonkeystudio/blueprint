/*
 * JNBT License
 *
 * Copyright (c) 2024 MageMonkeyStudio
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *
 *     * Neither the name of the JNBT team nor the names of its
 *       contributors may be used to endorse or promote products derived from
 *       this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package studio.magemonkey.blueprint.nbt;

import java.util.List;

/**
 * The {@code TAG_Int_Array} tag.
 */
public final class IntArrayTag extends Tag {

    private final int[] value;

    /**
     * Creates the tag with an empty name.
     *
     * @param value the value of the tag
     */
    public IntArrayTag(int[] value) {
        super();
        this.value = value;
    }

    public IntArrayTag(List<Integer> value) {
        super();
        this.value = toArray(value);
    }

    @Override
    public int[] getValue() {
        return value;
    }

    @Override
    public int getTypeId() {
        return 11;
    }

    public int[] toArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    @Override
    public String asString() {
        StringBuilder stringbuilder = new StringBuilder("[I;");
        for (int i2 = 0; i2 < this.value.length; ++i2) {
            if (i2 != 0) {
                stringbuilder.append(',');
            }
            stringbuilder.append(this.value[i2]);
        }
        return stringbuilder.append(']').toString();
    }


    @Override
    public String toString() {
        StringBuilder hex = new StringBuilder();
        for (int b : value) {
            String hexDigits = Integer.toHexString(b).toUpperCase();
            if (hexDigits.length() == 1) {
                hex.append("0");
            }
            hex.append(hexDigits).append(" ");
        }
        return "TAG_Int_Array(" + hex + ")";
    }

}
