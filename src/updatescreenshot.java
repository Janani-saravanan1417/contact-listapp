public static String capture(WebDriver driver, String testName) {
    TakesScreenshot ts = (TakesScreenshot) driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    String path = "test-output/screenshots/" + testName + "_" + System.currentTimeMillis() + ".png";
    File dest = new File(path);
    try {
        FileUtils.copyFile(src, dest);
        return dest.getAbsolutePath();
    } catch (IOException e) {
        e.printStackTrace();
        return null;
    }
}
