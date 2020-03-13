class StaticInitializationBeforeDeclaration {
	static {
		String var2 = var1;//You get Error: Cannot reference a field before it is defined
	}

	static {
		var1 = "Value1";
	}
	public static final String var1;
}
