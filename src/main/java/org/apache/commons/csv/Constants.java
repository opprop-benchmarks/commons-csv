/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.csv;

import org.checkerframework.common.value.qual.IntVal;

/**
 * Constants for this package.
 */
final class Constants {

    static final @IntVal(92) char BACKSLASH = '\\';

    static final @IntVal(8) char BACKSPACE = '\b';

    static final @IntVal(44) char COMMA = ',';

    /**
     * Starts a comment, the remainder of the line is the comment.
     */
    static final @IntVal(35) char COMMENT = '#';

    static final @IntVal(13) char CR = '\r';

    /** RFC 4180 defines line breaks as CRLF */
    static final String CRLF = "\r\n";

    static final Character DOUBLE_QUOTE_CHAR = Character.valueOf('"');

    static final String EMPTY = "";

    /** The end of stream symbol */
    static final @IntVal(-1) int END_OF_STREAM = -1;

    static final @IntVal(12) char FF = '\f';

    static final @IntVal(10) char LF = '\n';

    /**
     * Unicode line separator.
     */
    static final String LINE_SEPARATOR = "\u2028";

    /**
     * Unicode next line.
     */
    static final String NEXT_LINE = "\u0085";

    /**
     * Unicode paragraph separator.
     */
    static final String PARAGRAPH_SEPARATOR = "\u2029";

    static final @IntVal(124) char PIPE = '|';

    /** ASCII record separator */
    static final @IntVal(30) char RS = 30;

    static final @IntVal(32) char SP = ' ';

    static final @IntVal(9) char TAB = '\t';

    /** Undefined state for the lookahead char */
    static final @IntVal(-2) int UNDEFINED = -2;

    /** ASCII unit separator */
    static final @IntVal(31) char US = 31;

}
