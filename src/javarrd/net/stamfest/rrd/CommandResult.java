/*

 Copyright (c) 2010 by Peter Stamfest <peter@stamfest.at>

 This file is part of java-rrd.

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.

 Except as contained in this notice, the name of Peter Stamfest shall not 
 be used in advertising or otherwise to promote the sale, use or other 
 dealings in this Software without prior written authorization from 
 Peter Stamfest.

*/


package javarrd.net.stamfest.rrd;

import java.util.HashMap;

public class CommandResult {
    float user;
    float system;
    float total;
    public boolean ok = false;
    public String error = null;
    public String output = null;
    
    // support for output from special commands
    public HashMap<String, String> info = null;  // info, graphv
    public byte image[] = null; // graphv
    
    public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append("ok:").append(ok).append('\n');
	sb.append("u:").append(user);
	sb.append(" s:").append(system);
	sb.append(" t:").append(total).append('\n');
	sb.append("message:").append(error).append('\n');
	sb.append("output:").append(output).append('\n');
	
	return sb.toString();
    }
}