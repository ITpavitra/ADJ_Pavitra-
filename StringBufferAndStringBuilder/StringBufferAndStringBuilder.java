package A1;

public class StringBufferAndStringBuilder {
	
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String text = "AIET";

	        // Test with StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startTimeSBuff = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(text);
	        }

	        long endTimeSBuff = System.nanoTime();
	        long durationSBuff = endTimeSBuff - startTimeSBuff;
	        System.out.println("Time taken by StringBuffer: " + durationSBuff + " nanoseconds");

	        // Test with StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startTimeSBuild = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(text);
	        }

	        long endTimeSBuild = System.nanoTime();
	        long durationSBuild = endTimeSBuild - startTimeSBuild;
	        System.out.println("Time taken by StringBuilder: " + durationSBuild + " nanoseconds");

	        // Comparison
	        if (durationSBuff > durationSBuild) {
	            System.out.println("StringBuilder is faster.");
	        } else if (durationSBuff < durationSBuild) {
	            System.out.println("StringBuffer is faster.");
	        } else {
	            System.out.println("Both took the same time.");
	        }
	    }}

	
