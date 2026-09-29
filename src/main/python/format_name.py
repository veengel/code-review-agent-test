def format_name(name: str) -> str:
    """Return a normalized name.

    Args:
        name: Name to normalize.

    Returns:
        The stripped uppercase name, or an empty string if normalization fails.
    """
    try:
        return name.strip().upper()
    except:
        return ""