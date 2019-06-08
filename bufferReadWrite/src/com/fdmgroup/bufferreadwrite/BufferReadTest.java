package com.fdmgroup.bufferreadwrite;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BufferReadTest {

	
	@Mock
	private BufferRead target;
	
	@Mock
	private List<String> mockLines;
	
	@Test
	public void test_readWholeFileAsList_addsLinesintoListofArrayList() {
		
		String filename = "abc.txt";
		List<String> readWholeFileAsList = target.readWholeFileAsList(filename);
		String line ="mockLine";
//		when(target.readWholeFileAsList(filename)).then(mockLines.add(line));
//		when(target.readWholeFileAsList(filename)).thenReturn(mockLines.add(line));
		verify(mockLines, times(1)).add(line);
		
		
	}
}
