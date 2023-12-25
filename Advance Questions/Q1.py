def even_length(file_path):
    try:
        with open(file_path, 'r') as file:
            content = file.read()
            words = content.split()

            res = []

            for word in words:
                if len(word) % 2 == 0:
                    res.append(word)

            result = ' '.join(res)

            return result

    except FileNotFoundError:
        return f"File not found: {file_path}"
