/* -*- mode: java; c-basic-offset: 4; tab-width: 4; indent-tabs-mode: nil -*- */
/*
 * Copyright 2013 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.sbe;

import uk.co.real_logic.sbe.xml.MessageSchema;
import uk.co.real_logic.sbe.xml.XmlSchemaParser;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * A tool for running the SBE parser, validator, and code generator
 *<p>
 * Usage:
 * <code>
 *  <pre>
 *  $ java -cp sbe.jar uk.co.real_logic.sbe.SbeTool &lt;filename.xml&gt;
 *  $ java -cp sbe.jar -Doption=value uk.co.real_logic.sbe.SbeTool &lt;filename.xml&gt;
 *  </pre>
 * </code>
 *<p>
 * Properties
 * <ul>
 *  <li><code>sbe.validate</code>: Validate or not</li>
 *  <li><code>sbe.validate.xsd</code>: Use XSD to validate or not</li>
 *  <li><code>sbe.generate</code>: Generate or not</li>
 * </ul>
 */
public class SbeTool
{
    public static void main(final String[] args) throws Exception
    {
        if (args.length < 1)
        {
            System.err.format("Usage: %s <filenames>\n", SbeTool.class.getName());
        }

        for (final String filename : args)
        {
            MessageSchema schema = XmlSchemaParser.parse(new BufferedInputStream(new FileInputStream(filename)));

        }
    }
}