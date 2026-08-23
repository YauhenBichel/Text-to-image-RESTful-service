# Contributing

Thanks for taking the time to contribute. This project is a REST API that generates images from a text prompt using Stable Diffusion,
and contributions of every size are welcome — a typo fix counts.

## Ways to help

- **Report a bug** — open an issue using the bug report template. A reproduction beats a description.
- **Suggest a feature** — open an issue and describe the problem you are trying to solve, not only the solution you have in mind.
- **Improve the docs** — unclear setup steps are a bug. Say so.
- **Pick up a `good first issue`** — these are scoped small on purpose. Comment on the issue to claim it, so two people do not do the same work.

## Getting set up

```bash
./gradlew build     # compile and test
./gradlew bootRun   # run locally
```

## Making a change

1. Fork the repository and create a branch off `master`: `git checkout -b fix/short-description`
2. Make your change. Keep it focused — one concern per pull request is much easier to review than five.
3. Match the style of the surrounding code rather than reformatting whole files.
4. Make sure the project still builds, and add or update tests where it makes sense.
5. Write a commit message that says *why*, not only *what*.
6. Open a pull request and fill in the template.

## What happens next

I read every pull request. If something needs changing I will say what and why; if I disagree with an
approach I will explain rather than close it silently. If a pull request has been sitting for more
than a week, a nudge in the thread is entirely reasonable.

## Ground rules

Be decent to each other — see [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md). Never commit credentials,
API keys or `.env` files; if you spot one in the history, see [SECURITY.md](SECURITY.md).

By contributing you agree that your work is licensed under the [MIT Licence](LICENSE).
