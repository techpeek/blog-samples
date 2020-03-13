class StaticInitializationBeforeAssignment {
	public static final String var1;
	static {
		String var2 = var1;//You get Error: The blank final field var1 may not have been initialized
	}
	static { 
		var1 = "Value1";
	}
}
