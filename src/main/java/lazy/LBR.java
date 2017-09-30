/*
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    aint with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */


/*
 *    LBR.java
 *    The naive Bayesian classifier provides a simple and effective approach to 
 *    classifier learning, but its attribute independence assumption is often 
 *    violated in the real world. Lazy Bayesian Rules selectively relaxes the 
 *    independence assumption, achieving lower error rates over a range of 
 *    learning tasks.  LBR defers processing to classification time, making it 
 *    a highly efficient and accurate classification algorithm when small
 *    numbers of objects are to be classified.
 */

package lazy;

import weka.classifiers.AbstractClassifier;
import weka.core.TechnicalInformation;
import weka.core.TechnicalInformationHandler;

public class LBR 
  extends AbstractClassifier
  implements TechnicalInformationHandler {

  public static void main(String [] argv) {
    runClassifier(new LBR(), argv);
  }
}
