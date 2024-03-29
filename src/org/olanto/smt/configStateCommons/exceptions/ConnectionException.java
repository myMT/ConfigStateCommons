/**********
    Copyright © 2010-2012 Olanto Foundation Geneva

   This file is part of myMT.

   myMT is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of
    the License, or (at your option) any later version.

    myMT is distributed in the hope that it will be useful, but
    WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
    See the GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with myMT.  If not, see <http://www.gnu.org/licenses/>.

**********/
package org.olanto.smt.configStateCommons.exceptions;

/**
 * Cette exception est utilisée pour indiquer qu'un service ou qu'un local master
 * n'a pas normalement répondu. La cause peut être un timeout sur une lecture
 * de flux, ou bien un problème de socket.
 */
public class ConnectionException extends Exception {

    public ConnectionException(String msg) {
        super(msg);
    }

}
