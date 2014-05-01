import org.checkerframework.checker.nullness.qual.*;

interface Function {

  @NonNull String apply(@Nullable String input);

}

class Trimmer implements Function {

  
  @Override
  public @Nullable String apply(String input) {
    return input.trim();
  }

}

