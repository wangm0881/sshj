/**
 * Copyright 2009 sshj contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.schmizz.sshj.transport.cipher;

/** {@code aes128-ctr} cipher */
public class AES128CTR
        extends BaseCipher {

    /** Named factory for AES128CBC Cipher */
    public static class Factory
            implements net.schmizz.sshj.common.Factory.Named<Cipher> {

        @Override
        public Cipher create() {
            return new AES128CTR();
        }

        @Override
        public String getName() {
            return "aes128-ctr";
        }
    }

    public AES128CTR() {
        super(16, 16, "AES", "AES/CTR/NoPadding");
    }

}
