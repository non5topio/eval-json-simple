package org.json.simple;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import junit.framework.TestCase;

public class JSONArrayTest extends TestCase {

	public void testJSONArray() {
		final JSONArray jsonArray = new JSONArray();
		
		assertEquals("[]", jsonArray.toJSONString());
	}

	public void testJSONArrayCollection() {
		final ArrayList testList = new ArrayList();
		testList.add("First item");
		testList.add("Second item");
		
		final JSONArray jsonArray = new JSONArray(testList);
		
		assertEquals("[\"First item\",\"Second item\"]", jsonArray.toJSONString());
	}

	public void testWriteJSONStringCollectionWriter() throws IOException, ParseException {
		final HashSet testSet = new HashSet();
		testSet.add("First item");
		testSet.add("Second item");
		
		final JSONArray jsonArray = new JSONArray(testSet);
		final StringWriter writer = new StringWriter();
		
		jsonArray.writeJSONString(writer);
		
		final JSONParser parser = new JSONParser();
		final JSONArray parsedArray = (JSONArray)parser.parse(writer.toString());
		
		assertTrue(parsedArray.containsAll(jsonArray));
		assertTrue(jsonArray.containsAll(parsedArray));
		assertEquals(2, jsonArray.size());
	}

	public void testToJSONStringCollection() throws ParseException {
		final HashSet testSet = new HashSet();
		testSet.add("First item");
		testSet.add("Second item");
		
		final JSONArray jsonArray = new JSONArray(testSet);
		
		final JSONParser parser = new JSONParser();
		final JSONArray parsedArray = (JSONArray)parser.parse(jsonArray.toJSONString());
		
		assertTrue(parsedArray.containsAll(jsonArray));
		assertTrue(jsonArray.containsAll(parsedArray));
		assertEquals(2, jsonArray.size());
	}

	public void testByteArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((byte[])null));
		assertEquals("[]", JSONArray.toJSONString(new byte[0]));
		assertEquals("[12]", JSONArray.toJSONString(new byte[] { 12 }));
		assertEquals("[-7,22,86,-99]", JSONArray.toJSONString(new byte[] { -7, 22, 86, -99 }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((byte[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new byte[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new byte[] { 12 }, writer);
		assertEquals("[12]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new byte[] { -7, 22, 86, -99 }, writer);
		assertEquals("[-7,22,86,-99]", writer.toString());
	}
	
	public void testShortArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((short[])null));
		assertEquals("[]", JSONArray.toJSONString(new short[0]));
		assertEquals("[12]", JSONArray.toJSONString(new short[] { 12 }));
		assertEquals("[-7,22,86,-99]", JSONArray.toJSONString(new short[] { -7, 22, 86, -99 }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((short[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new short[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new short[] { 12 }, writer);
		assertEquals("[12]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new short[] { -7, 22, 86, -99 }, writer);
		assertEquals("[-7,22,86,-99]", writer.toString());
	}
	
	public void testIntArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((int[])null));
		assertEquals("[]", JSONArray.toJSONString(new int[0]));
		assertEquals("[12]", JSONArray.toJSONString(new int[] { 12 }));
		assertEquals("[-7,22,86,-99]", JSONArray.toJSONString(new int[] { -7, 22, 86, -99 }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((int[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new int[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new int[] { 12 }, writer);
		assertEquals("[12]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new int[] { -7, 22, 86, -99 }, writer);
		assertEquals("[-7,22,86,-99]", writer.toString());
	}
	
	public void testLongArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((long[])null));
		assertEquals("[]", JSONArray.toJSONString(new long[0]));
		assertEquals("[12]", JSONArray.toJSONString(new long[] { 12 }));
		assertEquals("[-7,22,9223372036854775807,-99]", JSONArray.toJSONString(new long[] { -7, 22, 9223372036854775807L, -99 }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((long[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new long[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new long[] { 12 }, writer);
		assertEquals("[12]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new long[] { -7, 22, 86, -99 }, writer);
		assertEquals("[-7,22,86,-99]", writer.toString());
	}
	
	public void testFloatArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((float[])null));
		assertEquals("[]", JSONArray.toJSONString(new float[0]));
		assertEquals("[12.8]", JSONArray.toJSONString(new float[] { 12.8f }));
		assertEquals("[-7.1,22.234,86.7,-99.02]", JSONArray.toJSONString(new float[] { -7.1f, 22.234f, 86.7f, -99.02f }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((float[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new float[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new float[] { 12.8f }, writer);
		assertEquals("[12.8]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new float[] { -7.1f, 22.234f, 86.7f, -99.02f }, writer);
		assertEquals("[-7.1,22.234,86.7,-99.02]", writer.toString());
	}
	
	public void testDoubleArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((double[])null));
		assertEquals("[]", JSONArray.toJSONString(new double[0]));
		assertEquals("[12.8]", JSONArray.toJSONString(new double[] { 12.8 }));
		assertEquals("[-7.1,22.234,86.7,-99.02]", JSONArray.toJSONString(new double[] { -7.1, 22.234, 86.7, -99.02 }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((double[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new double[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new double[] { 12.8 }, writer);
		assertEquals("[12.8]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new double[] { -7.1, 22.234, 86.7, -99.02 }, writer);
		assertEquals("[-7.1,22.234,86.7,-99.02]", writer.toString());
	}
	
	public void testBooleanArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((boolean[])null));
		assertEquals("[]", JSONArray.toJSONString(new boolean[0]));
		assertEquals("[true]", JSONArray.toJSONString(new boolean[] { true }));
		assertEquals("[true,false,true]", JSONArray.toJSONString(new boolean[] { true, false, true }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((boolean[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new boolean[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new boolean[] { true }, writer);
		assertEquals("[true]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new boolean[] { true, false, true }, writer);
		assertEquals("[true,false,true]", writer.toString());
	}
	
	public void testCharArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((char[])null));
		assertEquals("[]", JSONArray.toJSONString(new char[0]));
		assertEquals("[\"a\"]", JSONArray.toJSONString(new char[] { 'a' }));
		assertEquals("[\"a\",\"b\",\"c\"]", JSONArray.toJSONString(new char[] { 'a', 'b', 'c' }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((char[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new char[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new char[] { 'a' }, writer);
		assertEquals("[\"a\"]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new char[] { 'a', 'b', 'c' }, writer);
		assertEquals("[\"a\",\"b\",\"c\"]", writer.toString());
	}
	
	public void testObjectArrayToString() throws IOException {
		assertEquals("null", JSONArray.toJSONString((Object[])null));
		assertEquals("[]", JSONArray.toJSONString(new Object[0]));
		assertEquals("[\"Hello\"]", JSONArray.toJSONString(new Object[] { "Hello" }));
		assertEquals("[\"Hello\",12,[1,2,3]]", JSONArray.toJSONString(new Object[] { "Hello", new Integer(12), new int[] { 1, 2, 3 } }));
		
		StringWriter writer;
		
		writer = new StringWriter();
		JSONArray.writeJSONString((Object[])null, writer);
		assertEquals("null", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new Object[0], writer);
		assertEquals("[]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new Object[] { "Hello" }, writer);
		assertEquals("[\"Hello\"]", writer.toString());
		
		writer = new StringWriter();
		JSONArray.writeJSONString(new Object[] { "Hello", new Integer(12), new int[] { 1, 2, 3} }, writer);
		assertEquals("[\"Hello\",12,[1,2,3]]", writer.toString());
	}

 public void test_json_array_arraylist_inheritance() {
     // Create a JSONArray and use ArrayList methods
     JSONArray jsonArray = new JSONArray();
     
     // Test add, size, get
     jsonArray.add("element1");
     jsonArray.add(42);
     assertEquals(2, jsonArray.size());
     assertEquals("element1", jsonArray.get(0));
     assertEquals(42, jsonArray.get(1));
     
     // Test remove
     jsonArray.remove(0);
     assertEquals(1, jsonArray.size());
     assertEquals(42, jsonArray.get(0));
     
     // Test contains
     jsonArray.add("test");
     assertTrue(jsonArray.contains("test"));
     assertFalse(jsonArray.contains("nonexistent"));
     
     // Test clear
     jsonArray.clear();
     assertEquals(0, jsonArray.size());
     
     // Test addAll
     ArrayList<String> list = new ArrayList<String>();
     list.add("item1");
     list.add("item2");
     jsonArray.addAll(list);
     assertEquals(2, jsonArray.size());
     assertEquals("item1", jsonArray.get(0));
     
     // Ensure it still works as a JSONArray after ArrayList operations
     assertEquals("[\"item1\",\"item2\"]", jsonArray.toJSONString());
 }


 public void test_nested_json_structures() throws IOException {
     // Create a complex nested structure
     JSONObject innerObject = new JSONObject();
     innerObject.put("key1", "value1");
     innerObject.put("key2", 42);
     
     JSONArray innerArray = new JSONArray();
     innerArray.add(true);
     innerArray.add(false);
     
     JSONArray outerArray = new JSONArray();
     outerArray.add("string");
     outerArray.add(123);
     outerArray.add(innerObject);
     outerArray.add(innerArray);
     
     // Test toJSONString
     String result = outerArray.toJSONString();
     assertEquals("[\"string\",123,{\"key1\":\"value1\",\"key2\":42},[true,false]]", result);
     
     // Test writeJSONString with Object array
     Object[] complexArray = new Object[]{"string", 123, innerObject, innerArray};
     StringWriter writer = new StringWriter();
     JSONArray.writeJSONString(complexArray, writer);
     assertEquals("[\"string\",123,{\"key1\":\"value1\",\"key2\":42},[true,false]]", writer.toString());
 }


 public void test_null_elements_in_collections() throws IOException {
     // Test collection with null elements
     ArrayList<Object> listWithNulls = new ArrayList<Object>();
     listWithNulls.add("First");
     listWithNulls.add(null);
     listWithNulls.add("Last");
     
     // Test toJSONString
     String result = JSONArray.toJSONString(listWithNulls);
     assertEquals("[\"First\",null,\"Last\"]", result);
     
     // Test writeJSONString
     StringWriter writer = new StringWriter();
     JSONArray.writeJSONString(listWithNulls, writer);
     assertEquals("[\"First\",null,\"Last\"]", writer.toString());
     
     // Test with JSONArray containing nulls
     JSONArray jsonArray = new JSONArray();
     jsonArray.add("First");
     jsonArray.add(null);
     jsonArray.add("Last");
     
     assertEquals("[\"First\",null,\"Last\"]", jsonArray.toJSONString());
 }


 public void test_float_and_double_arrays_with_special_values() throws IOException {
     // Test float array with special values
     float[] specialFloats = {Float.NaN, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, 1.0f};
     String floatResult = JSONArray.toJSONString(specialFloats);
     assertEquals("[NaN,Infinity,-Infinity,1.0]", floatResult);
     
     // Test double array with special values
     double[] specialDoubles = {Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 1.0};
     String doubleResult = JSONArray.toJSONString(specialDoubles);
     assertEquals("[NaN,Infinity,-Infinity,1.0]", doubleResult);
     
     // Test writeJSONString for float array
     StringWriter floatWriter = new StringWriter();
     JSONArray.writeJSONString(specialFloats, floatWriter);
     assertEquals("[NaN,Infinity,-Infinity,1.0]", floatWriter.toString());
     
     // Test writeJSONString for double array
     StringWriter doubleWriter = new StringWriter();
     JSONArray.writeJSONString(specialDoubles, doubleWriter);
     assertEquals("[NaN,Infinity,-Infinity,1.0]", doubleWriter.toString());
 }


 public void test_extremely_large_collection() throws IOException {
     // Create a large collection with a reasonable size for unit testing
     // (Using 100,000 instead of millions to keep test execution time reasonable)
     final ArrayList<Integer> largeList = new ArrayList<Integer>();
     final int size = 100000;
     for (int i = 0; i < size; i++) {
         largeList.add(i);
     }
     
     // Test that we can write this to a StringWriter without issues
     final StringWriter writer = new StringWriter();
     JSONArray.writeJSONString(largeList, writer);
     
     // Verify the output starts and ends correctly
     String result = writer.toString();
     assertTrue(result.startsWith("[0,1,2,"));
     assertTrue(result.endsWith("]"));
     
     // Verify the length is as expected (each number plus comma)
     // The last element doesn't have a comma, so we subtract 1
     assertEquals(size * 2 - 1 + 2, result.length()); // numbers + commas + [ and ]
 }

}
