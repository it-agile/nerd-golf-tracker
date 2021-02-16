package de.itagile.golf.operation;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.verification.VerificationMode;

import de.itagile.golf.EinfacheScorecard;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class MultiOperationTest {

	private Scorecard scorecardMock;
	private MultiOperation multiOp;
	
	@Before
	public void setUp() {
		scorecardMock = mock(Scorecard.class);
		multiOp = new MultiOperation();
	}

	@Test
	public void executesOneOperationOnScorecard() throws Exception {
		Operation operationMock = mock(Operation.class);
		multiOp.add(operationMock);
		
		multiOp.fuehreAus(scorecardMock);
		
		verify(operationMock).fuehreAus(scorecardMock);
	}
	
	@Test
	public void executesTwoOperationsOnScorecard() throws Exception {
		Operation operation1 = mock(Operation.class);
		Operation operation2 = mock(Operation.class);
		multiOp.add(operation1);
		multiOp.add(operation2);
		
		multiOp.fuehreAus(scorecardMock);
		
		verify(operation1).fuehreAus(scorecardMock);
		verify(operation2).fuehreAus(scorecardMock);
	}
	
	@Test
	public void concatinatesResultOfOperations() throws Exception {
		Operation operation1 = mock(Operation.class);
		Operation operation2 = mock(Operation.class);
		Mockito.when(operation1.fuehreAus(scorecardMock)).thenReturn("Hallo1");
		Mockito.when(operation2.fuehreAus(scorecardMock)).thenReturn("Hallo2");
		
		multiOp.add(operation1);
		multiOp.add(operation2);
		
		Assert.assertThat(multiOp.fuehreAus(scorecardMock), CoreMatchers.is("Hallo1Hallo2"));
		
		
	}

}
