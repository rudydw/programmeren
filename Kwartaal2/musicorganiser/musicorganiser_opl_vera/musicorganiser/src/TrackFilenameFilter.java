import java.io.File;
import java.io.FilenameFilter;

public class TrackFilenameFilter implements FilenameFilter {
    private String suffix;

    public TrackFilenameFilter(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(suffix);
    }
}
